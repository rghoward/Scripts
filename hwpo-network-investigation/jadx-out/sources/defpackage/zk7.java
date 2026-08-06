package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zk7 {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final br9 d;
    public final s39 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final nu4 j;
    public final l8a k;
    public final ys7 l;
    public final v01 m;
    public final v01 n;
    public final v01 o;

    public zk7(Context context, Bitmap.Config config, ColorSpace colorSpace, br9 br9Var, s39 s39Var, boolean z, boolean z2, boolean z3, String str, nu4 nu4Var, l8a l8aVar, ys7 ys7Var, v01 v01Var, v01 v01Var2, v01 v01Var3) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = br9Var;
        this.e = s39Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = nu4Var;
        this.k = l8aVar;
        this.l = ys7Var;
        this.m = v01Var;
        this.n = v01Var2;
        this.o = v01Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk7)) {
            return false;
        }
        zk7 zk7Var = (zk7) obj;
        if (xj5.a(this.a, zk7Var.a) && this.b == zk7Var.b) {
            return (Build.VERSION.SDK_INT < 26 || xj5.a(this.c, zk7Var.c)) && xj5.a(this.d, zk7Var.d) && this.e == zk7Var.e && this.f == zk7Var.f && this.g == zk7Var.g && this.h == zk7Var.h && xj5.a(this.i, zk7Var.i) && xj5.a(this.j, zk7Var.j) && xj5.a(this.k, zk7Var.k) && xj5.a(this.l, zk7Var.l) && this.m == zk7Var.m && this.n == zk7Var.n && this.o == zk7Var.o;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.c;
        int iA = uo2.a(uo2.a(uo2.a((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, this.f, 31), this.g, 31), this.h, 31);
        String str = this.i;
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.t.hashCode() + ((this.k.a.hashCode() + ((((iA + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.j.t)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
