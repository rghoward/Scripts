package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cf0 extends z0a.c {
    public final String a;
    public final String b;
    public final boolean c;

    public cf0(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            ac4.c("Null osRelease");
            throw null;
        }
        this.a = str;
        if (str2 == null) {
            ac4.c("Null osCodeName");
            throw null;
        }
        this.b = str2;
        this.c = z;
    }

    @Override // z0a.c
    public final boolean a() {
        return this.c;
    }

    @Override // z0a.c
    public final String b() {
        return this.b;
    }

    @Override // z0a.c
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0a.c)) {
            return false;
        }
        z0a.c cVar = (z0a.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public final int hashCode() {
        return (this.c ? 1231 : 1237) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.a);
        sb.append(", osCodeName=");
        sb.append(this.b);
        sb.append(", isRooted=");
        return fz.c(sb, this.c, "}");
    }
}
