package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gd5 implements yk8 {
    public final yk8[] a;
    public final ieb b;
    public final j15 c;
    public final ieb d;
    public final j15 e;

    public gd5(yk8[] yk8VarArr) {
        this.a = yk8VarArr;
        int length = yk8VarArr.length;
        ieb[] iebVarArr = new ieb[length];
        for (int i = 0; i < length; i++) {
            iebVarArr[i] = this.a[i].b();
        }
        this.b = new ieb(new geb(iebVarArr));
        int length2 = this.a.length;
        j15[] j15VarArr = new j15[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            j15VarArr[i2] = this.a[i2].c();
        }
        this.c = new j15(new h15(j15VarArr));
        int length3 = this.a.length;
        ieb[] iebVarArr2 = new ieb[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            iebVarArr2[i3] = this.a[i3].d();
        }
        this.d = new ieb(new heb(iebVarArr2));
        int length4 = this.a.length;
        j15[] j15VarArr2 = new j15[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            j15VarArr2[i4] = this.a[i4].a();
        }
        this.e = new j15(new i15(j15VarArr2));
    }

    @Override // defpackage.yk8
    public final j15 a() {
        return this.e;
    }

    @Override // defpackage.yk8
    public final ieb b() {
        return this.b;
    }

    @Override // defpackage.yk8
    public final j15 c() {
        return this.c;
    }

    @Override // defpackage.yk8
    public final ieb d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "innermostOf(");
        int i = 0;
        for (yk8 yk8Var : this.a) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            r2a.a(sb, yk8Var, null);
        }
        sb.append((CharSequence) ")");
        return sb.toString();
    }
}
