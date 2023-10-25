package dev.graemeholliday.plugin;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.CommandLineState;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessHandlerFactory;
import com.intellij.execution.process.ProcessTerminatedListener;
import com.intellij.execution.runners.ExecutionEnvironment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class KarateRunProfile implements RunProfile {

    private final String filePath;
    private static final String jarPath = "C:\\Users\\gholl\\IdeaProjects\\plugin\\lib\\karate-1.4.0.jar";

    public KarateRunProfile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public @Nullable RunProfileState getState(@NotNull Executor executor,
          @NotNull ExecutionEnvironment environment) throws ExecutionException {
        return new CommandLineState(environment) {
            @NotNull
            @Override
            protected ProcessHandler startProcess() throws ExecutionException {
                List<String> params = new ArrayList<>();
                params.add("-jar");
                params.add(jarPath);
                params.add(filePath);
                GeneralCommandLine commandLine = new GeneralCommandLine("java").withParameters(params);
                OSProcessHandler processHandler = ProcessHandlerFactory.getInstance()
                    .createColoredProcessHandler(commandLine);
                ProcessTerminatedListener.attach(processHandler);
                return processHandler;
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Run Karate Scenario";
    }

    @Override
    public @Nullable Icon getIcon() {
        return KarateIcons.KARATE_ICON;
    }
}
