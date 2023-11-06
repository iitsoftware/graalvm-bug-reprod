import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.util.List;

public class ListEngines {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        List<ScriptEngineFactory> factories = manager.getEngineFactories();
        for (int i = 0; i < factories.size(); i++) {
            System.out.println("name=" + factories.get(i).getEngineName() +
                    ", version=" + factories.get(i).getEngineVersion() + ", language name=" + factories.get(i).getLanguageName() +
                    ", language version=" + factories.get(i).getLanguageVersion() +
                    ", names=" + factories.get(i).getNames());
        }

    }
}
