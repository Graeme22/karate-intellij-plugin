package dev.graemeholliday.plugin;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionManager;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.executors.DefaultRunExecutor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.ExecutionEnvironmentBuilder;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class KarateAction extends AnAction {

    @Override
    public void update(@NotNull AnActionEvent e) {
        PsiFile psiFile = e.getData(CommonDataKeys.PSI_FILE);
        if(psiFile == null)
            e.getPresentation().setEnabledAndVisible(false);
        else {
            boolean isKarate = psiFile.getFileType().equals(KarateFileType.INSTANCE);
            e.getPresentation().setEnabledAndVisible(isKarate);
        }
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        VirtualFile vFile = e.getData(PlatformDataKeys.VIRTUAL_FILE);
        if(vFile == null)  // should be unreachable
            return;
        KarateRunProfile krp = new KarateRunProfile(vFile.getPath());
        Executor executor = DefaultRunExecutor.getRunExecutorInstance();
        ExecutionEnvironment env;
        RunProfileState rps;
        try {
            Project project = e.getProject();
            assert(project != null);
            env = ExecutionEnvironmentBuilder.create(project, executor, krp).build();
            rps = krp.getState(executor, env);
        } catch (ExecutionException ex) {
            throw new RuntimeException(ex);
        }
        ExecutionManager.getInstance(e.getProject()).restartRunProfile(env);
    }

}
