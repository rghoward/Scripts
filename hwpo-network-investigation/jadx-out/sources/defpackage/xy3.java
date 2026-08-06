package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xy3 {
    public final Context a;

    public xy3(Context context, k55 k55Var) {
        this.a = context;
    }

    public final File a() {
        String str = Environment.DIRECTORY_DCIM;
        Context context = this.a;
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir == null && (externalFilesDir = context.getFilesDir()) == null) {
            ru3.d("No available storages");
            return null;
        }
        File file = new File(externalFilesDir, "hwpo_files");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File b() {
        Context context = this.a;
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null && (externalFilesDir = context.getFilesDir()) == null) {
            ru3.d("No available storages");
            return null;
        }
        File file = new File(externalFilesDir, "hwpo_files");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
