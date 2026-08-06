package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cy3 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(File file, oh4 oh4Var, u02 u02Var) throws Throwable {
        by3 by3Var;
        if (u02Var instanceof by3) {
            by3Var = (by3) u02Var;
            int i = by3Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                by3Var.v = i - Integer.MIN_VALUE;
            } else {
                by3Var = new by3(u02Var);
            }
        } else {
            by3Var = new by3(u02Var);
        }
        Object obj = by3Var.u;
        int i2 = by3Var.v;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                File file2 = by3Var.t;
                dv8.b(obj);
                return obj;
            }
            dv8.b(obj);
            by3Var.t = file;
            by3Var.v = 1;
            Object objInvoke = oh4Var.invoke(by3Var);
            v72 v72Var = v72.t;
            return objInvoke == v72Var ? v72Var : objInvoke;
        } catch (IOException e) {
            if (e instanceof z72) {
                throw e;
            }
            file.getClass();
            if (!file.exists()) {
                throw pw3.b(file, e);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw pw3.b(file, e);
                    }
                    throw pw3.b(file, e);
                }
                if (file.canWrite()) {
                    throw pw3.b(file, e);
                }
                throw pw3.b(file, e);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw pw3.b(file, e);
                }
                throw pw3.b(file, e);
            }
            if (file.canWrite()) {
                throw pw3.b(file, e);
            }
            throw pw3.b(file, e);
        }
    }
}
