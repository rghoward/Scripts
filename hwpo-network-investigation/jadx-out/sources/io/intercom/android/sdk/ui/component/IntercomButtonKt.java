package io.intercom.android.sdk.ui.component;

import defpackage.b47;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ih5;
import defpackage.ir9;
import defpackage.is7;
import defpackage.jh5;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.ko7;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.wja;
import defpackage.xj8;
import defpackage.zy0;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomButtonKt {
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void IntercomButton(ox6 ox6Var, final IntercomButton.Style style, final String str, Integer num, final mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        Integer num2;
        mh4<g2b> mh4Var2;
        int i4;
        ox6 ox6Var3;
        final Integer num3;
        final Integer num4;
        xj8 xj8VarW;
        style.getClass();
        str.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(1819808567);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= bj4VarO.J(style) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(str) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                num2 = num;
                i3 |= bj4VarO.J(num2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    mh4Var2 = mh4Var;
                    if (bj4VarO.j(mh4Var2)) {
                        i4 = 16384;
                    } else {
                        i4 = 8192;
                    }
                    i3 |= i4;
                }
                if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    ko7 ko7Var = zy0.a;
                    mh4<g2b> mh4Var3 = mh4Var2;
                    ox6 ox6Var4 = ox6Var3;
                    jz0.b(mh4Var3, ox6Var4, false, IntercomTheme.INSTANCE.getShapes(bj4VarO, 6).b, zy0.e(style.m575getBackgroundColor0d7_KjU(), style.m576getContentColor0d7_KjU(), bj4VarO), style.getBorder(), new ko7(12.0f, 10.0f, 12.0f, 10.0f), gr1.b(905924137, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i7) {
                            oy8Var.getClass();
                            if ((i7 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            wja type04 = IntercomTheme.INSTANCE.getTypography(jt1Var2, 6).getType04();
                            mia.b(str, null, style.m576getContentColor0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                            Integer num5 = num3;
                            if (num5 == null) {
                                return;
                            }
                            IntercomButton.Style style2 = style;
                            int iIntValue = num5.intValue();
                            ox6.a aVar = ox6.a.t;
                            b47.b(jt1Var2, ir9.n(aVar, 6.0f));
                            m65.b(is7.a(iIntValue, jt1Var2, 0), null, ir9.j(aVar, 16.0f), style2.m576getContentColor0d7_KjU(), jt1Var2, 440, 0);
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num5) {
                            invoke(oy8Var, jt1Var2, num5.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 12) & 14) | 817889280 | ((i3 << 3) & 112), 292);
                    num4 = num3;
                    ox6Var2 = ox6Var4;
                } else {
                    bj4VarO.u();
                    num4 = num2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: kh5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomButtonKt.IntercomButton$lambda$0(ox6Var2, style, str, num4, mh4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            mh4Var2 = mh4Var;
            if ((i3 & 9363) == 9362) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                ko7 ko7Var2 = zy0.a;
                mh4<g2b> mh4Var4 = mh4Var2;
                ox6 ox6Var5 = ox6Var3;
                jz0.b(mh4Var4, ox6Var5, false, IntercomTheme.INSTANCE.getShapes(bj4VarO, 6).b, zy0.e(style.m575getBackgroundColor0d7_KjU(), style.m576getContentColor0d7_KjU(), bj4VarO), style.getBorder(), new ko7(12.0f, 10.0f, 12.0f, 10.0f), gr1.b(905924137, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i7) {
                        oy8Var.getClass();
                        if ((i7 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        wja type04 = IntercomTheme.INSTANCE.getTypography(jt1Var2, 6).getType04();
                        mia.b(str, null, style.m576getContentColor0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                        Integer num5 = num3;
                        if (num5 == null) {
                            return;
                        }
                        IntercomButton.Style style2 = style;
                        int iIntValue = num5.intValue();
                        ox6.a aVar = ox6.a.t;
                        b47.b(jt1Var2, ir9.n(aVar, 6.0f));
                        m65.b(is7.a(iIntValue, jt1Var2, 0), null, ir9.j(aVar, 16.0f), style2.m576getContentColor0d7_KjU(), jt1Var2, 440, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num5) {
                        invoke(oy8Var, jt1Var2, num5.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 12) & 14) | 817889280 | ((i3 << 3) & 112), 292);
                num4 = num3;
                ox6Var2 = ox6Var5;
            } else {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                ko7 ko7Var3 = zy0.a;
                mh4<g2b> mh4Var5 = mh4Var2;
                ox6 ox6Var6 = ox6Var3;
                jz0.b(mh4Var5, ox6Var6, false, IntercomTheme.INSTANCE.getShapes(bj4VarO, 6).b, zy0.e(style.m575getBackgroundColor0d7_KjU(), style.m576getContentColor0d7_KjU(), bj4VarO), style.getBorder(), new ko7(12.0f, 10.0f, 12.0f, 10.0f), gr1.b(905924137, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i7) {
                        oy8Var.getClass();
                        if ((i7 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        wja type04 = IntercomTheme.INSTANCE.getTypography(jt1Var2, 6).getType04();
                        mia.b(str, null, style.m576getContentColor0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                        Integer num5 = num3;
                        if (num5 == null) {
                            return;
                        }
                        IntercomButton.Style style2 = style;
                        int iIntValue = num5.intValue();
                        ox6.a aVar = ox6.a.t;
                        b47.b(jt1Var2, ir9.n(aVar, 6.0f));
                        m65.b(is7.a(iIntValue, jt1Var2, 0), null, ir9.j(aVar, 16.0f), style2.m576getContentColor0d7_KjU(), jt1Var2, 440, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num5) {
                        invoke(oy8Var, jt1Var2, num5.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 12) & 14) | 817889280 | ((i3 << 3) & 112), 292);
                num4 = num3;
                ox6Var2 = ox6Var6;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: kh5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomButtonKt.IntercomButton$lambda$0(ox6Var2, style, str, num4, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        num2 = num;
        if ((i2 & 16) != 0) {
            if ((i & 24576) == 0) {
                mh4Var2 = mh4Var;
                if (bj4VarO.j(mh4Var2)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            }
            if ((i3 & 9363) == 9362) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                ko7 ko7Var4 = zy0.a;
                mh4<g2b> mh4Var6 = mh4Var2;
                ox6 ox6Var7 = ox6Var3;
                jz0.b(mh4Var6, ox6Var7, false, IntercomTheme.INSTANCE.getShapes(bj4VarO, 6).b, zy0.e(style.m575getBackgroundColor0d7_KjU(), style.m576getContentColor0d7_KjU(), bj4VarO), style.getBorder(), new ko7(12.0f, 10.0f, 12.0f, 10.0f), gr1.b(905924137, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i7) {
                        oy8Var.getClass();
                        if ((i7 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        wja type04 = IntercomTheme.INSTANCE.getTypography(jt1Var2, 6).getType04();
                        mia.b(str, null, style.m576getContentColor0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                        Integer num5 = num3;
                        if (num5 == null) {
                            return;
                        }
                        IntercomButton.Style style2 = style;
                        int iIntValue = num5.intValue();
                        ox6.a aVar = ox6.a.t;
                        b47.b(jt1Var2, ir9.n(aVar, 6.0f));
                        m65.b(is7.a(iIntValue, jt1Var2, 0), null, ir9.j(aVar, 16.0f), style2.m576getContentColor0d7_KjU(), jt1Var2, 440, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num5) {
                        invoke(oy8Var, jt1Var2, num5.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 12) & 14) | 817889280 | ((i3 << 3) & 112), 292);
                num4 = num3;
                ox6Var2 = ox6Var7;
            } else {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                ko7 ko7Var5 = zy0.a;
                mh4<g2b> mh4Var7 = mh4Var2;
                ox6 ox6Var8 = ox6Var3;
                jz0.b(mh4Var7, ox6Var8, false, IntercomTheme.INSTANCE.getShapes(bj4VarO, 6).b, zy0.e(style.m575getBackgroundColor0d7_KjU(), style.m576getContentColor0d7_KjU(), bj4VarO), style.getBorder(), new ko7(12.0f, 10.0f, 12.0f, 10.0f), gr1.b(905924137, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i7) {
                        oy8Var.getClass();
                        if ((i7 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        wja type04 = IntercomTheme.INSTANCE.getTypography(jt1Var2, 6).getType04();
                        mia.b(str, null, style.m576getContentColor0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                        Integer num5 = num3;
                        if (num5 == null) {
                            return;
                        }
                        IntercomButton.Style style2 = style;
                        int iIntValue = num5.intValue();
                        ox6.a aVar = ox6.a.t;
                        b47.b(jt1Var2, ir9.n(aVar, 6.0f));
                        m65.b(is7.a(iIntValue, jt1Var2, 0), null, ir9.j(aVar, 16.0f), style2.m576getContentColor0d7_KjU(), jt1Var2, 440, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num5) {
                        invoke(oy8Var, jt1Var2, num5.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i3 >> 12) & 14) | 817889280 | ((i3 << 3) & 112), 292);
                num4 = num3;
                ox6Var2 = ox6Var8;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: kh5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomButtonKt.IntercomButton$lambda$0(ox6Var2, style, str, num4, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        mh4Var2 = mh4Var;
        if ((i3 & 9363) == 9362) {
            if (i5 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i6 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            ko7 ko7Var6 = zy0.a;
            mh4<g2b> mh4Var8 = mh4Var2;
            ox6 ox6Var9 = ox6Var3;
            jz0.b(mh4Var8, ox6Var9, false, IntercomTheme.INSTANCE.getShapes(bj4VarO, 6).b, zy0.e(style.m575getBackgroundColor0d7_KjU(), style.m576getContentColor0d7_KjU(), bj4VarO), style.getBorder(), new ko7(12.0f, 10.0f, 12.0f, 10.0f), gr1.b(905924137, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i7) {
                    oy8Var.getClass();
                    if ((i7 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    wja type04 = IntercomTheme.INSTANCE.getTypography(jt1Var2, 6).getType04();
                    mia.b(str, null, style.m576getContentColor0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                    Integer num5 = num3;
                    if (num5 == null) {
                        return;
                    }
                    IntercomButton.Style style2 = style;
                    int iIntValue = num5.intValue();
                    ox6.a aVar = ox6.a.t;
                    b47.b(jt1Var2, ir9.n(aVar, 6.0f));
                    m65.b(is7.a(iIntValue, jt1Var2, 0), null, ir9.j(aVar, 16.0f), style2.m576getContentColor0d7_KjU(), jt1Var2, 440, 0);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num5) {
                    invoke(oy8Var, jt1Var2, num5.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i3 >> 12) & 14) | 817889280 | ((i3 << 3) & 112), 292);
            num4 = num3;
            ox6Var2 = ox6Var9;
        } else {
            if (i5 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i6 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            ko7 ko7Var7 = zy0.a;
            mh4<g2b> mh4Var9 = mh4Var2;
            ox6 ox6Var10 = ox6Var3;
            jz0.b(mh4Var9, ox6Var10, false, IntercomTheme.INSTANCE.getShapes(bj4VarO, 6).b, zy0.e(style.m575getBackgroundColor0d7_KjU(), style.m576getContentColor0d7_KjU(), bj4VarO), style.getBorder(), new ko7(12.0f, 10.0f, 12.0f, 10.0f), gr1.b(905924137, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton.1
                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i7) {
                    oy8Var.getClass();
                    if ((i7 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    wja type04 = IntercomTheme.INSTANCE.getTypography(jt1Var2, 6).getType04();
                    mia.b(str, null, style.m576getContentColor0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                    Integer num5 = num3;
                    if (num5 == null) {
                        return;
                    }
                    IntercomButton.Style style2 = style;
                    int iIntValue = num5.intValue();
                    ox6.a aVar = ox6.a.t;
                    b47.b(jt1Var2, ir9.n(aVar, 6.0f));
                    m65.b(is7.a(iIntValue, jt1Var2, 0), null, ir9.j(aVar, 16.0f), style2.m576getContentColor0d7_KjU(), jt1Var2, 440, 0);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num5) {
                    invoke(oy8Var, jt1Var2, num5.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i3 >> 12) & 14) | 817889280 | ((i3 << 3) & 112), 292);
            num4 = num3;
            ox6Var2 = ox6Var10;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: kh5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomButtonKt.IntercomButton$lambda$0(ox6Var2, style, str, num4, mh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomButton$lambda$0(ox6 ox6Var, IntercomButton.Style style, String str, Integer num, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        IntercomButton(ox6Var, style, str, num, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void OutlinedButtonPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-2065130974);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m559getLambda3$intercom_sdk_ui_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ih5(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b OutlinedButtonPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        OutlinedButtonPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1818981662);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m557getLambda1$intercom_sdk_ui_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jh5(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PrimaryButtonPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        PrimaryButtonPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonWithTrailingIconPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-340414909);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m558getLambda2$intercom_sdk_ui_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hh5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomButtonKt.PrimaryButtonWithTrailingIconPreview$lambda$2(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PrimaryButtonWithTrailingIconPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        PrimaryButtonWithTrailingIconPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
