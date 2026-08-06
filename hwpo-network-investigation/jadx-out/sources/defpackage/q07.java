package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q07 implements pg5 {
    public final h72 a;
    public final File b;
    public final v91 c;
    public final String d;
    public final String e;
    public final String f;
    public final a47 g;
    public final o7a h;
    public final o7a i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|34) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        
            r1 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        
            if (r1 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            r12.t = r11;
            r12.u = r3;
            r12.w = 1;
            r0 = defpackage.bw2.b(r3, r12);
            r1 = defpackage.v72.t;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        
            if (r0 == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:27:0x0072). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object a(java.io.FileOutputStream r11, defpackage.u02 r12) throws java.lang.Throwable {
            /*
                boolean r0 = r12 instanceof defpackage.p07
                if (r0 == 0) goto L13
                r0 = r12
                p07 r0 = (defpackage.p07) r0
                int r1 = r0.w
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.w = r1
                goto L18
            L13:
                p07 r0 = new p07
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.v
                int r1 = r0.w
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L2a
                long r3 = r0.u
                java.io.FileOutputStream r11 = r0.t
                defpackage.dv8.b(r12)
                r12 = r0
                goto L72
            L2a:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r11)
                r11 = 0
                return r11
            L31:
                defpackage.dv8.b(r12)
                r3 = 10
                r12 = r0
            L37:
                r0 = 60000(0xea60, double:2.9644E-319)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto L77
                java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L52
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10 = 0
                r6 = 0
                java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L52
                r0.getClass()     // Catch: java.io.IOException -> L52
                goto L8a
            L52:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L76
                java.lang.String r5 = "Resource deadlock would occur"
                r6 = 0
                boolean r1 = defpackage.z2a.o(r1, r5, r6)
                if (r1 != r2) goto L76
                r12.t = r11
                r12.u = r3
                r12.w = r2
                java.lang.Object r0 = defpackage.bw2.b(r3, r12)
                v72 r1 = defpackage.v72.t
                if (r0 != r1) goto L72
                r0 = r1
                goto L8a
            L72:
                r0 = 2
                long r3 = r3 * r0
                goto L37
            L76:
                throw r0
            L77:
                java.nio.channels.FileChannel r5 = r11.getChannel()
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10 = 0
                r6 = 0
                java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)
                r0.getClass()
            L8a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q07.a.a(java.io.FileOutputStream, u02):java.lang.Object");
        }
    }

    public q07(h72 h72Var, File file) {
        h72Var.getClass();
        file.getClass();
        this.a = h72Var;
        this.b = file;
        Object obj = e17.b;
        this.c = new v91(new d17(file, null), ff3.t, -2, xx0.t);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new a47();
        this.h = new o7a(new u24(1, this));
        this.i = new o7a(new o07(0, this));
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                i34.c(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // defpackage.pg5
    public final Object a(u02 u02Var) {
        return this.i.u != b1b.a ? new Integer(((xl9) this.i.getValue()).getValue()) : oy0.g(this.a, new r07(this, null), u02Var);
    }

    @Override // defpackage.pg5
    public final Object b(qg2 qg2Var) {
        return this.i.u != b1b.a ? new Integer(((xl9) this.i.getValue()).a()) : oy0.g(this.a, new s07(this, null), qg2Var);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3 A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b7, blocks: (B:41:0x00b3, B:55:0x00d1, B:56:0x00d4), top: B:72:0x0022, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #4 {all -> 0x00b7, blocks: (B:41:0x00b3, B:55:0x00d1, B:56:0x00d4), top: B:72:0x0022, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [x37] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [x37] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [oh4] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [x37] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, oh4] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // defpackage.pg5
    public final Object c(oh4 oh4Var, u02 u02Var) throws Throwable {
        t07 t07Var;
        a47 a47Var;
        ?? r9;
        FileOutputStream fileOutputStream;
        Throwable th;
        ?? r10;
        ?? r8;
        ?? r1;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        ?? r0;
        ?? r11;
        if (u02Var instanceof t07) {
            t07Var = (t07) u02Var;
            int i = t07Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                t07Var.y = i - Integer.MIN_VALUE;
            } else {
                t07Var = new t07(this, u02Var);
            }
        } else {
            t07Var = new t07(this, u02Var);
        }
        ?? r12 = t07Var.w;
        int i2 = t07Var.y;
        v72 v72Var = v72.t;
        try {
            try {
                try {
                    if (i2 == 0) {
                        dv8.b(r12);
                        t07Var.t = oh4Var;
                        a47Var = this.g;
                        t07Var.u = a47Var;
                        t07Var.y = 1;
                        if (a47Var.b(t07Var) != v72Var) {
                        }
                        r9 = oh4Var;
                        r12 = a47Var;
                        return v72Var;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                aa0.c("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileLock = (FileLock) t07Var.v;
                            closeable = (Closeable) t07Var.u;
                            x37 x37Var = (x37) t07Var.t;
                            try {
                                dv8.b(r12);
                                r0 = x37Var;
                                r11 = r12;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    fg1.a(closeable, null);
                                    r0.c(null);
                                    return r11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = r0;
                                    r12.c(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (Closeable) t07Var.v;
                        r8 = (x37) t07Var.u;
                        oh4 oh4Var2 = (oh4) t07Var.t;
                        try {
                            dv8.b(r12);
                            r1 = oh4Var2;
                            r8 = r8;
                            r10 = r12;
                            fileLock2 = (FileLock) r10;
                            try {
                                t07Var.t = r8;
                                t07Var.u = closeable;
                                t07Var.v = fileLock2;
                                t07Var.y = 3;
                                objInvoke = r1.invoke(t07Var);
                                if (objInvoke != v72Var) {
                                    r0 = r8;
                                    fileLock = fileLock2;
                                    r11 = objInvoke;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    fg1.a(closeable, null);
                                    r0.c(null);
                                    return r11;
                                }
                                r9 = oh4Var;
                                r12 = a47Var;
                                return v72Var;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    x37 x37Var2 = (x37) t07Var.u;
                    oh4 oh4Var3 = (oh4) t07Var.t;
                    dv8.b(r12);
                    r12 = x37Var2;
                    r9 = oh4Var3;
                    t07Var.t = r9;
                    t07Var.u = r12;
                    t07Var.v = fileOutputStream;
                    t07Var.y = 2;
                    Object objA = a.a(fileOutputStream, t07Var);
                    if (objA != v72Var) {
                        ?? r7 = r12;
                        r10 = objA;
                        r8 = r7;
                        r1 = r9;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) r10;
                        t07Var.t = r8;
                        t07Var.u = closeable;
                        t07Var.v = fileLock2;
                        t07Var.y = 3;
                        objInvoke = r1.invoke(t07Var);
                        if (objInvoke != v72Var) {
                            r0 = r8;
                            fileLock = fileLock2;
                            r11 = objInvoke;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            fg1.a(closeable, null);
                            r0.c(null);
                            return r11;
                        }
                    }
                    r9 = oh4Var;
                    r12 = a47Var;
                    return v72Var;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                r9 = oh4Var;
                r12 = a47Var;
                fileOutputStream = new FileOutputStream((File) this.h.getValue());
            } catch (Throwable th7) {
                th = th7;
                r12.c(null);
                throw th;
            }
        } catch (Throwable th8) {
            r12 = t07Var;
            try {
                throw th8;
            } catch (Throwable th9) {
                fg1.a(oh4Var, th8);
                throw th9;
            }
        }
    }

    @Override // defpackage.pg5
    public final r54<g2b> d() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7 A[Catch: all -> 0x00e0, TRY_ENTER, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [x37] */
    /* JADX WARN: Type inference failed for: r2v13, types: [a47] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [x37] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, u07] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [x37] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.io.Closeable] */
    @Override // defpackage.pg5
    public final Object e(ci4 ci4Var, u02 u02Var) throws Throwable {
        ?? u07Var;
        ?? r1;
        ?? r2;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        FileInputStream fileInputStream;
        ?? r3;
        ?? r4;
        if (u02Var instanceof u07) {
            u07 u07Var2 = (u07) u02Var;
            int i = u07Var2.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                u07Var2.z = i - Integer.MIN_VALUE;
                u07Var = u07Var2;
            } else {
                u07Var = new u07(this, u02Var);
            }
        } else {
            u07Var = new u07(this, u02Var);
        }
        Object objInvoke = u07Var.x;
        ?? r5 = u07Var.z;
        try {
            if (r5 == 0) {
                dv8.b(objInvoke);
                a47 a47Var = this.g;
                boolean zH = a47Var.h();
                v72 v72Var = v72.t;
                try {
                    if (zH) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.h.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th) {
                                th = th;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            String message2 = e.getMessage();
                            if ((message2 == null || !w2a.n(message2, this.f, false)) && ((message = e.getMessage()) == null || !w2a.n(message, "Resource deadlock would occur", false))) {
                                throw e;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                            u07Var.t = a47Var;
                            u07Var.u = fileInputStream2;
                            u07Var.v = fileLockTryLock;
                            u07Var.w = zH;
                            u07Var.z = 2;
                            objInvoke = ci4Var.invoke(boolValueOf, u07Var);
                            if (objInvoke != v72Var) {
                                fileLock = fileLockTryLock;
                                u07Var = a47Var;
                                r1 = zH;
                                fileInputStream = fileInputStream2;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                fg1.a(fileInputStream, null);
                                if (r1 != 0) {
                                    u07Var.c(null);
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        u07Var.t = a47Var;
                        u07Var.w = zH;
                        u07Var.z = 1;
                        objInvoke = ci4Var.invoke(bool, u07Var);
                        if (objInvoke != v72Var) {
                            r3 = a47Var;
                            r4 = zH;
                            if (r4 != 0) {
                                r3.c(null);
                            }
                            return objInvoke;
                        }
                    }
                    return v72Var;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = a47Var;
                    r1 = zH;
                }
            } else if (r5 == 1) {
                r1 = u07Var.w;
                r2 = u07Var.t;
                try {
                    dv8.b(objInvoke);
                    r4 = r1;
                    r3 = r2;
                    if (r4 != 0) {
                        r3.c(null);
                    }
                    return objInvoke;
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                if (r5 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = u07Var.w;
                fileLock = u07Var.v;
                fileInputStream = u07Var.u;
                a47 a47Var2 = u07Var.t;
                try {
                    dv8.b(objInvoke);
                    r1 = z;
                    u07Var = a47Var2;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        fg1.a(fileInputStream, null);
                        if (r1 != 0) {
                            u07Var.c(null);
                        }
                        return objInvoke;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    fg1.a(r5, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                }
            }
        }
        r2 = u07Var;
        if (r1 != 0) {
            r2.c(null);
        }
        throw th;
    }
}
