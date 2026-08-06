package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lnb {
    public static final e27 a;
    public static final jnb[] b;

    static {
        e27 e27Var = new e27(8);
        jnb.a.getClass();
        knb knbVar = jnb.a.g;
        e27Var.i(1, knbVar);
        knb knbVar2 = jnb.a.f;
        e27Var.i(2, knbVar2);
        knb knbVar3 = jnb.a.b;
        e27Var.i(4, knbVar3);
        knb knbVar4 = jnb.a.d;
        e27Var.i(8, knbVar4);
        knb knbVar5 = jnb.a.h;
        e27Var.i(16, knbVar5);
        knb knbVar6 = jnb.a.e;
        e27Var.i(32, knbVar6);
        knb knbVar7 = jnb.a.i;
        e27Var.i(64, knbVar7);
        knb knbVar8 = jnb.a.c;
        e27Var.i(128, knbVar8);
        a = e27Var;
        b = new jnb[]{knbVar, knbVar2, knbVar3, knbVar7, knbVar5, knbVar6, knbVar4, jnb.a.j, knbVar8};
    }

    public static final void a(wy8 wy8Var, yk8 yk8Var, long j, int i, int i2) {
        if (b64.b(j, -1L)) {
            return;
        }
        wy8Var.j1(yk8Var.b(), (int) ((j >>> 48) & 65535));
        wy8Var.j1(yk8Var.c(), (int) ((j >>> 32) & 65535));
        wy8Var.j1(yk8Var.d(), i - ((int) ((j >>> 16) & 65535)));
        wy8Var.j1(yk8Var.a(), i2 - ((int) (j & 65535)));
    }
}
