package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bf0 extends z0a.b {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public bf0(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.a = i;
        if (str == null) {
            ac4.c("Null model");
            throw null;
        }
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        if (str2 == null) {
            ac4.c("Null manufacturer");
            throw null;
        }
        this.h = str2;
        if (str3 != null) {
            this.i = str3;
        } else {
            ac4.c("Null modelClass");
            throw null;
        }
    }

    @Override // z0a.b
    public final int a() {
        return this.a;
    }

    @Override // z0a.b
    public final int b() {
        return this.c;
    }

    @Override // z0a.b
    public final long c() {
        return this.e;
    }

    @Override // z0a.b
    public final boolean d() {
        return this.f;
    }

    @Override // z0a.b
    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0a.b)) {
            return false;
        }
        z0a.b bVar = (z0a.b) obj;
        return this.a == bVar.a() && this.b.equals(bVar.f()) && this.c == bVar.b() && this.d == bVar.i() && this.e == bVar.c() && this.f == bVar.d() && this.g == bVar.h() && this.h.equals(bVar.e()) && this.i.equals(bVar.g());
    }

    @Override // z0a.b
    public final String f() {
        return this.b;
    }

    @Override // z0a.b
    public final String g() {
        return this.i;
    }

    @Override // z0a.b
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.i.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    @Override // z0a.b
    public final long i() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", availableProcessors=");
        sb.append(this.c);
        sb.append(", totalRam=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", isEmulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return av.a(sb, this.i, "}");
    }
}
