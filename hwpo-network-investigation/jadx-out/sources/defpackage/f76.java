package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f76 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements b33 {
        public final /* synthetic */ m76 a;
        public final /* synthetic */ e76 b;
        public final /* synthetic */ gl8 c;

        public a(m76 m76Var, e76 e76Var, gl8 gl8Var) {
            this.a = m76Var;
            this.b = e76Var;
            this.c = gl8Var;
        }

        @Override // defpackage.b33
        public final void dispose() {
            this.a.getLifecycle().c(this.b);
            v76 v76Var = (v76) this.c.t;
            if (v76Var != null) {
                v76Var.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s66.a.values().length];
            try {
                iArr[s66.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s66.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s66.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s66.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final void a(final Boolean bool, final Object obj, m76 m76Var, final oh4 oh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(696924721);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 1171) != 1170)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                m76Var = (m76) bj4VarO.F(kc6.a);
            } else {
                bj4VarO.u();
            }
            int i3 = i2 & (-897);
            bj4VarO.V();
            boolean zJ = bj4VarO.J(bool) | bj4VarO.J(obj) | bj4VarO.J(m76Var);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new u76(m76Var.getLifecycle());
                bj4VarO.C(objF);
            }
            b(m76Var, (u76) objF, oh4Var, bj4VarO, (i3 >> 3) & 896);
        } else {
            bj4VarO.u();
        }
        final m76 m76Var2 = m76Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: b76
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    f76.a(bool, obj, m76Var2, oh4Var, (jt1) obj2, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final m76 m76Var, final u76 u76Var, final oh4<? super u76, ? extends v76> oh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(228371534);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(m76Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(u76Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            boolean zJ = bj4VarO.j(u76Var) | ((i2 & 896) == 256) | bj4VarO.j(m76Var);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: c76
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [e76, l76] */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        final gl8 gl8Var = new gl8();
                        final u76 u76Var2 = u76Var;
                        final oh4 oh4Var2 = oh4Var;
                        ?? r0 = new g76() { // from class: e76
                            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
                            @Override // defpackage.g76
                            public final void t(m76 m76Var2, s66.a aVar) {
                                int i3 = f76.b.a[aVar.ordinal()];
                                gl8 gl8Var2 = gl8Var;
                                if (i3 == 1) {
                                    gl8Var2.t = oh4Var2.invoke(u76Var2);
                                } else {
                                    if (i3 != 2) {
                                        return;
                                    }
                                    v76 v76Var = (v76) gl8Var2.t;
                                    if (v76Var != null) {
                                        v76Var.a();
                                    }
                                    gl8Var2.t = null;
                                }
                            }
                        };
                        m76 m76Var2 = m76Var;
                        m76Var2.getLifecycle().a(r0);
                        return new f76.a(m76Var2, r0, gl8Var);
                    }
                };
                bj4VarO.C(objF);
            }
            wd3.b(m76Var, u76Var, (oh4) objF, bj4VarO);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: d76
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iS = gz3.s(i | 1);
                    f76.b(m76Var, u76Var, oh4Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
