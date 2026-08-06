package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z4d implements k5d {
    public final String a;
    public final ListenableFuture b;
    public final u5d c;
    public final id9 d;
    public final j2d e;
    public final sk7 f;
    public final p50 g;
    public final Object h = new Object();
    public final nn3 i = new nn3();
    public ListenableFuture j = null;

    public z4d(String str, t85 t85Var, u5d u5dVar, Executor executor, j2d j2dVar, sk7 sk7Var, p50 p50Var) {
        this.a = str;
        this.b = ti4.l1(t85Var);
        this.c = u5dVar;
        this.d = new id9(executor);
        this.e = j2dVar;
        this.f = sk7Var;
        this.g = p50Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:13:0x0016, B:14:0x0018, B:16:0x001c, B:17:0x0033, B:18:0x0035), top: B:25:0x0003, inners: #0 }] */
    public final ListenableFuture a(final m7d m7dVar, final Executor executor) {
        final ListenableFuture listenableFuture;
        synchronized (this.h) {
            ListenableFuture listenableFuture2 = this.j;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (this.j == null) {
                    this.j = ti4.l1(this.i.a(v7d.a(new w40() { // from class: t4d
                        @Override // defpackage.w40
                        public final ListenableFuture call() {
                            final z4d z4dVar = this.a;
                            try {
                                return ti4.k1(z4dVar.b((Uri) ti4.i1(z4dVar.b)));
                            } catch (IOException e) {
                                le2 le2Var = new le2();
                                le2Var.a = z4dVar;
                                sk7 sk7Var = z4dVar.f;
                                if (!sk7Var.b()) {
                                    return ti4.j1(e);
                                }
                                if ((e instanceof z2d) || (e.getCause() instanceof z2d)) {
                                    return ti4.j1(e);
                                }
                                b1 b1VarA = ((y3d) sk7Var.a()).a(e, le2Var);
                                x40 x40Var = new x40() { // from class: w4d
                                    @Override // defpackage.x40
                                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                                        z4d z4dVar2 = z4dVar;
                                        return ti4.k1(z4dVar2.b((Uri) ti4.i1(z4dVar2.b)));
                                    }
                                };
                                int i = v7d.a;
                                return ti4.n1(b1VarA, new m7d(m6d.a(), x40Var), z4dVar.d);
                            }
                        }
                    }), this.d));
                }
                listenableFuture = this.j;
            } else {
                try {
                    ti4.i1(this.j);
                } catch (ExecutionException unused) {
                    this.j = null;
                }
                if (this.j == null) {
                    this.j = ti4.l1(this.i.a(v7d.a(new w40() { // from class: t4d
                        @Override // defpackage.w40
                        public final ListenableFuture call() {
                            final z4d z4dVar = this.a;
                            try {
                                return ti4.k1(z4dVar.b((Uri) ti4.i1(z4dVar.b)));
                            } catch (IOException e) {
                                le2 le2Var = new le2();
                                le2Var.a = z4dVar;
                                sk7 sk7Var = z4dVar.f;
                                if (!sk7Var.b()) {
                                    return ti4.j1(e);
                                }
                                if ((e instanceof z2d) || (e.getCause() instanceof z2d)) {
                                    return ti4.j1(e);
                                }
                                b1 b1VarA = ((y3d) sk7Var.a()).a(e, le2Var);
                                x40 x40Var = new x40() { // from class: w4d
                                    @Override // defpackage.x40
                                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                                        z4d z4dVar2 = z4dVar;
                                        return ti4.k1(z4dVar2.b((Uri) ti4.i1(z4dVar2.b)));
                                    }
                                };
                                int i = v7d.a;
                                return ti4.n1(b1VarA, new m7d(m6d.a(), x40Var), z4dVar.d);
                            }
                        }
                    }), this.d));
                }
                listenableFuture = this.j;
            }
            throw th;
        }
        return this.i.a(v7d.a(new w40() { // from class: l4d
            @Override // defpackage.w40
            public final ListenableFuture call() {
                final z4d z4dVar = this.a;
                x40 x40Var = new x40() { // from class: s4d
                    @Override // defpackage.x40
                    public final /* synthetic */ ListenableFuture apply(Object obj) {
                        ListenableFuture listenableFuture3;
                        z4d z4dVar2 = z4dVar;
                        synchronized (z4dVar2.h) {
                            listenableFuture3 = z4dVar2.j;
                        }
                        return listenableFuture3;
                    }
                };
                ListenableFuture listenableFuture3 = listenableFuture;
                y03 y03Var = y03.t;
                final w2.a aVarN1 = ti4.n1(listenableFuture3, x40Var, y03Var);
                final w2.a aVarN2 = ti4.n1(aVarN1, m7dVar, executor);
                x40 x40Var2 = new x40() { // from class: u4d
                    @Override // defpackage.x40
                    public final ListenableFuture apply(Object obj) {
                        final z4d z4dVar2 = z4dVar;
                        w2.a aVar = aVarN1;
                        final w2.a aVar2 = aVarN2;
                        if (ti4.i1(aVar).equals(ti4.i1(aVar2))) {
                            return ti4.k1(obj);
                        }
                        x40 x40Var3 = new x40() { // from class: v4d
                            @Override // defpackage.x40
                            public final /* synthetic */ ListenableFuture apply(Object obj2) throws IOException {
                                z4d z4dVar3 = z4dVar2;
                                w2.a aVar3 = aVar2;
                                z4dVar3.c((Uri) ti4.i1(z4dVar3.b), obj2);
                                synchronized (z4dVar3.h) {
                                    z4dVar3.j = aVar3;
                                }
                                return ti4.k1(obj2);
                            }
                        };
                        int i = v7d.a;
                        w2.a aVarN3 = ti4.n1(aVar2, new m7d(m6d.a(), x40Var3), z4dVar2.d);
                        synchronized (z4dVar2.h) {
                        }
                        return aVarN3;
                    }
                };
                int i = v7d.a;
                return ti4.n1(aVarN2, new m7d(m6d.a(), x40Var2), y03Var);
            }
        }), y03.t);
    }

    public final Object b(Uri uri) throws IOException {
        u5d u5dVar = this.c;
        String str = this.a;
        j2d j2dVar = this.e;
        try {
            try {
                p50 p50Var = this.g;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                String string = sb.toString();
                p50Var.getClass();
                z6d z6dVarD = p50.d(string);
                try {
                    InputStream inputStreamC = mp0.c(j2dVar.b(uri));
                    try {
                        u1c u1cVarA = u5dVar.a.d().a(inputStreamC, u5dVar.b);
                        if (inputStreamC != null) {
                            inputStreamC.close();
                        }
                        z6dVarD.close();
                        return u1cVarA;
                    } catch (Throwable th) {
                        if (inputStreamC != null) {
                            try {
                                inputStreamC.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        z6dVarD.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e) {
                throw m5d.a(j2dVar, uri, e, str);
            }
        } catch (FileNotFoundException e2) {
            h2d h2dVarB = j2dVar.b(uri);
            if (h2dVarB.a.b(h2dVarB.d)) {
                throw e2;
            }
            return u5dVar.a;
        }
    }

    public final void c(Uri uri, Object obj) throws IOException {
        String str = this.a;
        j2d j2dVar = this.e;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            p50 p50Var = this.g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            String string = sb.toString();
            p50Var.getClass();
            z6d z6dVarD = p50.d(string);
            try {
                x2d x2dVar = new x2d();
                try {
                    h2d h2dVarB = j2dVar.b(uriBuild);
                    ArrayList arrayListA = h2dVarB.a(h2dVarB.a.e(h2dVarB.d));
                    new x2d[]{x2dVar}[0].a(arrayListA);
                    OutputStream outputStream = (OutputStream) arrayListA.get(0);
                    try {
                        ((g3c) obj).e(outputStream);
                        if (x2dVar.b == null) {
                            throw new c3d("Cannot sync underlying stream");
                        }
                        x2dVar.a.flush();
                        x2dVar.b.t.getFD().sync();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        z6dVarD.close();
                        h2d h2dVarB2 = j2dVar.b(uriBuild);
                        h2d h2dVarB3 = j2dVar.b(uri);
                        k3d k3dVar = h2dVarB2.a;
                        if (k3dVar != h2dVarB3.a) {
                            throw new c3d("Cannot rename file across backends");
                        }
                        k3dVar.g(h2dVarB2.d, h2dVarB3.d);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw m5d.a(j2dVar, uri, e, str);
                }
            } catch (Throwable th3) {
                try {
                    z6dVarD.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            h2d h2dVarB4 = j2dVar.b(uriBuild);
            if (h2dVarB4.a.b(h2dVarB4.d)) {
                try {
                    h2d h2dVarB5 = j2dVar.b(uriBuild);
                    h2dVarB5.a.f(h2dVarB5.d);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }
}
