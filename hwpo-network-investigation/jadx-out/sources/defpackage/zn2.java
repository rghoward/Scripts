package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zn2 implements ki {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public ji[] f = new ji[100];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r4v0, types: [ki$a] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [uz8$a] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.ki
    public final synchronized void a(ki.a aVar) {
        while (aVar != 0) {
            ji[] jiVarArr = this.f;
            int i = this.e;
            this.e = i + 1;
            ji jiVar = ((uz8.a) aVar).c;
            jiVar.getClass();
            jiVarArr[i] = jiVar;
            this.d--;
            aVar = ((uz8.a) aVar).d;
            if (aVar == 0 || aVar.c == null) {
                aVar = 0;
            }
        }
    }

    @Override // defpackage.ki
    public final synchronized void b(ji jiVar) {
        ji[] jiVarArr = this.f;
        int i = this.e;
        this.e = i + 1;
        jiVarArr[i] = jiVar;
        this.d--;
    }

    @Override // defpackage.ki
    public final synchronized ji c() {
        ji jiVar;
        try {
            int i = this.d + 1;
            this.d = i;
            int i2 = this.e;
            if (i2 > 0) {
                ji[] jiVarArr = this.f;
                int i3 = i2 - 1;
                this.e = i3;
                jiVar = jiVarArr[i3];
                jiVar.getClass();
                this.f[this.e] = null;
            } else {
                ji jiVar2 = new ji(new byte[this.b], 0);
                ji[] jiVarArr2 = this.f;
                if (i > jiVarArr2.length) {
                    this.f = (ji[]) Arrays.copyOf(jiVarArr2, jiVarArr2.length * 2);
                }
                jiVar = jiVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jiVar;
    }

    @Override // defpackage.ki
    public final synchronized void d() {
        int iMax = Math.max(0, n6b.g(this.c, this.b) - this.d);
        int i = this.e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f, iMax, i, (Object) null);
        this.e = iMax;
    }

    @Override // defpackage.ki
    public final int e() {
        return this.b;
    }

    public final synchronized void f(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            d();
        }
    }
}
