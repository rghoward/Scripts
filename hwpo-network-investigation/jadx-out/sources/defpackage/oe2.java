package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oe2 implements ye2, xe2.a<Object> {
    public volatile kx6.a<?> A;
    public File B;
    public final List<ko5> t;
    public final en2<?> u;
    public final ye2.a v;
    public int w = -1;
    public ko5 x;
    public List<kx6<File, ?>> y;
    public int z;

    public oe2(List<ko5> list, en2<?> en2Var, ye2.a aVar) {
        this.t = list;
        this.u = en2Var;
        this.v = aVar;
    }

    @Override // defpackage.ye2
    public final boolean a() {
        while (true) {
            List<kx6<File, ?>> list = this.y;
            boolean z = false;
            if (list != null && this.z < list.size()) {
                this.A = null;
                while (!z && this.z < this.y.size()) {
                    List<kx6<File, ?>> list2 = this.y;
                    int i = this.z;
                    this.z = i + 1;
                    kx6<File, ?> kx6Var = list2.get(i);
                    File file = this.B;
                    en2<?> en2Var = this.u;
                    this.A = kx6Var.a(file, en2Var.e, en2Var.f, en2Var.i);
                    if (this.A != null && this.u.c(this.A.c.a()) != null) {
                        this.A.c.c(this.u.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.w + 1;
            this.w = i2;
            if (i2 >= this.t.size()) {
                return false;
            }
            ko5 ko5Var = this.t.get(this.w);
            en2<?> en2Var2 = this.u;
            File fileB = ((hg3.c) en2Var2.h).a().b(new pe2(ko5Var, en2Var2.n));
            this.B = fileB;
            if (fileB != null) {
                this.x = ko5Var;
                this.y = this.u.c.a().f(fileB);
                this.z = 0;
            }
        }
    }

    @Override // defpackage.ye2
    public final void cancel() {
        kx6.a<?> aVar = this.A;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // xe2.a
    public final void d(Exception exc) {
        this.v.e(this.x, exc, this.A.c, kf2.v);
    }

    @Override // xe2.a
    public final void e(Object obj) {
        this.v.f(this.x, obj, this.A.c, kf2.v, this.x);
    }
}
