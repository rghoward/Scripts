package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ay3<T> implements g1a<T> {
    public final File a;
    public final wd9<T> b;
    public final pg5 c;
    public final wx3 d;
    public final AtomicBoolean e;
    public final a47 f;

    public ay3(File file, wd9 wd9Var, pg5 pg5Var, wx3 wx3Var) {
        wd9Var.getClass();
        pg5Var.getClass();
        this.a = file;
        this.b = wd9Var;
        this.c = pg5Var;
        this.d = wx3Var;
        this.e = new AtomicBoolean(false);
        this.f = new a47();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[Catch: all -> 0x00fc, IOException -> 0x00ff, TRY_ENTER, TryCatch #3 {IOException -> 0x00ff, blocks: (B:43:0x00c5, B:45:0x00cb, B:47:0x00d1, B:51:0x00dd, B:52:0x00fb, B:48:0x00d6, B:60:0x010b, B:67:0x0119, B:66:0x0116), top: B:83:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[Catch: all -> 0x00fc, IOException -> 0x00ff, TryCatch #3 {IOException -> 0x00ff, blocks: (B:43:0x00c5, B:45:0x00cb, B:47:0x00d1, B:51:0x00dd, B:52:0x00fb, B:48:0x00d6, B:60:0x010b, B:67:0x0119, B:66:0x0116), top: B:83:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1 A[Catch: all -> 0x00fc, IOException -> 0x00ff, TryCatch #3 {IOException -> 0x00ff, blocks: (B:43:0x00c5, B:45:0x00cb, B:47:0x00d1, B:51:0x00dd, B:52:0x00fb, B:48:0x00d6, B:60:0x010b, B:67:0x0119, B:66:0x0116), top: B:83:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6 A[Catch: all -> 0x00fc, IOException -> 0x00ff, TryCatch #3 {IOException -> 0x00ff, blocks: (B:43:0x00c5, B:45:0x00cb, B:47:0x00d1, B:51:0x00dd, B:52:0x00fb, B:48:0x00d6, B:60:0x010b, B:67:0x0119, B:66:0x0116), top: B:83:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd A[Catch: all -> 0x00fc, IOException -> 0x00ff, TryCatch #3 {IOException -> 0x00ff, blocks: (B:43:0x00c5, B:45:0x00cb, B:47:0x00d1, B:51:0x00dd, B:52:0x00fb, B:48:0x00d6, B:60:0x010b, B:67:0x0119, B:66:0x0116), top: B:83:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x010b A[Catch: all -> 0x00fc, IOException -> 0x00ff, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x00ff, blocks: (B:43:0x00c5, B:45:0x00cb, B:47:0x00d1, B:51:0x00dd, B:52:0x00fb, B:48:0x00d6, B:60:0x010b, B:67:0x0119, B:66:0x0116), top: B:83:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00dd, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4, types: [x37] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File, java.lang.Object] */
    @Override // defpackage.g1a
    public final Object b(qg2 qg2Var, u02 u02Var) throws Throwable {
        zx3 zx3Var;
        ?? file;
        x37 x37Var;
        ci4 ci4Var;
        ty3 ty3Var;
        Throwable th;
        ty3 ty3Var2;
        x37 x37Var2;
        ?? r10;
        boolean zRenameTo;
        if (u02Var instanceof zx3) {
            zx3Var = (zx3) u02Var;
            int i = zx3Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                zx3Var.y = i - Integer.MIN_VALUE;
            } else {
                zx3Var = new zx3(this, u02Var);
            }
        } else {
            zx3Var = new zx3(this, u02Var);
        }
        ?? r11 = zx3Var.w;
        int i2 = zx3Var.y;
        File file2 = this.a;
        v72 v72Var = v72.t;
        try {
            try {
                try {
                    try {
                        try {
                            if (i2 == 0) {
                                dv8.b(r11);
                                if (this.e.get()) {
                                    aa0.c("StorageConnection has already been disposed.");
                                    return null;
                                }
                                File parentFile = file2.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        i34.c(file2, "Unable to create parent directories of ");
                                        return null;
                                    }
                                }
                                zx3Var.t = qg2Var;
                                x37Var = this.f;
                                zx3Var.u = x37Var;
                                zx3Var.y = 1;
                                ci4Var = qg2Var;
                                if (x37Var.b(zx3Var) != v72Var) {
                                }
                                return v72Var;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ty3Var2 = zx3Var.v;
                                File file3 = (File) zx3Var.u;
                                x37Var2 = (x37) zx3Var.t;
                                try {
                                    dv8.b(r11);
                                    r10 = file3;
                                    g2b g2bVar = g2b.a;
                                    try {
                                        ty3Var2.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r10.exists()) {
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            zRenameTo = cx.a(r10, file2);
                                        } else {
                                            zRenameTo = r10.renameTo(file2);
                                        }
                                        if (zRenameTo) {
                                            throw new IOException("Unable to rename " + r10 + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    g2b g2bVar2 = g2b.a;
                                    x37Var2.c(null);
                                    return g2b.a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        ty3Var2.close();
                                    } catch (Throwable th4) {
                                        fn3.b(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            x37 x37Var3 = (x37) zx3Var.u;
                            ci4 ci4Var2 = (ci4) zx3Var.t;
                            dv8.b(r11);
                            x37Var = x37Var3;
                            ci4Var = ci4Var2;
                            zx3Var.t = x37Var;
                            zx3Var.u = file;
                            zx3Var.v = ty3Var;
                            zx3Var.y = 2;
                            if (ci4Var.invoke(ty3Var, zx3Var) != v72Var) {
                                x37Var2 = x37Var;
                                r10 = file;
                                ty3Var2 = ty3Var;
                                g2b g2bVar3 = g2b.a;
                                ty3Var2.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (r10.exists()) {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = cx.a(r10, file2);
                                    } else {
                                        zRenameTo = r10.renameTo(file2);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + r10 + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                g2b g2bVar4 = g2b.a;
                                x37Var2.c(null);
                                return g2b.a;
                            }
                            return v72Var;
                        } catch (Throwable th5) {
                            th = th5;
                            ty3Var2 = ty3Var;
                            ty3Var2.close();
                            throw th;
                        }
                        wd9<T> wd9Var = this.b;
                        wd9Var.getClass();
                        ty3Var = new ty3(file, wd9Var);
                    } catch (IOException e) {
                        e = e;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                    file = new File(file2.getAbsolutePath() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    r11.c(null);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                file = qg2Var;
            }
        } catch (Throwable th7) {
            th = th7;
            r11 = zx3Var;
            r11.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:34:0x0071, B:43:0x0082, B:42:0x007f, B:39:0x007a), top: B:50:0x0020, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g1a
    public final Object c(h1a h1aVar, u02 u02Var) throws Throwable {
        yx3 yx3Var;
        boolean zH;
        Throwable th;
        px3 px3Var;
        if (u02Var instanceof yx3) {
            yx3Var = (yx3) u02Var;
            int i = yx3Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                yx3Var.x = i - Integer.MIN_VALUE;
            } else {
                yx3Var = new yx3(this, u02Var);
            }
        } else {
            yx3Var = new yx3(this, u02Var);
        }
        Object obj = yx3Var.v;
        int i2 = yx3Var.x;
        a47 a47Var = this.f;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (ay3<T>) yx3Var.t;
                px3Var = yx3Var.u;
                try {
                    dv8.b(obj);
                    try {
                        px3Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (this != null) {
                        a47Var.c(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        px3Var.close();
                    } catch (Throwable th4) {
                        fn3.b(th, th4);
                    }
                    throw th;
                }
            }
            dv8.b(obj);
            if (this.e.get()) {
                aa0.c("StorageConnection has already been disposed.");
                return null;
            }
            zH = a47Var.h();
            try {
                px3 px3Var2 = new px3(this.a, this.b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zH);
                    yx3Var.u = px3Var2;
                    yx3Var.t = zH;
                    yx3Var.x = 1;
                    Object objInvoke = h1aVar.invoke(px3Var2, boolValueOf, yx3Var);
                    Object obj2 = v72.t;
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    obj = objInvoke;
                    this = zH ? 1 : 0;
                    px3Var = px3Var2;
                    px3Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (this != null) {
                        a47Var.c(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    this = zH ? 1 : 0;
                    px3Var = px3Var2;
                    px3Var.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (zH != 0) {
                    a47Var.c(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            zH = this;
        }
    }

    @Override // defpackage.dg1
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }

    @Override // defpackage.g1a
    public final pg5 e() {
        return this.c;
    }
}
