package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

public class ModelView {
    private String viewNames;
    private Map<String, Object> model = new HashMap<>();


    public ModelView(String viewNames) {
        this.viewNames = viewNames;
    }

    public String getViewNames() {
        return viewNames;
    }

    public void setViewNames(String viewNames) {
        this.viewNames = viewNames;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
