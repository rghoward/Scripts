package defpackage;

import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m5d {
    public static IOException a(j2d j2dVar, Uri uri, IOException iOException, String str) {
        try {
            i3d i3dVar = new i3d();
            i3dVar.a = true;
            File file = (File) j2dVar.a(uri, i3dVar);
            if (!file.exists()) {
                return b(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? b(file, iOException, str) : b(file, iOException, str);
                }
                return file.canWrite() ? b(file, iOException, str) : b(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? b(file, iOException, str) : b(file, iOException, str);
            }
            return file.canWrite() ? b(file, iOException, str) : b(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static IOException b(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return c(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return c(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? c(file, iOException, str) : c(file, iOException, str);
            }
            return parentFile.canWrite() ? c(file, iOException, str) : c(file, iOException, str);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? c(file, iOException, str) : c(file, iOException, str);
        }
        return parentFile.canWrite() ? c(file, iOException, str) : c(file, iOException, str);
    }

    public static IOException c(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            strConcat = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb2 = new StringBuilder(strConcat.length() + str3.length());
                sb2.append(strConcat);
                sb2.append(str3);
                strConcat = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }
}
