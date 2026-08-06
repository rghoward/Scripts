package io.intercom.android.sdk.ui.component;

import defpackage.ay8;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.dv;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j37;
import defpackage.jt1;
import defpackage.jv;
import defpackage.jv0;
import defpackage.kk;
import defpackage.kw7;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ns0;
import defpackage.o54;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.pn5;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.th3;
import defpackage.tx2;
import defpackage.u;
import defpackage.uh1;
import defpackage.wi0;
import defpackage.wja;
import defpackage.xj8;
import defpackage.zf7;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.TransitionsKt;
import io.intercom.android.sdk.ui.component.JumpToBottomKt;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.ThemeMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class JumpToBottomKt {
    private static final float JumpBottomPadding = 12.0f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0126  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:109:0x0132  */
    /* JADX WARN: Code duplicated, block: B:112:0x013e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:115:0x0149  */
    /* JADX WARN: Code duplicated, block: B:118:0x014e  */
    /* JADX WARN: Code duplicated, block: B:119:0x015b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0160  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX INFO: renamed from: JumpToBottom-kNRdK3w, reason: not valid java name */
    public static final void m590JumpToBottomkNRdK3w(ox6 ox6Var, long j, long j2, String str, long j3, long j4, final mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        long jA;
        long chevronColor;
        String str2;
        long j5;
        long jM769getOnAction0d7_KjU;
        mh4<g2b> mh4Var2;
        int i4;
        final ox6 ox6Var2;
        String str3;
        long jM751getAction0d7_KjU;
        final long j6;
        final long j7;
        final String str4;
        final long j8;
        final long j9;
        xj8 xj8VarW;
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(1700007899);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                jA = j;
                int i6 = bj4VarO.i(jA) ? 32 : 16;
                i3 |= i6;
            } else {
                jA = j;
            }
            i3 |= i6;
        } else {
            jA = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                chevronColor = j2;
                int i7 = bj4VarO.i(chevronColor) ? 256 : 128;
                i3 |= i7;
            } else {
                chevronColor = j2;
            }
            i3 |= i7;
        } else {
            chevronColor = j2;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                str2 = str;
                i3 |= bj4VarO.J(str2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j5 = j3;
                    int i9 = bj4VarO.i(j5) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    j5 = j3;
                }
                i3 |= i9;
            } else {
                j5 = j3;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jM769getOnAction0d7_KjU = j4;
                    int i10 = bj4VarO.i(jM769getOnAction0d7_KjU) ? 131072 : 65536;
                    i3 |= i10;
                } else {
                    jM769getOnAction0d7_KjU = j4;
                }
                i3 |= i10;
            } else {
                jM769getOnAction0d7_KjU = j4;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    mh4Var2 = mh4Var;
                    if (bj4VarO.j(mh4Var2)) {
                        i4 = 1048576;
                    } else {
                        i4 = 524288;
                    }
                    i3 |= i4;
                }
                if ((i3 & 599187) == 599186 || !bj4VarO.r()) {
                    bj4VarO.v0();
                    if ((i & 1) != 0 || bj4VarO.c0()) {
                        if (i5 != 0) {
                            ox6Var2 = ox6.a.t;
                        } else {
                            ox6Var2 = ox6Var;
                        }
                        if ((i2 & 2) != 0) {
                            jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            chevronColor = getChevronColor(bj4VarO, 0);
                            i3 &= -897;
                        }
                        if (i8 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if ((i2 & 16) != 0) {
                            jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                            i3 &= -57345;
                        } else {
                            jM751getAction0d7_KjU = j5;
                        }
                        if ((i2 & 32) != 0) {
                            jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                            i3 &= -458753;
                        }
                    } else {
                        bj4VarO.u();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        ox6Var2 = ox6Var;
                        str3 = str2;
                        jM751getAction0d7_KjU = j5;
                    }
                    bj4VarO.V();
                    final String str5 = str3;
                    final long j10 = jM751getAction0d7_KjU;
                    final long j11 = jM769getOnAction0d7_KjU;
                    fr1 fr1VarB = gr1.b(-1557616541, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                        public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                            jv0Var.getClass();
                            if ((i11 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            String str6 = str5;
                            if (str6 == null) {
                                return;
                            }
                            JumpToBottomKt.m591UnreadBadgeeaDK9VM(zf7.b((-5.0f) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), ox6.a.t), str6, j10, j11, jt1Var2, 6, 0);
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                            invoke(jv0Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                    final long j12 = jA;
                    final long j13 = chevronColor;
                    final mh4<g2b> mh4Var3 = mh4Var2;
                    wi0.b(fr1VarB, ox6Var2, gr1.b(1814183329, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                        public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                            jv0Var.getClass();
                            if ((i11 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            jt1Var2.K(-1483768055);
                            Object objF = jt1Var2.f();
                            Object obj = objF;
                            if (objF == jt1.a.a) {
                                j37 j37Var = new j37(Boolean.FALSE);
                                j37Var.u(Boolean.TRUE);
                                jt1Var2.C(j37Var);
                                obj = j37Var;
                            }
                            jt1Var2.B();
                            th3 th3VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((tx2) jt1Var2.F(qu1.h)).U0(JumpToBottomKt.getJumpBottomPadding()));
                            final mh4<g2b> mh4Var4 = mh4Var3;
                            final long j14 = j12;
                            final long j15 = j13;
                            dv.b((j37) obj, null, th3VarFloatingButtonEnterTransition, null, null, gr1.b(600504953, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                                public final void invoke(jv jvVar, jt1 jt1Var3, int i12) {
                                    jvVar.getClass();
                                    float jumpBottomPadding = JumpToBottomKt.getJumpBottomPadding();
                                    ox6.a aVar = ox6.a.t;
                                    ox6 ox6VarA = ns0.a(ir9.j(eo7.i(aVar, jumpBottomPadding), 48.0f), 1.0f, IntercomTheme.INSTANCE.getColors(jt1Var3, 6).m765getDivider0d7_KjU(), ay8.a(50));
                                    mh4<g2b> mh4Var5 = mh4Var4;
                                    long j16 = j14;
                                    final long j17 = j15;
                                    fl6 fl6VarD = dv0.d(di.a.a, false);
                                    int iHashCode = Long.hashCode(jt1Var3.v());
                                    kw7 kw7VarY = jt1Var3.y();
                                    ox6 ox6VarC = it1.c(jt1Var3, ox6VarA);
                                    bt1.c.getClass();
                                    qr5.a aVar2 = bt1.a.b;
                                    if (jt1Var3.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var3.q();
                                    if (jt1Var3.l()) {
                                        jt1Var3.k(aVar2);
                                    } else {
                                        jt1Var3.z();
                                    }
                                    rd7.d(jt1Var3, bt1.a.f, fl6VarD);
                                    rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                                    rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                                    rd7.c(jt1Var3, bt1.a.h);
                                    rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                                    o54.a(mh4Var5, ir9.j(aVar, 48.0f), ay8.a(50), j16, 0L, null, gr1.b(2122957953, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                        public final void invoke(jt1 jt1Var4, int i13) {
                                            if ((i13 & 3) == 2 && jt1Var4.r()) {
                                                jt1Var4.u();
                                            } else {
                                                m65.b(is7.a(R.drawable.intercom_ic_chevron_down, jt1Var4, 0), "Jump to bottom", ir9.j(ox6.a.t, 24.0f), j17, jt1Var4, 440, 0);
                                            }
                                        }

                                        @Override // defpackage.ci4
                                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                            invoke(jt1Var4, num.intValue());
                                            return g2b.a;
                                        }
                                    }, jt1Var3), jt1Var3, 12582960, 112);
                                    jt1Var3.I();
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var3, Integer num) {
                                    invoke(jvVar, jt1Var3, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 196608, 26);
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                            invoke(jv0Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 << 3) & 112) | 390);
                    j6 = jA;
                    j7 = chevronColor;
                    str4 = str3;
                    j8 = jM751getAction0d7_KjU;
                } else {
                    bj4VarO.u();
                    ox6Var2 = ox6Var;
                    j6 = jA;
                    j7 = chevronColor;
                    str4 = str2;
                    j8 = j5;
                }
                j9 = jM769getOnAction0d7_KjU;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: qn5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(ox6Var2, j6, j7, str4, j8, j9, mh4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            mh4Var2 = mh4Var;
            if ((i3 & 599187) == 599186) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if ((i2 & 2) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        chevronColor = getChevronColor(bj4VarO, 0);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 16) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM751getAction0d7_KjU = j5;
                    }
                    if ((i2 & 32) != 0) {
                        jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                        i3 &= -458753;
                    }
                } else {
                    if (i5 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if ((i2 & 2) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        chevronColor = getChevronColor(bj4VarO, 0);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 16) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM751getAction0d7_KjU = j5;
                    }
                    if ((i2 & 32) != 0) {
                        jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                        i3 &= -458753;
                    }
                }
                bj4VarO.V();
                final String str6 = str3;
                final long j14 = jM751getAction0d7_KjU;
                final long j15 = jM769getOnAction0d7_KjU;
                fr1 fr1VarB2 = gr1.b(-1557616541, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                        jv0Var.getClass();
                        if ((i11 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String str7 = str6;
                        if (str7 == null) {
                            return;
                        }
                        JumpToBottomKt.m591UnreadBadgeeaDK9VM(zf7.b((-5.0f) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), ox6.a.t), str7, j14, j15, jt1Var2, 6, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                final long j16 = jA;
                final long j17 = chevronColor;
                final mh4<g2b> mh4Var4 = mh4Var2;
                wi0.b(fr1VarB2, ox6Var2, gr1.b(1814183329, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                        jv0Var.getClass();
                        if ((i11 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        jt1Var2.K(-1483768055);
                        Object objF = jt1Var2.f();
                        Object obj = objF;
                        if (objF == jt1.a.a) {
                            j37 j37Var = new j37(Boolean.FALSE);
                            j37Var.u(Boolean.TRUE);
                            jt1Var2.C(j37Var);
                            obj = j37Var;
                        }
                        jt1Var2.B();
                        th3 th3VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((tx2) jt1Var2.F(qu1.h)).U0(JumpToBottomKt.getJumpBottomPadding()));
                        final mh4<g2b> mh4Var5 = mh4Var4;
                        final long j18 = j16;
                        final long j19 = j17;
                        dv.b((j37) obj, null, th3VarFloatingButtonEnterTransition, null, null, gr1.b(600504953, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            public final void invoke(jv jvVar, jt1 jt1Var3, int i12) {
                                jvVar.getClass();
                                float jumpBottomPadding = JumpToBottomKt.getJumpBottomPadding();
                                ox6.a aVar = ox6.a.t;
                                ox6 ox6VarA = ns0.a(ir9.j(eo7.i(aVar, jumpBottomPadding), 48.0f), 1.0f, IntercomTheme.INSTANCE.getColors(jt1Var3, 6).m765getDivider0d7_KjU(), ay8.a(50));
                                mh4<g2b> mh4Var6 = mh4Var5;
                                long j110 = j18;
                                final long j111 = j19;
                                fl6 fl6VarD = dv0.d(di.a.a, false);
                                int iHashCode = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY = jt1Var3.y();
                                ox6 ox6VarC = it1.c(jt1Var3, ox6VarA);
                                bt1.c.getClass();
                                qr5.a aVar2 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, bt1.a.f, fl6VarD);
                                rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                                rd7.c(jt1Var3, bt1.a.h);
                                rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                                o54.a(mh4Var6, ir9.j(aVar, 48.0f), ay8.a(50), j110, 0L, null, gr1.b(2122957953, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                    public final void invoke(jt1 jt1Var4, int i13) {
                                        if ((i13 & 3) == 2 && jt1Var4.r()) {
                                            jt1Var4.u();
                                        } else {
                                            m65.b(is7.a(R.drawable.intercom_ic_chevron_down, jt1Var4, 0), "Jump to bottom", ir9.j(ox6.a.t, 24.0f), j111, jt1Var4, 440, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                        invoke(jt1Var4, num.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var3), jt1Var3, 12582960, 112);
                                jt1Var3.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var3, Integer num) {
                                invoke(jvVar, jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 196608, 26);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 << 3) & 112) | 390);
                j6 = jA;
                j7 = chevronColor;
                str4 = str3;
                j8 = jM751getAction0d7_KjU;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if ((i2 & 2) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        chevronColor = getChevronColor(bj4VarO, 0);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 16) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM751getAction0d7_KjU = j5;
                    }
                    if ((i2 & 32) != 0) {
                        jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                        i3 &= -458753;
                    }
                } else {
                    if (i5 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if ((i2 & 2) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        chevronColor = getChevronColor(bj4VarO, 0);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 16) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM751getAction0d7_KjU = j5;
                    }
                    if ((i2 & 32) != 0) {
                        jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                        i3 &= -458753;
                    }
                }
                bj4VarO.V();
                final String str7 = str3;
                final long j18 = jM751getAction0d7_KjU;
                final long j19 = jM769getOnAction0d7_KjU;
                fr1 fr1VarB3 = gr1.b(-1557616541, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                        jv0Var.getClass();
                        if ((i11 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String str8 = str7;
                        if (str8 == null) {
                            return;
                        }
                        JumpToBottomKt.m591UnreadBadgeeaDK9VM(zf7.b((-5.0f) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), ox6.a.t), str8, j18, j19, jt1Var2, 6, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                final long j110 = jA;
                final long j111 = chevronColor;
                final mh4<g2b> mh4Var5 = mh4Var2;
                wi0.b(fr1VarB3, ox6Var2, gr1.b(1814183329, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                        jv0Var.getClass();
                        if ((i11 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        jt1Var2.K(-1483768055);
                        Object objF = jt1Var2.f();
                        Object obj = objF;
                        if (objF == jt1.a.a) {
                            j37 j37Var = new j37(Boolean.FALSE);
                            j37Var.u(Boolean.TRUE);
                            jt1Var2.C(j37Var);
                            obj = j37Var;
                        }
                        jt1Var2.B();
                        th3 th3VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((tx2) jt1Var2.F(qu1.h)).U0(JumpToBottomKt.getJumpBottomPadding()));
                        final mh4<g2b> mh4Var6 = mh4Var5;
                        final long j112 = j110;
                        final long j113 = j111;
                        dv.b((j37) obj, null, th3VarFloatingButtonEnterTransition, null, null, gr1.b(600504953, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            public final void invoke(jv jvVar, jt1 jt1Var3, int i12) {
                                jvVar.getClass();
                                float jumpBottomPadding = JumpToBottomKt.getJumpBottomPadding();
                                ox6.a aVar = ox6.a.t;
                                ox6 ox6VarA = ns0.a(ir9.j(eo7.i(aVar, jumpBottomPadding), 48.0f), 1.0f, IntercomTheme.INSTANCE.getColors(jt1Var3, 6).m765getDivider0d7_KjU(), ay8.a(50));
                                mh4<g2b> mh4Var7 = mh4Var6;
                                long j114 = j112;
                                final long j115 = j113;
                                fl6 fl6VarD = dv0.d(di.a.a, false);
                                int iHashCode = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY = jt1Var3.y();
                                ox6 ox6VarC = it1.c(jt1Var3, ox6VarA);
                                bt1.c.getClass();
                                qr5.a aVar2 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, bt1.a.f, fl6VarD);
                                rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                                rd7.c(jt1Var3, bt1.a.h);
                                rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                                o54.a(mh4Var7, ir9.j(aVar, 48.0f), ay8.a(50), j114, 0L, null, gr1.b(2122957953, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                    public final void invoke(jt1 jt1Var4, int i13) {
                                        if ((i13 & 3) == 2 && jt1Var4.r()) {
                                            jt1Var4.u();
                                        } else {
                                            m65.b(is7.a(R.drawable.intercom_ic_chevron_down, jt1Var4, 0), "Jump to bottom", ir9.j(ox6.a.t, 24.0f), j115, jt1Var4, 440, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                        invoke(jt1Var4, num.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var3), jt1Var3, 12582960, 112);
                                jt1Var3.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var3, Integer num) {
                                invoke(jvVar, jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 196608, 26);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 << 3) & 112) | 390);
                j6 = jA;
                j7 = chevronColor;
                str4 = str3;
                j8 = jM751getAction0d7_KjU;
            }
            j9 = jM769getOnAction0d7_KjU;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: qn5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(ox6Var2, j6, j7, str4, j8, j9, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        str2 = str;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j5 = j3;
                if (bj4VarO.i(j5)) {
                }
                i3 |= i9;
            } else {
                j5 = j3;
            }
            i3 |= i9;
        } else {
            j5 = j3;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                jM769getOnAction0d7_KjU = j4;
                if (bj4VarO.i(jM769getOnAction0d7_KjU)) {
                }
                i3 |= i10;
            } else {
                jM769getOnAction0d7_KjU = j4;
            }
            i3 |= i10;
        } else {
            jM769getOnAction0d7_KjU = j4;
        }
        if ((i2 & 64) != 0) {
            if ((i & 1572864) == 0) {
                mh4Var2 = mh4Var;
                if (bj4VarO.j(mh4Var2)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((i3 & 599187) == 599186) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if ((i2 & 2) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        chevronColor = getChevronColor(bj4VarO, 0);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 16) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM751getAction0d7_KjU = j5;
                    }
                    if ((i2 & 32) != 0) {
                        jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                        i3 &= -458753;
                    }
                } else {
                    if (i5 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if ((i2 & 2) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        chevronColor = getChevronColor(bj4VarO, 0);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 16) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM751getAction0d7_KjU = j5;
                    }
                    if ((i2 & 32) != 0) {
                        jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                        i3 &= -458753;
                    }
                }
                bj4VarO.V();
                final String str8 = str3;
                final long j112 = jM751getAction0d7_KjU;
                final long j113 = jM769getOnAction0d7_KjU;
                fr1 fr1VarB4 = gr1.b(-1557616541, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                        jv0Var.getClass();
                        if ((i11 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String str9 = str8;
                        if (str9 == null) {
                            return;
                        }
                        JumpToBottomKt.m591UnreadBadgeeaDK9VM(zf7.b((-5.0f) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), ox6.a.t), str9, j112, j113, jt1Var2, 6, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                final long j114 = jA;
                final long j115 = chevronColor;
                final mh4<g2b> mh4Var6 = mh4Var2;
                wi0.b(fr1VarB4, ox6Var2, gr1.b(1814183329, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                        jv0Var.getClass();
                        if ((i11 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        jt1Var2.K(-1483768055);
                        Object objF = jt1Var2.f();
                        Object obj = objF;
                        if (objF == jt1.a.a) {
                            j37 j37Var = new j37(Boolean.FALSE);
                            j37Var.u(Boolean.TRUE);
                            jt1Var2.C(j37Var);
                            obj = j37Var;
                        }
                        jt1Var2.B();
                        th3 th3VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((tx2) jt1Var2.F(qu1.h)).U0(JumpToBottomKt.getJumpBottomPadding()));
                        final mh4<g2b> mh4Var7 = mh4Var6;
                        final long j116 = j114;
                        final long j117 = j115;
                        dv.b((j37) obj, null, th3VarFloatingButtonEnterTransition, null, null, gr1.b(600504953, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            public final void invoke(jv jvVar, jt1 jt1Var3, int i12) {
                                jvVar.getClass();
                                float jumpBottomPadding = JumpToBottomKt.getJumpBottomPadding();
                                ox6.a aVar = ox6.a.t;
                                ox6 ox6VarA = ns0.a(ir9.j(eo7.i(aVar, jumpBottomPadding), 48.0f), 1.0f, IntercomTheme.INSTANCE.getColors(jt1Var3, 6).m765getDivider0d7_KjU(), ay8.a(50));
                                mh4<g2b> mh4Var8 = mh4Var7;
                                long j118 = j116;
                                final long j119 = j117;
                                fl6 fl6VarD = dv0.d(di.a.a, false);
                                int iHashCode = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY = jt1Var3.y();
                                ox6 ox6VarC = it1.c(jt1Var3, ox6VarA);
                                bt1.c.getClass();
                                qr5.a aVar2 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, bt1.a.f, fl6VarD);
                                rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                                rd7.c(jt1Var3, bt1.a.h);
                                rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                                o54.a(mh4Var8, ir9.j(aVar, 48.0f), ay8.a(50), j118, 0L, null, gr1.b(2122957953, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                    public final void invoke(jt1 jt1Var4, int i13) {
                                        if ((i13 & 3) == 2 && jt1Var4.r()) {
                                            jt1Var4.u();
                                        } else {
                                            m65.b(is7.a(R.drawable.intercom_ic_chevron_down, jt1Var4, 0), "Jump to bottom", ir9.j(ox6.a.t, 24.0f), j119, jt1Var4, 440, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                        invoke(jt1Var4, num.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var3), jt1Var3, 12582960, 112);
                                jt1Var3.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var3, Integer num) {
                                invoke(jvVar, jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 196608, 26);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 << 3) & 112) | 390);
                j6 = jA;
                j7 = chevronColor;
                str4 = str3;
                j8 = jM751getAction0d7_KjU;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if ((i2 & 2) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        chevronColor = getChevronColor(bj4VarO, 0);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 16) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM751getAction0d7_KjU = j5;
                    }
                    if ((i2 & 32) != 0) {
                        jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                        i3 &= -458753;
                    }
                } else {
                    if (i5 != 0) {
                        ox6Var2 = ox6.a.t;
                    } else {
                        ox6Var2 = ox6Var;
                    }
                    if ((i2 & 2) != 0) {
                        jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        chevronColor = getChevronColor(bj4VarO, 0);
                        i3 &= -897;
                    }
                    if (i8 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 16) != 0) {
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                        i3 &= -57345;
                    } else {
                        jM751getAction0d7_KjU = j5;
                    }
                    if ((i2 & 32) != 0) {
                        jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                        i3 &= -458753;
                    }
                }
                bj4VarO.V();
                final String str9 = str3;
                final long j116 = jM751getAction0d7_KjU;
                final long j117 = jM769getOnAction0d7_KjU;
                fr1 fr1VarB5 = gr1.b(-1557616541, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                        jv0Var.getClass();
                        if ((i11 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        String str10 = str9;
                        if (str10 == null) {
                            return;
                        }
                        JumpToBottomKt.m591UnreadBadgeeaDK9VM(zf7.b((-5.0f) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), ox6.a.t), str10, j116, j117, jt1Var2, 6, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
                final long j118 = jA;
                final long j119 = chevronColor;
                final mh4<g2b> mh4Var7 = mh4Var2;
                wi0.b(fr1VarB5, ox6Var2, gr1.b(1814183329, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                        jv0Var.getClass();
                        if ((i11 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        jt1Var2.K(-1483768055);
                        Object objF = jt1Var2.f();
                        Object obj = objF;
                        if (objF == jt1.a.a) {
                            j37 j37Var = new j37(Boolean.FALSE);
                            j37Var.u(Boolean.TRUE);
                            jt1Var2.C(j37Var);
                            obj = j37Var;
                        }
                        jt1Var2.B();
                        th3 th3VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((tx2) jt1Var2.F(qu1.h)).U0(JumpToBottomKt.getJumpBottomPadding()));
                        final mh4<g2b> mh4Var8 = mh4Var7;
                        final long j1110 = j118;
                        final long j1111 = j119;
                        dv.b((j37) obj, null, th3VarFloatingButtonEnterTransition, null, null, gr1.b(600504953, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            public final void invoke(jv jvVar, jt1 jt1Var3, int i12) {
                                jvVar.getClass();
                                float jumpBottomPadding = JumpToBottomKt.getJumpBottomPadding();
                                ox6.a aVar = ox6.a.t;
                                ox6 ox6VarA = ns0.a(ir9.j(eo7.i(aVar, jumpBottomPadding), 48.0f), 1.0f, IntercomTheme.INSTANCE.getColors(jt1Var3, 6).m765getDivider0d7_KjU(), ay8.a(50));
                                mh4<g2b> mh4Var9 = mh4Var8;
                                long j1112 = j1110;
                                final long j1113 = j1111;
                                fl6 fl6VarD = dv0.d(di.a.a, false);
                                int iHashCode = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY = jt1Var3.y();
                                ox6 ox6VarC = it1.c(jt1Var3, ox6VarA);
                                bt1.c.getClass();
                                qr5.a aVar2 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, bt1.a.f, fl6VarD);
                                rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                                rd7.c(jt1Var3, bt1.a.h);
                                rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                                o54.a(mh4Var9, ir9.j(aVar, 48.0f), ay8.a(50), j1112, 0L, null, gr1.b(2122957953, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                    public final void invoke(jt1 jt1Var4, int i13) {
                                        if ((i13 & 3) == 2 && jt1Var4.r()) {
                                            jt1Var4.u();
                                        } else {
                                            m65.b(is7.a(R.drawable.intercom_ic_chevron_down, jt1Var4, 0), "Jump to bottom", ir9.j(ox6.a.t, 24.0f), j1113, jt1Var4, 440, 0);
                                        }
                                    }

                                    @Override // defpackage.ci4
                                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                        invoke(jt1Var4, num.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var3), jt1Var3, 12582960, 112);
                                jt1Var3.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var3, Integer num) {
                                invoke(jvVar, jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 196608, 26);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 << 3) & 112) | 390);
                j6 = jA;
                j7 = chevronColor;
                str4 = str3;
                j8 = jM751getAction0d7_KjU;
            }
            j9 = jM769getOnAction0d7_KjU;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: qn5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(ox6Var2, j6, j7, str4, j8, j9, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 1572864;
        mh4Var2 = mh4Var;
        if ((i3 & 599187) == 599186) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if ((i2 & 2) != 0) {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    chevronColor = getChevronColor(bj4VarO, 0);
                    i3 &= -897;
                }
                if (i8 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if ((i2 & 16) != 0) {
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                    i3 &= -57345;
                } else {
                    jM751getAction0d7_KjU = j5;
                }
                if ((i2 & 32) != 0) {
                    jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                    i3 &= -458753;
                }
            } else {
                if (i5 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if ((i2 & 2) != 0) {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    chevronColor = getChevronColor(bj4VarO, 0);
                    i3 &= -897;
                }
                if (i8 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if ((i2 & 16) != 0) {
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                    i3 &= -57345;
                } else {
                    jM751getAction0d7_KjU = j5;
                }
                if ((i2 & 32) != 0) {
                    jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                    i3 &= -458753;
                }
            }
            bj4VarO.V();
            final String str10 = str3;
            final long j1110 = jM751getAction0d7_KjU;
            final long j1111 = jM769getOnAction0d7_KjU;
            fr1 fr1VarB6 = gr1.b(-1557616541, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                    jv0Var.getClass();
                    if ((i11 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    String str11 = str10;
                    if (str11 == null) {
                        return;
                    }
                    JumpToBottomKt.m591UnreadBadgeeaDK9VM(zf7.b((-5.0f) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), ox6.a.t), str11, j1110, j1111, jt1Var2, 6, 0);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                    invoke(jv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO);
            final long j1112 = jA;
            final long j1113 = chevronColor;
            final mh4<g2b> mh4Var8 = mh4Var2;
            wi0.b(fr1VarB6, ox6Var2, gr1.b(1814183329, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                    jv0Var.getClass();
                    if ((i11 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    jt1Var2.K(-1483768055);
                    Object objF = jt1Var2.f();
                    Object obj = objF;
                    if (objF == jt1.a.a) {
                        j37 j37Var = new j37(Boolean.FALSE);
                        j37Var.u(Boolean.TRUE);
                        jt1Var2.C(j37Var);
                        obj = j37Var;
                    }
                    jt1Var2.B();
                    th3 th3VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((tx2) jt1Var2.F(qu1.h)).U0(JumpToBottomKt.getJumpBottomPadding()));
                    final mh4<g2b> mh4Var9 = mh4Var8;
                    final long j1114 = j1112;
                    final long j1115 = j1113;
                    dv.b((j37) obj, null, th3VarFloatingButtonEnterTransition, null, null, gr1.b(600504953, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                        public final void invoke(jv jvVar, jt1 jt1Var3, int i12) {
                            jvVar.getClass();
                            float jumpBottomPadding = JumpToBottomKt.getJumpBottomPadding();
                            ox6.a aVar = ox6.a.t;
                            ox6 ox6VarA = ns0.a(ir9.j(eo7.i(aVar, jumpBottomPadding), 48.0f), 1.0f, IntercomTheme.INSTANCE.getColors(jt1Var3, 6).m765getDivider0d7_KjU(), ay8.a(50));
                            mh4<g2b> mh4Var10 = mh4Var9;
                            long j1116 = j1114;
                            final long j1117 = j1115;
                            fl6 fl6VarD = dv0.d(di.a.a, false);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6VarA);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, bt1.a.f, fl6VarD);
                            rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var3, bt1.a.h);
                            rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                            o54.a(mh4Var10, ir9.j(aVar, 48.0f), ay8.a(50), j1116, 0L, null, gr1.b(2122957953, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                public final void invoke(jt1 jt1Var4, int i13) {
                                    if ((i13 & 3) == 2 && jt1Var4.r()) {
                                        jt1Var4.u();
                                    } else {
                                        m65.b(is7.a(R.drawable.intercom_ic_chevron_down, jt1Var4, 0), "Jump to bottom", ir9.j(ox6.a.t, 24.0f), j1117, jt1Var4, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                    invoke(jt1Var4, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var3), jt1Var3, 12582960, 112);
                            jt1Var3.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var3, Integer num) {
                            invoke(jvVar, jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, 196608, 26);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                    invoke(jv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i3 << 3) & 112) | 390);
            j6 = jA;
            j7 = chevronColor;
            str4 = str3;
            j8 = jM751getAction0d7_KjU;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if ((i2 & 2) != 0) {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    chevronColor = getChevronColor(bj4VarO, 0);
                    i3 &= -897;
                }
                if (i8 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if ((i2 & 16) != 0) {
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                    i3 &= -57345;
                } else {
                    jM751getAction0d7_KjU = j5;
                }
                if ((i2 & 32) != 0) {
                    jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                    i3 &= -458753;
                }
            } else {
                if (i5 != 0) {
                    ox6Var2 = ox6.a.t;
                } else {
                    ox6Var2 = ox6Var;
                }
                if ((i2 & 2) != 0) {
                    jA = kk.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    chevronColor = getChevronColor(bj4VarO, 0);
                    i3 &= -897;
                }
                if (i8 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if ((i2 & 16) != 0) {
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                    i3 &= -57345;
                } else {
                    jM751getAction0d7_KjU = j5;
                }
                if ((i2 & 32) != 0) {
                    jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                    i3 &= -458753;
                }
            }
            bj4VarO.V();
            final String str11 = str3;
            final long j1114 = jM751getAction0d7_KjU;
            final long j1115 = jM769getOnAction0d7_KjU;
            fr1 fr1VarB7 = gr1.b(-1557616541, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                    jv0Var.getClass();
                    if ((i11 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    String str12 = str11;
                    if (str12 == null) {
                        return;
                    }
                    JumpToBottomKt.m591UnreadBadgeeaDK9VM(zf7.b((-5.0f) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), ox6.a.t), str12, j1114, j1115, jt1Var2, 6, 0);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                    invoke(jv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO);
            final long j1116 = jA;
            final long j1117 = chevronColor;
            final mh4<g2b> mh4Var9 = mh4Var2;
            wi0.b(fr1VarB7, ox6Var2, gr1.b(1814183329, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i11) {
                    jv0Var.getClass();
                    if ((i11 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    jt1Var2.K(-1483768055);
                    Object objF = jt1Var2.f();
                    Object obj = objF;
                    if (objF == jt1.a.a) {
                        j37 j37Var = new j37(Boolean.FALSE);
                        j37Var.u(Boolean.TRUE);
                        jt1Var2.C(j37Var);
                        obj = j37Var;
                    }
                    jt1Var2.B();
                    th3 th3VarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((tx2) jt1Var2.F(qu1.h)).U0(JumpToBottomKt.getJumpBottomPadding()));
                    final mh4<g2b> mh4Var10 = mh4Var9;
                    final long j1118 = j1116;
                    final long j1119 = j1117;
                    dv.b((j37) obj, null, th3VarFloatingButtonEnterTransition, null, null, gr1.b(600504953, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                        public final void invoke(jv jvVar, jt1 jt1Var3, int i12) {
                            jvVar.getClass();
                            float jumpBottomPadding = JumpToBottomKt.getJumpBottomPadding();
                            ox6.a aVar = ox6.a.t;
                            ox6 ox6VarA = ns0.a(ir9.j(eo7.i(aVar, jumpBottomPadding), 48.0f), 1.0f, IntercomTheme.INSTANCE.getColors(jt1Var3, 6).m765getDivider0d7_KjU(), ay8.a(50));
                            mh4<g2b> mh4Var11 = mh4Var10;
                            long j11110 = j1118;
                            final long j11111 = j1119;
                            fl6 fl6VarD = dv0.d(di.a.a, false);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6VarA);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, bt1.a.f, fl6VarD);
                            rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var3, bt1.a.h);
                            rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                            o54.a(mh4Var11, ir9.j(aVar, 48.0f), ay8.a(50), j11110, 0L, null, gr1.b(2122957953, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                public final void invoke(jt1 jt1Var4, int i13) {
                                    if ((i13 & 3) == 2 && jt1Var4.r()) {
                                        jt1Var4.u();
                                    } else {
                                        m65.b(is7.a(R.drawable.intercom_ic_chevron_down, jt1Var4, 0), "Jump to bottom", ir9.j(ox6.a.t, 24.0f), j11111, jt1Var4, 440, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var4, Integer num) {
                                    invoke(jt1Var4, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var3), jt1Var3, 12582960, 112);
                            jt1Var3.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var3, Integer num) {
                            invoke(jvVar, jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, 196608, 26);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                    invoke(jv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i3 << 3) & 112) | 390);
            j6 = jA;
            j7 = chevronColor;
            str4 = str3;
            j8 = jM751getAction0d7_KjU;
        }
        j9 = jM769getOnAction0d7_KjU;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: qn5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(ox6Var2, j6, j7, str4, j8, j9, mh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void JumpToBottomPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1260816059);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$JumpToBottomKt.INSTANCE.m565getLambda1$intercom_sdk_ui_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new pn5(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b JumpToBottomPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        JumpToBottomPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b JumpToBottom_kNRdK3w$lambda$0(ox6 ox6Var, long j, long j2, String str, long j3, long j4, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        m590JumpToBottomkNRdK3w(ox6Var, j, j2, str, j3, j4, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: UnreadBadge-eaDK9VM, reason: not valid java name */
    public static final void m591UnreadBadgeeaDK9VM(ox6 ox6Var, final String str, long j, long j2, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        long jM751getAction0d7_KjU;
        long jM769getOnAction0d7_KjU;
        long j3;
        ox6 ox6Var3;
        final long j4;
        final long j5;
        bj4 bj4VarO = jt1Var.o(885989429);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jM751getAction0d7_KjU = j;
                int i5 = bj4VarO.i(jM751getAction0d7_KjU) ? 256 : 128;
                i3 |= i5;
            } else {
                jM751getAction0d7_KjU = j;
            }
            i3 |= i5;
        } else {
            jM751getAction0d7_KjU = j;
        }
        if ((i & 3072) == 0) {
            jM769getOnAction0d7_KjU = j2;
            i3 |= ((i2 & 8) == 0 && bj4VarO.i(jM769getOnAction0d7_KjU)) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        } else {
            jM769getOnAction0d7_KjU = j2;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            j5 = jM751getAction0d7_KjU;
            j4 = jM769getOnAction0d7_KjU;
        } else {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                ox6 ox6Var4 = i4 != 0 ? ox6.a.t : ox6Var2;
                if ((i2 & 4) != 0) {
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m751getAction0d7_KjU();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, 6).m769getOnAction0d7_KjU();
                    i3 &= -7169;
                }
                j3 = jM769getOnAction0d7_KjU;
                ox6Var3 = ox6Var4;
            } else {
                bj4VarO.u();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                j3 = jM769getOnAction0d7_KjU;
                ox6Var3 = ox6Var2;
            }
            final long j6 = j3;
            long j7 = jM751getAction0d7_KjU;
            bj4VarO.V();
            wi0.a(ox6Var3, j7, 0L, gr1.b(-480925784, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$UnreadBadge$1
                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i6) {
                    oy8Var.getClass();
                    if ((i6 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    mia.b(str, ox6.a.t, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(jt1Var2, 6).getType05(), j6, cka.b(12), ob4.B, null, 0L, 0L, null, null, 16744440), jt1Var2, 48, 0, 131068);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                    invoke(oy8Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (i3 & 14) | 3072 | ((i3 >> 3) & 112), 4);
            j4 = j6;
            ox6Var2 = ox6Var3;
            j5 = j7;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: rn5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return JumpToBottomKt.UnreadBadge_eaDK9VM$lambda$2(ox6Var2, str, j5, j4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UnreadBadge_eaDK9VM$lambda$2(ox6 ox6Var, String str, long j, long j2, int i, int i2, jt1 jt1Var, int i3) {
        m591UnreadBadgeeaDK9VM(ox6Var, str, j, j2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final long getChevronColor(jt1 jt1Var, int i) {
        long jM752getActionContrastWhite0d7_KjU;
        jt1Var.K(179733836);
        int i2 = WhenMappings.$EnumSwitchMapping$0[IntercomColorsKt.getCurrentThemeMode().getValue().ordinal()];
        if (i2 == 1) {
            jt1Var.K(-131337460);
            jt1Var.B();
            jM752getActionContrastWhite0d7_KjU = uh1.e;
        } else if (i2 == 2) {
            jt1Var.K(-131335846);
            jM752getActionContrastWhite0d7_KjU = IntercomTheme.INSTANCE.getColors(jt1Var, 6).m752getActionContrastWhite0d7_KjU();
            jt1Var.B();
        } else {
            if (i2 != 3) {
                jt1Var.K(-131339145);
                jt1Var.B();
                u.b();
                return 0L;
            }
            jt1Var.K(223601735);
            jM752getActionContrastWhite0d7_KjU = gz3.q(jt1Var) ? uh1.e : IntercomTheme.INSTANCE.getColors(jt1Var, 6).m752getActionContrastWhite0d7_KjU();
            jt1Var.B();
        }
        jt1Var.B();
        return jM752getActionContrastWhite0d7_KjU;
    }

    public static final float getJumpBottomPadding() {
        return JumpBottomPadding;
    }
}
