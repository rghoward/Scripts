package defpackage;

import android.os.Build;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.attribute.FileAttribute;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n24 {
    public static xf2 a(wd9 wd9Var, un8 un8Var, o02 o02Var, mh4 mh4Var) {
        hf3 hf3Var = hf3.t;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new xf2(new xx3(wd9Var, new vy5(1, o02Var), mh4Var), ws0.h(new af2(hf3Var, null)), un8Var, o02Var);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new xf2(new xx3(wd9Var, new vx3(0), mh4Var), ws0.h(new af2(hf3Var, null)), un8Var, o02Var);
        }
    }

    public static void b(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && xj5.a(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            i34.c(parentFile, "Failed to delete conflicting file: ");
            return;
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            if (parentFile.mkdirs() || parentFile.isDirectory()) {
                return;
            }
            i34.c(parentFile, "Failed to create directory: ");
            return;
        }
        try {
            Files.createDirectories(FileRetargetClass.toPath(parentFile), new FileAttribute[0]);
        } catch (Exception e) {
            throw new IOException("Failed to create directory: " + parentFile, e);
        }
    }
}
