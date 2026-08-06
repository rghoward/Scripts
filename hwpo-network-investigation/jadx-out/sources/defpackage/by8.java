package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class by8 extends f41 {
    @Override // defpackage.f41
    public final void b(rl9 rl9Var, float f, float f2) {
        float f3 = f2 * f;
        rl9Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        rl9.c cVar = new rl9.c(0.0f, 0.0f, f4, f4);
        cVar.f = 180.0f;
        cVar.g = 90.0f;
        rl9Var.f.add(cVar);
        rl9.a aVar = new rl9.a(cVar);
        float f5 = 180.0f + 90.0f;
        boolean z = 90.0f < 0.0f;
        float f6 = z ? (180.0f + 180.0f) % 360.0f : 180.0f;
        float f7 = z ? (180.0f + f5) % 360.0f : f5;
        rl9Var.a(f6);
        rl9Var.g.add(aVar);
        rl9Var.d = f7;
        double d = f5;
        rl9Var.b = (((f4 - 0.0f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((0.0f + f4) * 0.5f);
        rl9Var.c = (((f4 - 0.0f) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((0.0f + f4) * 0.5f);
    }
}
