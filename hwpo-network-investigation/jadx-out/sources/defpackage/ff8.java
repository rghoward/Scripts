package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ff8 implements kab {
    public boolean a = false;
    public boolean b = false;
    public ou3 c;
    public final cf8 d;

    public ff8(cf8 cf8Var) {
        this.d = cf8Var;
    }

    @Override // defpackage.kab
    public final kab b(String str) throws IOException {
        if (this.a) {
            throw new cg3("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.kab
    public final kab c(boolean z) throws IOException {
        if (this.a) {
            throw new cg3("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
