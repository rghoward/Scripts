package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.FileWriteScope$writeData$2", f = "FileStorage.kt", l = {206}, m = "invokeSuspend", v = 1)
public final class sy3 extends p6a implements oh4<r02<? super g2b>, Object> {
    public FileOutputStream t;
    public FileOutputStream u;
    public int v;
    public final /* synthetic */ ty3<Object> w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy3(ty3<Object> ty3Var, Object obj, r02<? super sy3> r02Var) {
        super(1, r02Var);
        this.w = ty3Var;
        this.x = obj;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(r02<?> r02Var) {
        return new sy3(this.w, this.x, r02Var);
    }

    @Override // defpackage.oh4
    public final Object invoke(r02<? super g2b> r02Var) {
        return ((sy3) create(r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Exception {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        ty3<Object> ty3Var = this.w;
        File file = ty3Var.a;
        int i = this.v;
        try {
            if (i == 0) {
                dv8.b(obj);
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                Object obj2 = this.x;
                try {
                    wd9<Object> wd9Var = ty3Var.b;
                    s1b s1bVar = new s1b(fileOutputStream3);
                    this.t = fileOutputStream3;
                    this.u = fileOutputStream3;
                    this.v = 1;
                    g2b g2bVarB = wd9Var.b(obj2, s1bVar);
                    v72 v72Var = v72.t;
                    if (g2bVarB == v72Var) {
                        return v72Var;
                    }
                    fileOutputStream = fileOutputStream3;
                    fileOutputStream2 = fileOutputStream;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fileOutputStream2 = this.u;
                fileOutputStream = this.t;
                try {
                    dv8.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        fg1.a(fileOutputStream, th);
                        throw th4;
                    }
                }
            }
            fileOutputStream2.getFD().sync();
            g2b g2bVar = g2b.a;
            fg1.a(fileOutputStream, null);
            return g2b.a;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw v03.a(file.getParent(), (FileNotFoundException) e);
            }
            throw e;
        }
    }
}
