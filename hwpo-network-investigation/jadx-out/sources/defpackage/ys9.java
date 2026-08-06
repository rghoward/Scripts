package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ys9 {
    public final a47 a = new a47();
    public final dt7 b = bl7.i(null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ms9 {
        public final qt9 a;
        public final e41 b;

        public a(qt9 qt9Var, e41 e41Var) {
            this.a = qt9Var;
            this.b = e41Var;
        }

        @Override // defpackage.ms9
        public final void a() {
            e41 e41Var = this.b;
            if (e41Var.s() instanceof kc7) {
                e41Var.resumeWith(ot9.u);
            }
        }

        @Override // defpackage.ms9
        public final qt9 b() {
            return this.a;
        }

        @Override // defpackage.ms9
        public final void dismiss() {
            e41 e41Var = this.b;
            if (e41Var.s() instanceof kc7) {
                e41Var.resumeWith(ot9.t);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                return xj5.a(this.a, aVar.a) && this.b == aVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements qt9 {
        public final String a;
        public final String b;
        public final ns9 c;

        public b(String str, String str2, ns9 ns9Var) {
            this.a = str;
            this.b = str2;
            this.c = ns9Var;
        }

        @Override // defpackage.qt9
        public final String a() {
            return this.a;
        }

        @Override // defpackage.qt9
        public final String b() {
            return this.b;
        }

        @Override // defpackage.qt9
        public final boolean c() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return xj5.a(this.a, bVar.a) && xj5.a(this.b, bVar.b) && this.c == bVar.c;
        }

        @Override // defpackage.qt9
        public final ns9 getDuration() {
            return this.c;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + uo2.a((iHashCode + (str != null ? str.hashCode() : 0)) * 31, false, 31);
        }
    }

    public static Object b(ys9 ys9Var, String str, String str2, ns9 ns9Var, r02 r02Var, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        ys9Var.getClass();
        return ys9Var.a(new b(str, str2, ns9Var), r02Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r9 == r6) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [ys9] */
    /* JADX WARN: Type inference failed for: r7v1, types: [x37] */
    /* JADX WARN: Type inference failed for: r7v4, types: [x37] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ys9.b r8, defpackage.r02 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.zs9
            if (r0 == 0) goto L13
            r0 = r9
            zs9 r0 = (defpackage.zs9) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            zs9 r0 = new zs9
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            int r1 = r0.x
            dt7 r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            v72 r6 = defpackage.v72.t
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            x37 r7 = r0.u
            defpackage.dv8.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r8 = move-exception
            goto L7b
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r5
        L37:
            x37 r7 = r0.u
            qt9 r8 = r0.t
            defpackage.dv8.b(r9)
            goto L51
        L3f:
            defpackage.dv8.b(r9)
            r0.t = r8
            a47 r7 = r7.a
            r0.u = r7
            r0.x = r4
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r6) goto L51
            goto L71
        L51:
            r0.t = r8     // Catch: java.lang.Throwable -> L2f
            r0.u = r7     // Catch: java.lang.Throwable -> L2f
            r0.x = r3     // Catch: java.lang.Throwable -> L2f
            e41 r9 = new e41     // Catch: java.lang.Throwable -> L2f
            r02 r0 = defpackage.th0.e(r0)     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2f
            r9.t()     // Catch: java.lang.Throwable -> L2f
            ys9$a r0 = new ys9$a     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L2f
            r2.setValue(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r9.r()     // Catch: java.lang.Throwable -> L2f
            if (r9 != r6) goto L72
        L71:
            return r6
        L72:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L79
            r7.c(r5)
            return r9
        L79:
            r8 = move-exception
            goto L7f
        L7b:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L7f:
            r7.c(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys9.a(ys9$b, r02):java.lang.Object");
    }
}
