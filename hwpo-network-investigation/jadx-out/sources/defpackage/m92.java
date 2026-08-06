package defpackage;

import android.app.AlertDialog;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m92 {
    public final Object a;
    public final Object b;

    public m92(swb swbVar, AlertDialog alertDialog) {
        this.a = alertDialog;
        this.b = swbVar;
    }

    public void a() {
        String str = (String) this.a;
        try {
            ey3 ey3Var = (ey3) this.b;
            ey3Var.getClass();
            new File(ey3Var.c, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    public m92(String str, ey3 ey3Var) {
        this.a = str;
        this.b = ey3Var;
    }
}
