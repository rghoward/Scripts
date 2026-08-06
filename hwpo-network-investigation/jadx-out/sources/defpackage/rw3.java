package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import j$.nio.file.CopyOption;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.Paths;
import j$.nio.file.attribute.FileAttribute;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rw3 implements qw3, p43 {
    public static final a Companion = new a();
    public final xy3 a;
    public final lg7 b;
    public final LinkedHashMap c;
    public final am9 d;
    public final ji8 e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.download.FileDownloaderImpl$emitStatus$1", f = "FileDownloaderImpl.kt", l = {114}, m = "invokeSuspend", v = 2)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ ww3 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ww3 ww3Var, r02<? super b> r02Var) {
            super(2, r02Var);
            this.v = ww3Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return rw3.this.new b(this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                am9 am9Var = rw3.this.d;
                this.t = 1;
                Object objEmit = am9Var.emit(this.v, this);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    public rw3(xy3 xy3Var, lg7 lg7Var) {
        xy3Var.getClass();
        lg7Var.getClass();
        this.a = xy3Var;
        this.b = lg7Var;
        this.c = new LinkedHashMap();
        am9 am9VarB = ty1.b(7, null);
        this.d = am9VarB;
        this.e = yk2.a(am9VarB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object e(rw3 rw3Var, t72 t72Var, String str, String str2, u02 u02Var) {
        tw3 tw3Var;
        xy3 xy3Var = rw3Var.a;
        LinkedHashMap linkedHashMap = rw3Var.c;
        if (u02Var instanceof tw3) {
            tw3Var = (tw3) u02Var;
            int i = tw3Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                tw3Var.x = i - Integer.MIN_VALUE;
            } else {
                tw3Var = new tw3(rw3Var, u02Var);
            }
        } else {
            tw3Var = new tw3(rw3Var, u02Var);
        }
        Object obj = tw3Var.v;
        int i2 = tw3Var.x;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                tw3Var.t = t72Var;
                tw3Var.u = str2;
                tw3Var.x = 1;
                e41 e41Var = new e41(1, th0.e(tw3Var));
                e41Var.t();
                Path path = Paths.get(xy3Var.b().getPath(), str + ".hwpo.download");
                Files.createDirectories(path.getParent(), new FileAttribute[0]);
                if (!Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    Files.createFile(path, new FileAttribute[0]);
                }
                File file = path.toFile();
                file.getClass();
                mi8 mi8Var = new mi8(new zm7(new FileOutputStream(file, false), new voa()));
                jp8.a aVar = new jp8.a();
                aVar.d(str2);
                jp8 jp8Var = new jp8(aVar);
                lg7 lg7Var = rw3Var.b;
                lg7Var.getClass();
                oi8 oi8Var = new oi8(lg7Var, jp8Var, false);
                linkedHashMap.put(str2, oi8Var);
                e41Var.v(new uw3(oi8Var));
                hy0 hy0VarP = FirebasePerfOkHttpClient.execute(oi8Var).z.p();
                try {
                    try {
                        mi8Var.F(hy0VarP);
                        mi8Var.close();
                        hy0VarP.close();
                        Files.move(path, Paths.get(xy3Var.b().getPath(), str), new CopyOption[0]);
                        rw3Var.f(t72Var, new ww3.a(str2));
                        e41Var.resumeWith(g2b.a);
                        Object objR = e41Var.r();
                        v72 v72Var = v72.t;
                        if (objR == v72Var) {
                            return v72Var;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            fg1.a(hy0VarP, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        fg1.a(mi8Var, th3);
                        throw th4;
                    }
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = tw3Var.u;
                t72 t72Var2 = tw3Var.t;
                dv8.b(obj);
            }
        } catch (Exception e) {
            rw3Var.f(t72Var, new ww3.c(str2, e));
        } finally {
            linkedHashMap.remove(str2);
        }
        return g2b.a;
    }

    @Override // defpackage.p43
    public final s60 a(String str) {
        str.getClass();
        return fk2.a(g(str, z2a.L(str, "://", str)));
    }

    @Override // defpackage.qw3
    public final ji8 b() {
        return this.e;
    }

    @Override // defpackage.qw3
    public final Object c(String str, nz9 nz9Var) throws Throwable {
        et2 et2Var = i23.a;
        Object objG = oy0.g(wr2.v, new sw3(str, this, null), nz9Var);
        return objG == v72.t ? objG : g2b.a;
    }

    @Override // defpackage.qw3
    public final void d(String str) {
        str.getClass();
        o21 o21Var = (o21) this.c.get(str);
        if (o21Var == null || o21Var.isCanceled()) {
            return;
        }
        o21Var.cancel();
    }

    public final void f(t72 t72Var, ww3 ww3Var) {
        if (u72.e(t72Var)) {
            oy0.d(t72Var, null, null, new b(ww3Var, null), 3);
        }
    }

    public final ww3 g(String str, String str2) {
        o21 o21Var = (o21) this.c.get(str);
        if (o21Var != null && o21Var.isExecuted()) {
            return new ww3.b(str);
        }
        xy3 xy3Var = this.a;
        xy3Var.getClass();
        return new File(xy3Var.b(), str2).exists() ? new ww3.a(str) : new ww3.d(str);
    }
}
