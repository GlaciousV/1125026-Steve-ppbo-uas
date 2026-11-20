package models;

import java.util.List;

public abstract class GObjectForm<T extends GObject> {
    List<GObject>  storage;

    public GObjectForm(List<GObject> storage) {
        this.storage = storage;
    }

    public T showInsertForm (){
        return  null;
    }
    protected  abstract String[] getFields () {
        return 
    }

    
    
}
