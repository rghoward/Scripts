package defpackage;

import gy3.b;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class vy3 extends j30 {
    public static void b(File file) {
        gy3.b bVar = new gy3(file).new b();
        while (true) {
            boolean z = true;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (next.delete() || !next.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return;
        }
    }

    public static File c(File file) {
        int iT;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        path.getClass();
        char c = File.separatorChar;
        int length = 0;
        int iT2 = z2a.t(path, c, 0, 4);
        if (iT2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (iT = z2a.t(path, c, 2, 4)) < 0) {
                length = 1;
            } else {
                int iT3 = z2a.t(path, c, iT + 1, 4);
                length = iT3 >= 0 ? iT3 + 1 : path.length();
            }
        } else if (iT2 > 0 && path.charAt(iT2 - 1) == ':') {
            length = iT2 + 1;
        } else if (iT2 == -1 && z2a.q(path, ':')) {
            length = path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        string.getClass();
        if (string.length() == 0 || z2a.q(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }
}
