package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w8d extends x8d {
    public int e = 0;
    public final String b = "com/google/android/libraries/phenotype/client/Phlogger";
    public final String c = "logInternal";
    public final String d = "Phlogger.java";

    @Override // defpackage.x8d
    public final String a() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.x8d
    public final String b() {
        return this.c;
    }

    @Override // defpackage.x8d
    public final int c() {
        return 44;
    }

    @Override // defpackage.x8d
    public final String d() {
        char c = File.separatorChar;
        String str = this.d;
        return str.substring(str.lastIndexOf(c) + 1);
    }

    @Override // defpackage.x8d
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w8d) {
            w8d w8dVar = (w8d) obj;
            if (this.c.equals(w8dVar.c)) {
                String str = w8dVar.b;
                String str2 = this.b;
                if (str2 != str) {
                    if (str2.length() == str.length()) {
                        for (int i = 0; i < str2.length(); i++) {
                            char cCharAt = str2.charAt(i);
                            char cCharAt2 = str.charAt(i);
                            if (cCharAt == cCharAt2 || ((cCharAt & (-2)) == 46 && (cCharAt ^ cCharAt2) == 1)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.c.hashCode() + 4867) * 31) + 44;
        this.e = iHashCode;
        return iHashCode;
    }
}
