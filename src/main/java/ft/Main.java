package ft;

import java.nio.file.Files;
import java.nio.file.Paths;

// Normally using * with imports is a bad practice, however in this case it makes experimenting with
// Fluo easier.
import org.apache.fluo.api.client.*;
import org.apache.fluo.api.config.*;
import org.apache.fluo.api.data.*;
import org.apache.fluo.api.mini.MiniFluo;
import org.apache.fluo.api.observer.*;

public class Main {
  public static void main(String[] args) throws Exception {

    String tmpDir = Files.createTempDirectory(Paths.get("target"), "mini").toString();
    // System.out.println("tmp dir : "+tmpDir);

    FluoConfiguration fluoConfig = new FluoConfiguration();
    fluoConfig.setApplicationName("class");
    fluoConfig.setMiniDataDir(tmpDir);

    preInit(fluoConfig);

    System.out.print("Starting MiniFluo ... ");

    try (MiniFluo mini = FluoFactory.newMiniFluo(fluoConfig);
        FluoClient client = FluoFactory.newClient(mini.getClientConfiguration())) {

      System.out.println("started.");

      excercise(mini, client);
    }
  }

  private static void preInit(FluoConfiguration fluoConfig) {
    //this method does not need to be changed for earlier excercises in tour
  }

  private static void excercise(MiniFluo mini, FluoClient client) {
    //TODO Do all Fluo Tour excercises
  }
}