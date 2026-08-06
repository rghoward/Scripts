package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class px3<T> implements gi8<T> {
    public final File a;
    public final wd9<T> b;
    public final AtomicBoolean c;

    public px3(File file, wd9<T> wd9Var) {
        wd9Var.getClass();
        this.a = file;
        this.b = wd9Var;
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.gi8
    public final Object a(h1a h1aVar) {
        if (this.c.get()) {
            aa0.c("This scope has already been closed.");
            return null;
        }
        return cy3.a(this.a, new ox3(this, null), h1aVar);
    }

    @Override // defpackage.dg1
    public final void close() {
        this.c.set(true);
    }
}
