package pollub.ism.lab07;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {StorageItem.class}, version = StorageManagement.VERSION, exportSchema = false)
public abstract class StorageManagement extends RoomDatabase {

    public static final String DB_NAME = "Stoisko z warzywami";
    public static final int VERSION= 1;

    public abstract StorageItemDAO storageItemDAO();
}
