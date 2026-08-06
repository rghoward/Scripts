package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pw3 {
    public static IOException a(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException b(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return a(file, iOException);
        }
        if (!parentFile.exists()) {
            return a(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? a(file, iOException) : a(file, iOException);
            }
            return parentFile.canWrite() ? a(file, iOException) : a(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? a(file, iOException) : a(file, iOException);
        }
        return parentFile.canWrite() ? a(file, iOException) : a(file, iOException);
    }

    public static ox6 c(ox6 ox6Var, float f, jl9 jl9Var, long j, long j2, int i) {
        boolean z = false;
        if ((i & 4) != 0 && y43.a(f, 0.0f) > 0) {
            z = true;
        }
        return (y43.a(f, 0.0f) > 0 || z) ? ox6Var.H(new gl9(f, jl9Var, z, (i & 8) != 0 ? so4.a : j, (i & 16) != 0 ? so4.a : j2)) : ox6Var;
    }
}
