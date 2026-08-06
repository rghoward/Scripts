package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gr1;
import defpackage.gu4;
import defpackage.gz3;
import defpackage.h65;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.jv0;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.qj2;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.we1;
import defpackage.wi0;
import defpackage.wja;
import defpackage.xj8;
import defpackage.zf7;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderMenuItemRowKt {
    @IntercomPreviews
    public static final void CollapsedHeaderMenuItemDotPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(591640881);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HeaderMenuItemRowKt.INSTANCE.m121getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: fu4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HeaderMenuItemRowKt.CollapsedHeaderMenuItemDotPreview$lambda$10(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CollapsedHeaderMenuItemDotPreview$lambda$10(int i, jt1 jt1Var, int i2) {
        CollapsedHeaderMenuItemDotPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void CollapsedHeaderMenuItemPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1230888234);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HeaderMenuItemRowKt.INSTANCE.m119getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ku4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HeaderMenuItemRowKt.CollapsedHeaderMenuItemPreview$lambda$9(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CollapsedHeaderMenuItemPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        CollapsedHeaderMenuItemPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: CollapsedHeaderMenuItemRow-88mDfTA, reason: not valid java name */
    private static final void m148CollapsedHeaderMenuItemRow88mDfTA(ox6 ox6Var, final String str, final int i, final String str2, final boolean z, final boolean z2, final mh4<g2b> mh4Var, final long j, jt1 jt1Var, final int i2, final int i3) {
        ox6 ox6Var2;
        int i4;
        final String str3;
        final int i5;
        mh4<g2b> mh4Var2;
        long j2;
        int i6;
        final ox6 ox6Var3;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(955883181);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            ox6Var2 = ox6Var;
        } else if ((i2 & 6) == 0) {
            ox6Var2 = ox6Var;
            i4 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i2;
        } else {
            ox6Var2 = ox6Var;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            str3 = str;
        } else {
            str3 = str;
            if ((i2 & 48) == 0) {
                i4 |= bj4VarO.J(str3) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            i5 = i;
        } else {
            i5 = i;
            if ((i2 & 384) == 0) {
                i4 |= bj4VarO.h(i5) ? 256 : 128;
            }
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= bj4VarO.J(str2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= bj4VarO.c(z) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= bj4VarO.c(z2) ? 131072 : 65536;
        }
        if ((i3 & 64) == 0) {
            if ((i2 & 1572864) == 0) {
                mh4Var2 = mh4Var;
                i4 |= bj4VarO.j(mh4Var2) ? 1048576 : 524288;
            }
            if ((i3 & 128) != 0) {
                if ((i2 & 12582912) == 0) {
                    j2 = j;
                    if (bj4VarO.i(j2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
                if ((4793491 & i4) == 4793490 || !bj4VarO.r()) {
                    if (i7 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    final mh4<g2b> mh4Var3 = mh4Var2;
                    final long j3 = j2;
                    wi0.b(gr1.b(-415284443, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                            jv0Var.getClass();
                            if ((i8 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            boolean z3 = z2;
                            ox6.a aVar = ox6.a.t;
                            if (z3) {
                                jt1Var2.K(-1594514865);
                                wi0.a(zf7.b(-10.0f, 10.0f, aVar), u7d.d(4292544041L), 0L, null, jt1Var2, 54, 12);
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(-1594323502);
                            if (str2 == null || !z) {
                                jt1Var2.B();
                            } else {
                                HeaderMenuItemRowKt.UnreadBadge(zf7.b(-6.0f, 4.0f, aVar), str2, jt1Var2, 6, 0);
                                jt1Var2.B();
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                            invoke(jv0Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ox6Var3, gr1.b(1598560935, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                            jv0Var.getClass();
                            if ((i8 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var4 = mh4Var3;
                            final int i9 = i5;
                            final String str4 = str3;
                            final long j4 = j3;
                            h65.b(1572864, 62, jt1Var2, mh4Var4, gr1.b(896985929, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                public final void invoke(jt1 jt1Var3, int i10) {
                                    if ((i10 & 3) == 2 && jt1Var3.r()) {
                                        jt1Var3.u();
                                    } else {
                                        m65.b(is7.a(i9, jt1Var3, 0), str4, ir9.j(ox6.a.t, 24.0f), j4, jt1Var3, 392, 0);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                    invoke(jt1Var3, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), null, null, null, false);
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                            invoke(jv0Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i4 << 3) & 112) | 390);
                } else {
                    bj4VarO.u();
                    ox6Var3 = ox6Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ju4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$3(ox6Var3, str, i, str2, z, z2, mh4Var, j, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i4 |= 12582912;
            j2 = j;
            if ((4793491 & i4) == 4793490) {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                final mh4<g2b> mh4Var4 = mh4Var2;
                final long j4 = j2;
                wi0.b(gr1.b(-415284443, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                        jv0Var.getClass();
                        if ((i8 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean z3 = z2;
                        ox6.a aVar = ox6.a.t;
                        if (z3) {
                            jt1Var2.K(-1594514865);
                            wi0.a(zf7.b(-10.0f, 10.0f, aVar), u7d.d(4292544041L), 0L, null, jt1Var2, 54, 12);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-1594323502);
                        if (str2 == null || !z) {
                            jt1Var2.B();
                        } else {
                            HeaderMenuItemRowKt.UnreadBadge(zf7.b(-6.0f, 4.0f, aVar), str2, jt1Var2, 6, 0);
                            jt1Var2.B();
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6Var3, gr1.b(1598560935, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                        jv0Var.getClass();
                        if ((i8 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var5 = mh4Var4;
                        final int i9 = i5;
                        final String str4 = str3;
                        final long j5 = j4;
                        h65.b(1572864, 62, jt1Var2, mh4Var5, gr1.b(896985929, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            public final void invoke(jt1 jt1Var3, int i10) {
                                if ((i10 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                } else {
                                    m65.b(is7.a(i9, jt1Var3, 0), str4, ir9.j(ox6.a.t, 24.0f), j5, jt1Var3, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), null, null, null, false);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i4 << 3) & 112) | 390);
            } else {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                final mh4<g2b> mh4Var5 = mh4Var2;
                final long j5 = j2;
                wi0.b(gr1.b(-415284443, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                        jv0Var.getClass();
                        if ((i8 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean z3 = z2;
                        ox6.a aVar = ox6.a.t;
                        if (z3) {
                            jt1Var2.K(-1594514865);
                            wi0.a(zf7.b(-10.0f, 10.0f, aVar), u7d.d(4292544041L), 0L, null, jt1Var2, 54, 12);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-1594323502);
                        if (str2 == null || !z) {
                            jt1Var2.B();
                        } else {
                            HeaderMenuItemRowKt.UnreadBadge(zf7.b(-6.0f, 4.0f, aVar), str2, jt1Var2, 6, 0);
                            jt1Var2.B();
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6Var3, gr1.b(1598560935, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                        jv0Var.getClass();
                        if ((i8 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var6 = mh4Var5;
                        final int i9 = i5;
                        final String str4 = str3;
                        final long j6 = j5;
                        h65.b(1572864, 62, jt1Var2, mh4Var6, gr1.b(896985929, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            public final void invoke(jt1 jt1Var3, int i10) {
                                if ((i10 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                } else {
                                    m65.b(is7.a(i9, jt1Var3, 0), str4, ir9.j(ox6.a.t, 24.0f), j6, jt1Var3, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), null, null, null, false);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i4 << 3) & 112) | 390);
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ju4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$3(ox6Var3, str, i, str2, z, z2, mh4Var, j, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 1572864;
        mh4Var2 = mh4Var;
        if ((i3 & 128) != 0) {
            if ((i2 & 12582912) == 0) {
                j2 = j;
                if (bj4VarO.i(j2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
            if ((4793491 & i4) == 4793490) {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                final mh4<g2b> mh4Var6 = mh4Var2;
                final long j6 = j2;
                wi0.b(gr1.b(-415284443, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                        jv0Var.getClass();
                        if ((i8 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean z3 = z2;
                        ox6.a aVar = ox6.a.t;
                        if (z3) {
                            jt1Var2.K(-1594514865);
                            wi0.a(zf7.b(-10.0f, 10.0f, aVar), u7d.d(4292544041L), 0L, null, jt1Var2, 54, 12);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-1594323502);
                        if (str2 == null || !z) {
                            jt1Var2.B();
                        } else {
                            HeaderMenuItemRowKt.UnreadBadge(zf7.b(-6.0f, 4.0f, aVar), str2, jt1Var2, 6, 0);
                            jt1Var2.B();
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6Var3, gr1.b(1598560935, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                        jv0Var.getClass();
                        if ((i8 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var7 = mh4Var6;
                        final int i9 = i5;
                        final String str4 = str3;
                        final long j7 = j6;
                        h65.b(1572864, 62, jt1Var2, mh4Var7, gr1.b(896985929, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            public final void invoke(jt1 jt1Var3, int i10) {
                                if ((i10 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                } else {
                                    m65.b(is7.a(i9, jt1Var3, 0), str4, ir9.j(ox6.a.t, 24.0f), j7, jt1Var3, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), null, null, null, false);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i4 << 3) & 112) | 390);
            } else {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                final mh4<g2b> mh4Var7 = mh4Var2;
                final long j7 = j2;
                wi0.b(gr1.b(-415284443, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                        jv0Var.getClass();
                        if ((i8 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        boolean z3 = z2;
                        ox6.a aVar = ox6.a.t;
                        if (z3) {
                            jt1Var2.K(-1594514865);
                            wi0.a(zf7.b(-10.0f, 10.0f, aVar), u7d.d(4292544041L), 0L, null, jt1Var2, 54, 12);
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(-1594323502);
                        if (str2 == null || !z) {
                            jt1Var2.B();
                        } else {
                            HeaderMenuItemRowKt.UnreadBadge(zf7.b(-6.0f, 4.0f, aVar), str2, jt1Var2, 6, 0);
                            jt1Var2.B();
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6Var3, gr1.b(1598560935, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                        jv0Var.getClass();
                        if ((i8 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var8 = mh4Var7;
                        final int i9 = i5;
                        final String str4 = str3;
                        final long j8 = j7;
                        h65.b(1572864, 62, jt1Var2, mh4Var8, gr1.b(896985929, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            public final void invoke(jt1 jt1Var3, int i10) {
                                if ((i10 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                } else {
                                    m65.b(is7.a(i9, jt1Var3, 0), str4, ir9.j(ox6.a.t, 24.0f), j8, jt1Var3, 392, 0);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), null, null, null, false);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                        invoke(jv0Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, ((i4 << 3) & 112) | 390);
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ju4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$3(ox6Var3, str, i, str2, z, z2, mh4Var, j, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 12582912;
        j2 = j;
        if ((4793491 & i4) == 4793490) {
            if (i7 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            final mh4<g2b> mh4Var8 = mh4Var2;
            final long j8 = j2;
            wi0.b(gr1.b(-415284443, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                    jv0Var.getClass();
                    if ((i8 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    boolean z3 = z2;
                    ox6.a aVar = ox6.a.t;
                    if (z3) {
                        jt1Var2.K(-1594514865);
                        wi0.a(zf7.b(-10.0f, 10.0f, aVar), u7d.d(4292544041L), 0L, null, jt1Var2, 54, 12);
                        jt1Var2.B();
                        return;
                    }
                    jt1Var2.K(-1594323502);
                    if (str2 == null || !z) {
                        jt1Var2.B();
                    } else {
                        HeaderMenuItemRowKt.UnreadBadge(zf7.b(-6.0f, 4.0f, aVar), str2, jt1Var2, 6, 0);
                        jt1Var2.B();
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                    invoke(jv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ox6Var3, gr1.b(1598560935, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                    jv0Var.getClass();
                    if ((i8 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    mh4<g2b> mh4Var9 = mh4Var8;
                    final int i9 = i5;
                    final String str4 = str3;
                    final long j9 = j8;
                    h65.b(1572864, 62, jt1Var2, mh4Var9, gr1.b(896985929, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                        public final void invoke(jt1 jt1Var3, int i10) {
                            if ((i10 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                            } else {
                                m65.b(is7.a(i9, jt1Var3, 0), str4, ir9.j(ox6.a.t, 24.0f), j9, jt1Var3, 392, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                            invoke(jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), null, null, null, false);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                    invoke(jv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i4 << 3) & 112) | 390);
        } else {
            if (i7 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            final mh4<g2b> mh4Var9 = mh4Var2;
            final long j9 = j2;
            wi0.b(gr1.b(-415284443, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                    jv0Var.getClass();
                    if ((i8 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    boolean z3 = z2;
                    ox6.a aVar = ox6.a.t;
                    if (z3) {
                        jt1Var2.K(-1594514865);
                        wi0.a(zf7.b(-10.0f, 10.0f, aVar), u7d.d(4292544041L), 0L, null, jt1Var2, 54, 12);
                        jt1Var2.B();
                        return;
                    }
                    jt1Var2.K(-1594323502);
                    if (str2 == null || !z) {
                        jt1Var2.B();
                    } else {
                        HeaderMenuItemRowKt.UnreadBadge(zf7.b(-6.0f, 4.0f, aVar), str2, jt1Var2, 6, 0);
                        jt1Var2.B();
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                    invoke(jv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ox6Var3, gr1.b(1598560935, new ei4<jv0, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                public final void invoke(jv0 jv0Var, jt1 jt1Var2, int i8) {
                    jv0Var.getClass();
                    if ((i8 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    mh4<g2b> mh4Var10 = mh4Var9;
                    final int i9 = i5;
                    final String str4 = str3;
                    final long j10 = j9;
                    h65.b(1572864, 62, jt1Var2, mh4Var10, gr1.b(896985929, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                        public final void invoke(jt1 jt1Var3, int i10) {
                            if ((i10 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                            } else {
                                m65.b(is7.a(i9, jt1Var3, 0), str4, ir9.j(ox6.a.t, 24.0f), j10, jt1Var3, 392, 0);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                            invoke(jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), null, null, null, false);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv0 jv0Var, jt1 jt1Var2, Integer num) {
                    invoke(jv0Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i4 << 3) & 112) | 390);
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ju4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$3(ox6Var3, str, i, str2, z, z2, mh4Var, j, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CollapsedHeaderMenuItemRow_88mDfTA$lambda$3(ox6 ox6Var, String str, int i, String str2, boolean z, boolean z2, mh4 mh4Var, long j, int i2, int i3, jt1 jt1Var, int i4) {
        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var, str, i, str2, z, z2, mh4Var, j, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0164  */
    /* JADX WARN: Code duplicated, block: B:107:0x016b  */
    /* JADX WARN: Code duplicated, block: B:108:0x016f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0197  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0207  */
    /* JADX WARN: Code duplicated, block: B:126:0x023c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0246  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00df  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    private static final void ExpandedHeaderMenuItemRow(ox6 ox6Var, final String str, final int i, final String str2, final boolean z, final boolean z2, final mh4<g2b> mh4Var, final boolean z3, jt1 jt1Var, final int i2, final int i3) {
        ox6 ox6Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ox6.a aVar;
        int i12;
        boolean z4;
        Object objF;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        ox6 ox6Var3;
        long jA;
        long j;
        bj4 bj4Var;
        final ox6 ox6Var4;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(1007952458);
        int i13 = i3 & 1;
        if (i13 != 0) {
            i4 = i2 | 6;
            ox6Var2 = ox6Var;
        } else if ((i2 & 6) == 0) {
            ox6Var2 = ox6Var;
            i4 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i2;
        } else {
            ox6Var2 = ox6Var;
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            if ((i2 & 48) == 0) {
                i4 |= bj4VarO.J(str) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                if (bj4VarO.h(i)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i4 |= i5;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (bj4VarO.J(str2)) {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if (bj4VarO.c(z)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            if ((i3 & 32) != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if (bj4VarO.c(z2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            if ((i3 & 64) != 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
            if ((i3 & 128) != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (bj4VarO.c(z3)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i4;
            if ((i11 & 4793491) == 4793490 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i13 != 0) {
                    ox6Var2 = aVar;
                }
                ox6 ox6VarC2 = ir9.c(ox6Var2, 1.0f);
                bj4VarO.K(-1310319816);
                i12 = 1;
                if ((i11 & 3670016) == 1048576) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objF = bj4VarO.f();
                if (z4 || objF == jt1.a.a) {
                    objF = new qj2(mh4Var, i12);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6VarI = eo7.i(we1.c(ox6VarC2, z3, null, (mh4) objF, 14), 16.0f);
                ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                ox6Var3 = ox6Var2;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1463397389);
                if (z3) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                } else {
                    jA = uh1.d;
                }
                j = jA;
                bj4VarO.U(false);
                mia.b(str, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i11 >> 3) & 14, 0, 262138);
                bj4Var = bj4VarO;
                if (z2) {
                    bj4Var.K(-1879184113);
                    ConversationItemKt.UnreadIndicator(eo7.i(aVar, 4.0f), bj4Var, 6, 0);
                    bj4Var.U(false);
                } else if (str2 == null && z) {
                    bj4Var.K(-1878791622);
                    UnreadBadge(aVar, str2, bj4Var, ((i11 >> 6) & 112) | 6, 0);
                    bj4Var.U(false);
                } else {
                    bj4Var.K(-1879033081);
                    m65.b(is7.a(i, bj4Var, (i11 >> 6) & 14), str, ir9.j(aVar, 16.0f), j, bj4Var, 392 | (i11 & 112), 0);
                    bj4Var = bj4Var;
                    bj4Var.U(false);
                }
                bj4Var.U(true);
                ox6Var4 = ox6Var3;
            } else {
                bj4VarO.u();
                bj4Var = bj4VarO;
                ox6Var4 = ox6Var2;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lu4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$7(ox6Var4, str, i, str2, z, z2, mh4Var, z3, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 48;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (bj4VarO.h(i)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (bj4VarO.J(str2)) {
                i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (bj4VarO.c(z)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i4 |= i7;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if (bj4VarO.c(z2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i4 |= i8;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (bj4VarO.j(mh4Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i4 |= i9;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (bj4VarO.c(z3)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        i11 = i4;
        if ((i11 & 4793491) == 4793490) {
            aVar = ox6.a.t;
            if (i13 != 0) {
                ox6Var2 = aVar;
            }
            ox6 ox6VarC3 = ir9.c(ox6Var2, 1.0f);
            bj4VarO.K(-1310319816);
            i12 = 1;
            if ((i11 & 3670016) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            objF = bj4VarO.f();
            if (z4) {
                objF = new qj2(mh4Var, i12);
                bj4VarO.C(objF);
            } else {
                objF = new qj2(mh4Var, i12);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarI2 = eo7.i(we1.c(ox6VarC3, z3, null, (mh4) objF, 14), 16.0f);
            ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarI2);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            ox6Var3 = ox6Var2;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(1463397389);
            if (z3) {
                jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
            } else {
                jA = uh1.d;
            }
            j = jA;
            bj4VarO.U(false);
            mia.b(str, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i11 >> 3) & 14, 0, 262138);
            bj4Var = bj4VarO;
            if (z2) {
                bj4Var.K(-1879184113);
                ConversationItemKt.UnreadIndicator(eo7.i(aVar, 4.0f), bj4Var, 6, 0);
                bj4Var.U(false);
            } else if (str2 == null) {
                bj4Var.K(-1879033081);
                m65.b(is7.a(i, bj4Var, (i11 >> 6) & 14), str, ir9.j(aVar, 16.0f), j, bj4Var, 392 | (i11 & 112), 0);
                bj4Var = bj4Var;
                bj4Var.U(false);
            } else {
                bj4Var.K(-1879033081);
                m65.b(is7.a(i, bj4Var, (i11 >> 6) & 14), str, ir9.j(aVar, 16.0f), j, bj4Var, 392 | (i11 & 112), 0);
                bj4Var = bj4Var;
                bj4Var.U(false);
            }
            bj4Var.U(true);
            ox6Var4 = ox6Var3;
        } else {
            aVar = ox6.a.t;
            if (i13 != 0) {
                ox6Var2 = aVar;
            }
            ox6 ox6VarC4 = ir9.c(ox6Var2, 1.0f);
            bj4VarO.K(-1310319816);
            i12 = 1;
            if ((i11 & 3670016) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            objF = bj4VarO.f();
            if (z4) {
                objF = new qj2(mh4Var, i12);
                bj4VarO.C(objF);
            } else {
                objF = new qj2(mh4Var, i12);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarI3 = eo7.i(we1.c(ox6VarC4, z3, null, (mh4) objF, 14), 16.0f);
            ny8VarA = ly8.a(c30.f, di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarI3);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            ox6Var3 = ox6Var2;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(1463397389);
            if (z3) {
                jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
            } else {
                jA = uh1.d;
            }
            j = jA;
            bj4VarO.U(false);
            mia.b(str, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i11 >> 3) & 14, 0, 262138);
            bj4Var = bj4VarO;
            if (z2) {
                bj4Var.K(-1879184113);
                ConversationItemKt.UnreadIndicator(eo7.i(aVar, 4.0f), bj4Var, 6, 0);
                bj4Var.U(false);
            } else if (str2 == null) {
                bj4Var.K(-1879033081);
                m65.b(is7.a(i, bj4Var, (i11 >> 6) & 14), str, ir9.j(aVar, 16.0f), j, bj4Var, 392 | (i11 & 112), 0);
                bj4Var = bj4Var;
                bj4Var.U(false);
            } else {
                bj4Var.K(-1879033081);
                m65.b(is7.a(i, bj4Var, (i11 >> 6) & 14), str, ir9.j(aVar, 16.0f), j, bj4Var, 392 | (i11 & 112), 0);
                bj4Var = bj4Var;
                bj4Var.U(false);
            }
            bj4Var.U(true);
            ox6Var4 = ox6Var3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: lu4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$7(ox6Var4, str, i, str2, z, z2, mh4Var, z3, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedHeaderMenuItemRow$lambda$5$lambda$4(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedHeaderMenuItemRow$lambda$7(ox6 ox6Var, String str, int i, String str2, boolean z, boolean z2, mh4 mh4Var, boolean z3, int i2, int i3, jt1 jt1Var, int i4) {
        ExpandedHeaderMenuItemRow(ox6Var, str, i, str2, z, z2, mh4Var, z3, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:106:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0132  */
    /* JADX WARN: Code duplicated, block: B:112:0x0140  */
    /* JADX WARN: Code duplicated, block: B:116:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0183  */
    /* JADX WARN: Code duplicated, block: B:130:0x0188  */
    /* JADX WARN: Code duplicated, block: B:132:0x018c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0190  */
    /* JADX WARN: Code duplicated, block: B:136:0x0193  */
    /* JADX WARN: Code duplicated, block: B:137:0x0195  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:151:0x0220  */
    /* JADX WARN: Code duplicated, block: B:155:0x0272  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX INFO: renamed from: HeaderMenuItemRow-6RhP_wg, reason: not valid java name */
    public static final void m149HeaderMenuItemRow6RhP_wg(final String str, final boolean z, final int i, ox6 ox6Var, String str2, boolean z2, boolean z3, boolean z4, mh4<g2b> mh4Var, long j, jt1 jt1Var, final int i2, final int i3) {
        String str3;
        int i4;
        boolean z5;
        int i5;
        final ox6 ox6Var2;
        int i6;
        String str4;
        int i7;
        int i8;
        boolean z6;
        int i9;
        int i10;
        boolean z7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z8;
        mh4<g2b> mh4Var2;
        mh4<g2b> mh4Var3;
        boolean z9;
        Object objF;
        boolean z10;
        int i18;
        ox6 ox6Var3;
        String str5;
        ox6 ox6Var4;
        final boolean z11;
        final String str6;
        final boolean z12;
        final boolean z13;
        final mh4<g2b> mh4Var4;
        final long j2;
        xj8 xj8VarW;
        str.getClass();
        bj4 bj4VarO = jt1Var.o(-1015144426);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i2 & 6) == 0) {
                i4 = (bj4VarO.J(str3) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            z5 = z;
        } else {
            z5 = z;
            if ((i2 & 48) == 0) {
                i4 |= bj4VarO.c(z5) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            i5 = i;
        } else {
            i5 = i;
            if ((i2 & 384) == 0) {
                i4 |= bj4VarO.h(i5) ? 256 : 128;
            }
        }
        int i19 = i3 & 8;
        if (i19 == 0) {
            if ((i2 & 3072) == 0) {
                ox6Var2 = ox6Var;
                i4 |= bj4VarO.J(ox6Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    str4 = str2;
                    if (bj4VarO.J(str4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    if ((196608 & i2) == 0) {
                        z6 = z2;
                        if (bj4VarO.c(z6)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i2) == 0) {
                            z7 = z3;
                            if (bj4VarO.c(z7)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i4 |= i11;
                        }
                        i12 = i3 & 128;
                        if (i12 != 0) {
                            i14 = i4 | 12582912;
                        } else {
                            i13 = i4;
                            if ((i2 & 12582912) == 0) {
                                if (bj4VarO.c(z4)) {
                                    i15 = 8388608;
                                } else {
                                    i15 = 4194304;
                                }
                                i14 = i13 | i15;
                            } else {
                                i14 = i13;
                            }
                        }
                        i16 = i3 & 256;
                        if (i16 != 0) {
                            if ((i2 & 100663296) == 0) {
                                if (bj4VarO.j(mh4Var)) {
                                    i17 = 67108864;
                                } else {
                                    i17 = 33554432;
                                }
                                i14 |= i17;
                            }
                            if ((i2 & 805306368) != 0) {
                                i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                            }
                            if ((i14 & 306783379) == 306783378 || !bj4VarO.r()) {
                                bj4VarO.v0();
                                if ((i2 & 1) != 0 || bj4VarO.c0()) {
                                    if (i19 != 0) {
                                        ox6Var2 = ox6.a.t;
                                    }
                                    if (i6 != 0) {
                                        str4 = null;
                                    }
                                    if (i8 != 0) {
                                        z6 = true;
                                    }
                                    if (i10 != 0) {
                                        z7 = false;
                                    }
                                    if (i12 != 0) {
                                        z8 = false;
                                    } else {
                                        z8 = z4;
                                    }
                                    if (i16 != 0) {
                                        bj4VarO.K(1618517830);
                                        objF = bj4VarO.f();
                                        if (objF == jt1.a.a) {
                                            objF = new gu4();
                                            bj4VarO.C(objF);
                                        }
                                        mh4Var2 = (mh4) objF;
                                        bj4VarO.U(false);
                                    } else {
                                        mh4Var2 = mh4Var;
                                    }
                                    if ((i3 & 512) != 0) {
                                        i14 &= -1879048193;
                                        z9 = z6;
                                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                        mh4Var3 = mh4Var2;
                                    } else {
                                        mh4Var3 = mh4Var2;
                                    }
                                    z10 = z7;
                                    i18 = i14;
                                    ox6Var3 = ox6Var2;
                                    str5 = str4;
                                    bj4VarO.V();
                                    if (z8) {
                                        bj4VarO.K(-1365464858);
                                        int i20 = i18 >> 3;
                                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                        bj4VarO.U(false);
                                        ox6Var4 = ox6Var3;
                                    } else {
                                        bj4VarO.K(-1365149557);
                                        int i21 = i18 >> 3;
                                        int i22 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752);
                                        int i23 = i18 >> 6;
                                        ox6Var4 = ox6Var3;
                                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i22 | (i23 & 3670016) | (i23 & 29360128), 0);
                                        bj4VarO.U(false);
                                    }
                                    z11 = z8;
                                    str6 = str5;
                                    ox6Var2 = ox6Var4;
                                    z12 = z9;
                                    z13 = z10;
                                    mh4Var4 = mh4Var3;
                                    j2 = j;
                                } else {
                                    bj4VarO.u();
                                    if ((i3 & 512) != 0) {
                                        i14 &= -1879048193;
                                    }
                                    z8 = z4;
                                    mh4Var3 = mh4Var;
                                }
                                z9 = z6;
                                z10 = z7;
                                i18 = i14;
                                ox6Var3 = ox6Var2;
                                str5 = str4;
                                bj4VarO.V();
                                if (z8) {
                                    bj4VarO.K(-1365464858);
                                    int i24 = i18 >> 3;
                                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                    bj4VarO.U(false);
                                    ox6Var4 = ox6Var3;
                                } else {
                                    bj4VarO.K(-1365149557);
                                    int i25 = i18 >> 3;
                                    int i26 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i25 & 7168) | (i25 & 57344) | (i25 & 458752);
                                    int i27 = i18 >> 6;
                                    ox6Var4 = ox6Var3;
                                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i26 | (i27 & 3670016) | (i27 & 29360128), 0);
                                    bj4VarO.U(false);
                                }
                                z11 = z8;
                                str6 = str5;
                                ox6Var2 = ox6Var4;
                                z12 = z9;
                                z13 = z10;
                                mh4Var4 = mh4Var3;
                                j2 = j;
                            } else {
                                bj4VarO.u();
                                z11 = z4;
                                str6 = str4;
                                z12 = z6;
                                z13 = z7;
                                mh4Var4 = mh4Var;
                                j2 = j;
                            }
                            xj8VarW = bj4VarO.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new ci4() { // from class: hu4
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i14 |= 100663296;
                        if ((i2 & 805306368) != 0) {
                            i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                        }
                        if ((i14 & 306783379) == 306783378) {
                            bj4VarO.v0();
                            if ((i2 & 1) != 0) {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            } else {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            }
                            z10 = z7;
                            i18 = i14;
                            ox6Var3 = ox6Var2;
                            str5 = str4;
                            bj4VarO.V();
                            if (z8) {
                                bj4VarO.K(-1365464858);
                                int i28 = i18 >> 3;
                                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i28 & 7168) | (i28 & 57344) | (i28 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                bj4VarO.U(false);
                                ox6Var4 = ox6Var3;
                            } else {
                                bj4VarO.K(-1365149557);
                                int i29 = i18 >> 3;
                                int i210 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i29 & 7168) | (i29 & 57344) | (i29 & 458752);
                                int i211 = i18 >> 6;
                                ox6Var4 = ox6Var3;
                                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i210 | (i211 & 3670016) | (i211 & 29360128), 0);
                                bj4VarO.U(false);
                            }
                            z11 = z8;
                            str6 = str5;
                            ox6Var2 = ox6Var4;
                            z12 = z9;
                            z13 = z10;
                            mh4Var4 = mh4Var3;
                            j2 = j;
                        } else {
                            bj4VarO.v0();
                            if ((i2 & 1) != 0) {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            } else {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            }
                            z10 = z7;
                            i18 = i14;
                            ox6Var3 = ox6Var2;
                            str5 = str4;
                            bj4VarO.V();
                            if (z8) {
                                bj4VarO.K(-1365464858);
                                int i212 = i18 >> 3;
                                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i212 & 7168) | (i212 & 57344) | (i212 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                bj4VarO.U(false);
                                ox6Var4 = ox6Var3;
                            } else {
                                bj4VarO.K(-1365149557);
                                int i213 = i18 >> 3;
                                int i214 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i213 & 7168) | (i213 & 57344) | (i213 & 458752);
                                int i215 = i18 >> 6;
                                ox6Var4 = ox6Var3;
                                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i214 | (i215 & 3670016) | (i215 & 29360128), 0);
                                bj4VarO.U(false);
                            }
                            z11 = z8;
                            str6 = str5;
                            ox6Var2 = ox6Var4;
                            z12 = z9;
                            z13 = z10;
                            mh4Var4 = mh4Var3;
                            j2 = j;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: hu4
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i4 |= 1572864;
                    z7 = z3;
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i14 = i4 | 12582912;
                    } else {
                        i13 = i4;
                        if ((i2 & 12582912) == 0) {
                            if (bj4VarO.c(z4)) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i14 = i13 | i15;
                        } else {
                            i14 = i13;
                        }
                    }
                    i16 = i3 & 256;
                    if (i16 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (bj4VarO.j(mh4Var)) {
                                i17 = 67108864;
                            } else {
                                i17 = 33554432;
                            }
                            i14 |= i17;
                        }
                        if ((i2 & 805306368) != 0) {
                            i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                        }
                        if ((i14 & 306783379) == 306783378) {
                            bj4VarO.v0();
                            if ((i2 & 1) != 0) {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            } else {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            }
                            z10 = z7;
                            i18 = i14;
                            ox6Var3 = ox6Var2;
                            str5 = str4;
                            bj4VarO.V();
                            if (z8) {
                                bj4VarO.K(-1365464858);
                                int i216 = i18 >> 3;
                                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i216 & 7168) | (i216 & 57344) | (i216 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                bj4VarO.U(false);
                                ox6Var4 = ox6Var3;
                            } else {
                                bj4VarO.K(-1365149557);
                                int i217 = i18 >> 3;
                                int i218 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i217 & 7168) | (i217 & 57344) | (i217 & 458752);
                                int i219 = i18 >> 6;
                                ox6Var4 = ox6Var3;
                                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i218 | (i219 & 3670016) | (i219 & 29360128), 0);
                                bj4VarO.U(false);
                            }
                            z11 = z8;
                            str6 = str5;
                            ox6Var2 = ox6Var4;
                            z12 = z9;
                            z13 = z10;
                            mh4Var4 = mh4Var3;
                            j2 = j;
                        } else {
                            bj4VarO.v0();
                            if ((i2 & 1) != 0) {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            } else {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            }
                            z10 = z7;
                            i18 = i14;
                            ox6Var3 = ox6Var2;
                            str5 = str4;
                            bj4VarO.V();
                            if (z8) {
                                bj4VarO.K(-1365464858);
                                int i2110 = i18 >> 3;
                                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2110 & 7168) | (i2110 & 57344) | (i2110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                bj4VarO.U(false);
                                ox6Var4 = ox6Var3;
                            } else {
                                bj4VarO.K(-1365149557);
                                int i2111 = i18 >> 3;
                                int i2112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111 & 7168) | (i2111 & 57344) | (i2111 & 458752);
                                int i2113 = i18 >> 6;
                                ox6Var4 = ox6Var3;
                                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2112 | (i2113 & 3670016) | (i2113 & 29360128), 0);
                                bj4VarO.U(false);
                            }
                            z11 = z8;
                            str6 = str5;
                            ox6Var2 = ox6Var4;
                            z12 = z9;
                            z13 = z10;
                            mh4Var4 = mh4Var3;
                            j2 = j;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: hu4
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i14 |= 100663296;
                    if ((i2 & 805306368) != 0) {
                        i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i2114 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2114 & 7168) | (i2114 & 57344) | (i2114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i2115 = i18 >> 3;
                            int i2116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2115 & 7168) | (i2115 & 57344) | (i2115 & 458752);
                            int i2117 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2116 | (i2117 & 3670016) | (i2117 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    } else {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i2118 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2118 & 7168) | (i2118 & 57344) | (i2118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i2119 = i18 >> 3;
                            int i21110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2119 & 7168) | (i2119 & 57344) | (i2119 & 458752);
                            int i21111 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21110 | (i21111 & 3670016) | (i21111 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hu4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i4 |= 196608;
                z6 = z2;
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((1572864 & i2) == 0) {
                        z7 = z3;
                        if (bj4VarO.c(z7)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i14 = i4 | 12582912;
                    } else {
                        i13 = i4;
                        if ((i2 & 12582912) == 0) {
                            if (bj4VarO.c(z4)) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i14 = i13 | i15;
                        } else {
                            i14 = i13;
                        }
                    }
                    i16 = i3 & 256;
                    if (i16 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (bj4VarO.j(mh4Var)) {
                                i17 = 67108864;
                            } else {
                                i17 = 33554432;
                            }
                            i14 |= i17;
                        }
                        if ((i2 & 805306368) != 0) {
                            i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                        }
                        if ((i14 & 306783379) == 306783378) {
                            bj4VarO.v0();
                            if ((i2 & 1) != 0) {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            } else {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            }
                            z10 = z7;
                            i18 = i14;
                            ox6Var3 = ox6Var2;
                            str5 = str4;
                            bj4VarO.V();
                            if (z8) {
                                bj4VarO.K(-1365464858);
                                int i21112 = i18 >> 3;
                                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21112 & 7168) | (i21112 & 57344) | (i21112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                bj4VarO.U(false);
                                ox6Var4 = ox6Var3;
                            } else {
                                bj4VarO.K(-1365149557);
                                int i21113 = i18 >> 3;
                                int i21114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21113 & 7168) | (i21113 & 57344) | (i21113 & 458752);
                                int i21115 = i18 >> 6;
                                ox6Var4 = ox6Var3;
                                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21114 | (i21115 & 3670016) | (i21115 & 29360128), 0);
                                bj4VarO.U(false);
                            }
                            z11 = z8;
                            str6 = str5;
                            ox6Var2 = ox6Var4;
                            z12 = z9;
                            z13 = z10;
                            mh4Var4 = mh4Var3;
                            j2 = j;
                        } else {
                            bj4VarO.v0();
                            if ((i2 & 1) != 0) {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            } else {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            }
                            z10 = z7;
                            i18 = i14;
                            ox6Var3 = ox6Var2;
                            str5 = str4;
                            bj4VarO.V();
                            if (z8) {
                                bj4VarO.K(-1365464858);
                                int i21116 = i18 >> 3;
                                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21116 & 7168) | (i21116 & 57344) | (i21116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                bj4VarO.U(false);
                                ox6Var4 = ox6Var3;
                            } else {
                                bj4VarO.K(-1365149557);
                                int i21117 = i18 >> 3;
                                int i21118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21117 & 7168) | (i21117 & 57344) | (i21117 & 458752);
                                int i21119 = i18 >> 6;
                                ox6Var4 = ox6Var3;
                                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21118 | (i21119 & 3670016) | (i21119 & 29360128), 0);
                                bj4VarO.U(false);
                            }
                            z11 = z8;
                            str6 = str5;
                            ox6Var2 = ox6Var4;
                            z12 = z9;
                            z13 = z10;
                            mh4Var4 = mh4Var3;
                            j2 = j;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: hu4
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i14 |= 100663296;
                    if ((i2 & 805306368) != 0) {
                        i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211110 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211110 & 7168) | (i211110 & 57344) | (i211110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211111 = i18 >> 3;
                            int i211112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111 & 7168) | (i211111 & 57344) | (i211111 & 458752);
                            int i211113 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211112 | (i211113 & 3670016) | (i211113 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    } else {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211114 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211114 & 7168) | (i211114 & 57344) | (i211114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211115 = i18 >> 3;
                            int i211116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211115 & 7168) | (i211115 & 57344) | (i211115 & 458752);
                            int i211117 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211116 | (i211117 & 3670016) | (i211117 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hu4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i4 |= 1572864;
                z7 = z3;
                i12 = i3 & 128;
                if (i12 != 0) {
                    i14 = i4 | 12582912;
                } else {
                    i13 = i4;
                    if ((i2 & 12582912) == 0) {
                        if (bj4VarO.c(z4)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i14 = i13 | i15;
                    } else {
                        i14 = i13;
                    }
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i14 |= i17;
                    }
                    if ((i2 & 805306368) != 0) {
                        i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211118 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211118 & 7168) | (i211118 & 57344) | (i211118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211119 = i18 >> 3;
                            int i2111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211119 & 7168) | (i211119 & 57344) | (i211119 & 458752);
                            int i2111111 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111110 | (i2111111 & 3670016) | (i2111111 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    } else {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i2111112 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111112 & 7168) | (i2111112 & 57344) | (i2111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i2111113 = i18 >> 3;
                            int i2111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111113 & 7168) | (i2111113 & 57344) | (i2111113 & 458752);
                            int i2111115 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111114 | (i2111115 & 3670016) | (i2111115 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hu4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i2 & 805306368) != 0) {
                    i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                }
                if ((i14 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i2111116 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111116 & 7168) | (i2111116 & 57344) | (i2111116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i2111117 = i18 >> 3;
                        int i2111118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111117 & 7168) | (i2111117 & 57344) | (i2111117 & 458752);
                        int i2111119 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111118 | (i2111119 & 3670016) | (i2111119 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                } else {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i21111110 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111110 & 7168) | (i21111110 & 57344) | (i21111110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i21111111 = i18 >> 3;
                        int i21111112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111 & 7168) | (i21111111 & 57344) | (i21111111 & 458752);
                        int i21111113 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111112 | (i21111113 & 3670016) | (i21111113 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hu4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i4 |= 24576;
            str4 = str2;
            i8 = i3 & 32;
            if (i8 != 0) {
                if ((196608 & i2) == 0) {
                    z6 = z2;
                    if (bj4VarO.c(z6)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((1572864 & i2) == 0) {
                        z7 = z3;
                        if (bj4VarO.c(z7)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i14 = i4 | 12582912;
                    } else {
                        i13 = i4;
                        if ((i2 & 12582912) == 0) {
                            if (bj4VarO.c(z4)) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i14 = i13 | i15;
                        } else {
                            i14 = i13;
                        }
                    }
                    i16 = i3 & 256;
                    if (i16 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (bj4VarO.j(mh4Var)) {
                                i17 = 67108864;
                            } else {
                                i17 = 33554432;
                            }
                            i14 |= i17;
                        }
                        if ((i2 & 805306368) != 0) {
                            i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                        }
                        if ((i14 & 306783379) == 306783378) {
                            bj4VarO.v0();
                            if ((i2 & 1) != 0) {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            } else {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            }
                            z10 = z7;
                            i18 = i14;
                            ox6Var3 = ox6Var2;
                            str5 = str4;
                            bj4VarO.V();
                            if (z8) {
                                bj4VarO.K(-1365464858);
                                int i21111114 = i18 >> 3;
                                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111114 & 7168) | (i21111114 & 57344) | (i21111114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                bj4VarO.U(false);
                                ox6Var4 = ox6Var3;
                            } else {
                                bj4VarO.K(-1365149557);
                                int i21111115 = i18 >> 3;
                                int i21111116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111115 & 7168) | (i21111115 & 57344) | (i21111115 & 458752);
                                int i21111117 = i18 >> 6;
                                ox6Var4 = ox6Var3;
                                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111116 | (i21111117 & 3670016) | (i21111117 & 29360128), 0);
                                bj4VarO.U(false);
                            }
                            z11 = z8;
                            str6 = str5;
                            ox6Var2 = ox6Var4;
                            z12 = z9;
                            z13 = z10;
                            mh4Var4 = mh4Var3;
                            j2 = j;
                        } else {
                            bj4VarO.v0();
                            if ((i2 & 1) != 0) {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            } else {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            }
                            z10 = z7;
                            i18 = i14;
                            ox6Var3 = ox6Var2;
                            str5 = str4;
                            bj4VarO.V();
                            if (z8) {
                                bj4VarO.K(-1365464858);
                                int i21111118 = i18 >> 3;
                                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111118 & 7168) | (i21111118 & 57344) | (i21111118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                bj4VarO.U(false);
                                ox6Var4 = ox6Var3;
                            } else {
                                bj4VarO.K(-1365149557);
                                int i21111119 = i18 >> 3;
                                int i211111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111119 & 7168) | (i21111119 & 57344) | (i21111119 & 458752);
                                int i211111111 = i18 >> 6;
                                ox6Var4 = ox6Var3;
                                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111110 | (i211111111 & 3670016) | (i211111111 & 29360128), 0);
                                bj4VarO.U(false);
                            }
                            z11 = z8;
                            str6 = str5;
                            ox6Var2 = ox6Var4;
                            z12 = z9;
                            z13 = z10;
                            mh4Var4 = mh4Var3;
                            j2 = j;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: hu4
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i14 |= 100663296;
                    if ((i2 & 805306368) != 0) {
                        i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211111112 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111112 & 7168) | (i211111112 & 57344) | (i211111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211111113 = i18 >> 3;
                            int i211111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111113 & 7168) | (i211111113 & 57344) | (i211111113 & 458752);
                            int i211111115 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111114 | (i211111115 & 3670016) | (i211111115 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    } else {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211111116 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111116 & 7168) | (i211111116 & 57344) | (i211111116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211111117 = i18 >> 3;
                            int i211111118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111117 & 7168) | (i211111117 & 57344) | (i211111117 & 458752);
                            int i211111119 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111118 | (i211111119 & 3670016) | (i211111119 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hu4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i4 |= 1572864;
                z7 = z3;
                i12 = i3 & 128;
                if (i12 != 0) {
                    i14 = i4 | 12582912;
                } else {
                    i13 = i4;
                    if ((i2 & 12582912) == 0) {
                        if (bj4VarO.c(z4)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i14 = i13 | i15;
                    } else {
                        i14 = i13;
                    }
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i14 |= i17;
                    }
                    if ((i2 & 805306368) != 0) {
                        i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i2111111110 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111110 & 7168) | (i2111111110 & 57344) | (i2111111110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i2111111111 = i18 >> 3;
                            int i2111111112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111 & 7168) | (i2111111111 & 57344) | (i2111111111 & 458752);
                            int i2111111113 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111112 | (i2111111113 & 3670016) | (i2111111113 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    } else {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i2111111114 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111114 & 7168) | (i2111111114 & 57344) | (i2111111114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i2111111115 = i18 >> 3;
                            int i2111111116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111115 & 7168) | (i2111111115 & 57344) | (i2111111115 & 458752);
                            int i2111111117 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111116 | (i2111111117 & 3670016) | (i2111111117 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hu4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i2 & 805306368) != 0) {
                    i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                }
                if ((i14 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i2111111118 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111118 & 7168) | (i2111111118 & 57344) | (i2111111118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i2111111119 = i18 >> 3;
                        int i21111111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111119 & 7168) | (i2111111119 & 57344) | (i2111111119 & 458752);
                        int i21111111111 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111110 | (i21111111111 & 3670016) | (i21111111111 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                } else {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i21111111112 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111112 & 7168) | (i21111111112 & 57344) | (i21111111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i21111111113 = i18 >> 3;
                        int i21111111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111113 & 7168) | (i21111111113 & 57344) | (i21111111113 & 458752);
                        int i21111111115 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111114 | (i21111111115 & 3670016) | (i21111111115 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hu4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i4 |= 196608;
            z6 = z2;
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((1572864 & i2) == 0) {
                    z7 = z3;
                    if (bj4VarO.c(z7)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i14 = i4 | 12582912;
                } else {
                    i13 = i4;
                    if ((i2 & 12582912) == 0) {
                        if (bj4VarO.c(z4)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i14 = i13 | i15;
                    } else {
                        i14 = i13;
                    }
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i14 |= i17;
                    }
                    if ((i2 & 805306368) != 0) {
                        i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i21111111116 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111116 & 7168) | (i21111111116 & 57344) | (i21111111116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i21111111117 = i18 >> 3;
                            int i21111111118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111117 & 7168) | (i21111111117 & 57344) | (i21111111117 & 458752);
                            int i21111111119 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111118 | (i21111111119 & 3670016) | (i21111111119 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    } else {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211111111110 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111110 & 7168) | (i211111111110 & 57344) | (i211111111110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211111111111 = i18 >> 3;
                            int i211111111112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111 & 7168) | (i211111111111 & 57344) | (i211111111111 & 458752);
                            int i211111111113 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111112 | (i211111111113 & 3670016) | (i211111111113 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hu4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i2 & 805306368) != 0) {
                    i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                }
                if ((i14 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i211111111114 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111114 & 7168) | (i211111111114 & 57344) | (i211111111114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i211111111115 = i18 >> 3;
                        int i211111111116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111115 & 7168) | (i211111111115 & 57344) | (i211111111115 & 458752);
                        int i211111111117 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111116 | (i211111111117 & 3670016) | (i211111111117 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                } else {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i211111111118 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111118 & 7168) | (i211111111118 & 57344) | (i211111111118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i211111111119 = i18 >> 3;
                        int i2111111111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111119 & 7168) | (i211111111119 & 57344) | (i211111111119 & 458752);
                        int i2111111111111 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111110 | (i2111111111111 & 3670016) | (i2111111111111 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hu4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i4 |= 1572864;
            z7 = z3;
            i12 = i3 & 128;
            if (i12 != 0) {
                i14 = i4 | 12582912;
            } else {
                i13 = i4;
                if ((i2 & 12582912) == 0) {
                    if (bj4VarO.c(z4)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i14 = i13 | i15;
                } else {
                    i14 = i13;
                }
            }
            i16 = i3 & 256;
            if (i16 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i14 |= i17;
                }
                if ((i2 & 805306368) != 0) {
                    i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                }
                if ((i14 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i2111111111112 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111112 & 7168) | (i2111111111112 & 57344) | (i2111111111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i2111111111113 = i18 >> 3;
                        int i2111111111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111113 & 7168) | (i2111111111113 & 57344) | (i2111111111113 & 458752);
                        int i2111111111115 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111114 | (i2111111111115 & 3670016) | (i2111111111115 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                } else {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i2111111111116 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111116 & 7168) | (i2111111111116 & 57344) | (i2111111111116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i2111111111117 = i18 >> 3;
                        int i2111111111118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111117 & 7168) | (i2111111111117 & 57344) | (i2111111111117 & 458752);
                        int i2111111111119 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111118 | (i2111111111119 & 3670016) | (i2111111111119 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hu4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i14 |= 100663296;
            if ((i2 & 805306368) != 0) {
                i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
            }
            if ((i14 & 306783379) == 306783378) {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                } else {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                }
                z10 = z7;
                i18 = i14;
                ox6Var3 = ox6Var2;
                str5 = str4;
                bj4VarO.V();
                if (z8) {
                    bj4VarO.K(-1365464858);
                    int i21111111111110 = i18 >> 3;
                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111110 & 7168) | (i21111111111110 & 57344) | (i21111111111110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                    bj4VarO.U(false);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.K(-1365149557);
                    int i21111111111111 = i18 >> 3;
                    int i21111111111112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111 & 7168) | (i21111111111111 & 57344) | (i21111111111111 & 458752);
                    int i21111111111113 = i18 >> 6;
                    ox6Var4 = ox6Var3;
                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111112 | (i21111111111113 & 3670016) | (i21111111111113 & 29360128), 0);
                    bj4VarO.U(false);
                }
                z11 = z8;
                str6 = str5;
                ox6Var2 = ox6Var4;
                z12 = z9;
                z13 = z10;
                mh4Var4 = mh4Var3;
                j2 = j;
            } else {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                } else {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                }
                z10 = z7;
                i18 = i14;
                ox6Var3 = ox6Var2;
                str5 = str4;
                bj4VarO.V();
                if (z8) {
                    bj4VarO.K(-1365464858);
                    int i21111111111114 = i18 >> 3;
                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111114 & 7168) | (i21111111111114 & 57344) | (i21111111111114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                    bj4VarO.U(false);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.K(-1365149557);
                    int i21111111111115 = i18 >> 3;
                    int i21111111111116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111115 & 7168) | (i21111111111115 & 57344) | (i21111111111115 & 458752);
                    int i21111111111117 = i18 >> 6;
                    ox6Var4 = ox6Var3;
                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111116 | (i21111111111117 & 3670016) | (i21111111111117 & 29360128), 0);
                    bj4VarO.U(false);
                }
                z11 = z8;
                str6 = str5;
                ox6Var2 = ox6Var4;
                z12 = z9;
                z13 = z10;
                mh4Var4 = mh4Var3;
                j2 = j;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hu4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 3072;
        ox6Var2 = ox6Var;
        i6 = i3 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                str4 = str2;
                if (bj4VarO.J(str4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            i8 = i3 & 32;
            if (i8 != 0) {
                if ((196608 & i2) == 0) {
                    z6 = z2;
                    if (bj4VarO.c(z6)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    if ((1572864 & i2) == 0) {
                        z7 = z3;
                        if (bj4VarO.c(z7)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i14 = i4 | 12582912;
                    } else {
                        i13 = i4;
                        if ((i2 & 12582912) == 0) {
                            if (bj4VarO.c(z4)) {
                                i15 = 8388608;
                            } else {
                                i15 = 4194304;
                            }
                            i14 = i13 | i15;
                        } else {
                            i14 = i13;
                        }
                    }
                    i16 = i3 & 256;
                    if (i16 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (bj4VarO.j(mh4Var)) {
                                i17 = 67108864;
                            } else {
                                i17 = 33554432;
                            }
                            i14 |= i17;
                        }
                        if ((i2 & 805306368) != 0) {
                            i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                        }
                        if ((i14 & 306783379) == 306783378) {
                            bj4VarO.v0();
                            if ((i2 & 1) != 0) {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            } else {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            }
                            z10 = z7;
                            i18 = i14;
                            ox6Var3 = ox6Var2;
                            str5 = str4;
                            bj4VarO.V();
                            if (z8) {
                                bj4VarO.K(-1365464858);
                                int i21111111111118 = i18 >> 3;
                                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111118 & 7168) | (i21111111111118 & 57344) | (i21111111111118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                bj4VarO.U(false);
                                ox6Var4 = ox6Var3;
                            } else {
                                bj4VarO.K(-1365149557);
                                int i21111111111119 = i18 >> 3;
                                int i211111111111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111119 & 7168) | (i21111111111119 & 57344) | (i21111111111119 & 458752);
                                int i211111111111111 = i18 >> 6;
                                ox6Var4 = ox6Var3;
                                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111110 | (i211111111111111 & 3670016) | (i211111111111111 & 29360128), 0);
                                bj4VarO.U(false);
                            }
                            z11 = z8;
                            str6 = str5;
                            ox6Var2 = ox6Var4;
                            z12 = z9;
                            z13 = z10;
                            mh4Var4 = mh4Var3;
                            j2 = j;
                        } else {
                            bj4VarO.v0();
                            if ((i2 & 1) != 0) {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            } else {
                                if (i19 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                if (i6 != 0) {
                                    str4 = null;
                                }
                                if (i8 != 0) {
                                    z6 = true;
                                }
                                if (i10 != 0) {
                                    z7 = false;
                                }
                                if (i12 != 0) {
                                    z8 = false;
                                } else {
                                    z8 = z4;
                                }
                                if (i16 != 0) {
                                    bj4VarO.K(1618517830);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new gu4();
                                        bj4VarO.C(objF);
                                    }
                                    mh4Var2 = (mh4) objF;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var2 = mh4Var;
                                }
                                if ((i3 & 512) != 0) {
                                    i14 &= -1879048193;
                                    z9 = z6;
                                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                    mh4Var3 = mh4Var2;
                                } else {
                                    mh4Var3 = mh4Var2;
                                    z9 = z6;
                                }
                            }
                            z10 = z7;
                            i18 = i14;
                            ox6Var3 = ox6Var2;
                            str5 = str4;
                            bj4VarO.V();
                            if (z8) {
                                bj4VarO.K(-1365464858);
                                int i211111111111112 = i18 >> 3;
                                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111112 & 7168) | (i211111111111112 & 57344) | (i211111111111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                                bj4VarO.U(false);
                                ox6Var4 = ox6Var3;
                            } else {
                                bj4VarO.K(-1365149557);
                                int i211111111111113 = i18 >> 3;
                                int i211111111111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111113 & 7168) | (i211111111111113 & 57344) | (i211111111111113 & 458752);
                                int i211111111111115 = i18 >> 6;
                                ox6Var4 = ox6Var3;
                                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111114 | (i211111111111115 & 3670016) | (i211111111111115 & 29360128), 0);
                                bj4VarO.U(false);
                            }
                            z11 = z8;
                            str6 = str5;
                            ox6Var2 = ox6Var4;
                            z12 = z9;
                            z13 = z10;
                            mh4Var4 = mh4Var3;
                            j2 = j;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: hu4
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i14 |= 100663296;
                    if ((i2 & 805306368) != 0) {
                        i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211111111111116 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111116 & 7168) | (i211111111111116 & 57344) | (i211111111111116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211111111111117 = i18 >> 3;
                            int i211111111111118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111117 & 7168) | (i211111111111117 & 57344) | (i211111111111117 & 458752);
                            int i211111111111119 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111118 | (i211111111111119 & 3670016) | (i211111111111119 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    } else {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i2111111111111110 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111111110 & 7168) | (i2111111111111110 & 57344) | (i2111111111111110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i2111111111111111 = i18 >> 3;
                            int i2111111111111112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111111111 & 7168) | (i2111111111111111 & 57344) | (i2111111111111111 & 458752);
                            int i2111111111111113 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111111112 | (i2111111111111113 & 3670016) | (i2111111111111113 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hu4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i4 |= 1572864;
                z7 = z3;
                i12 = i3 & 128;
                if (i12 != 0) {
                    i14 = i4 | 12582912;
                } else {
                    i13 = i4;
                    if ((i2 & 12582912) == 0) {
                        if (bj4VarO.c(z4)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i14 = i13 | i15;
                    } else {
                        i14 = i13;
                    }
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i14 |= i17;
                    }
                    if ((i2 & 805306368) != 0) {
                        i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i2111111111111114 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111111114 & 7168) | (i2111111111111114 & 57344) | (i2111111111111114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i2111111111111115 = i18 >> 3;
                            int i2111111111111116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111111115 & 7168) | (i2111111111111115 & 57344) | (i2111111111111115 & 458752);
                            int i2111111111111117 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111111116 | (i2111111111111117 & 3670016) | (i2111111111111117 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    } else {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i2111111111111118 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111111118 & 7168) | (i2111111111111118 & 57344) | (i2111111111111118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i2111111111111119 = i18 >> 3;
                            int i21111111111111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111111119 & 7168) | (i2111111111111119 & 57344) | (i2111111111111119 & 458752);
                            int i21111111111111111 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111111110 | (i21111111111111111 & 3670016) | (i21111111111111111 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hu4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i2 & 805306368) != 0) {
                    i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                }
                if ((i14 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i21111111111111112 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111111112 & 7168) | (i21111111111111112 & 57344) | (i21111111111111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i21111111111111113 = i18 >> 3;
                        int i21111111111111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111113 & 7168) | (i21111111111111113 & 57344) | (i21111111111111113 & 458752);
                        int i21111111111111115 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111111114 | (i21111111111111115 & 3670016) | (i21111111111111115 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                } else {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i21111111111111116 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111111116 & 7168) | (i21111111111111116 & 57344) | (i21111111111111116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i21111111111111117 = i18 >> 3;
                        int i21111111111111118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111117 & 7168) | (i21111111111111117 & 57344) | (i21111111111111117 & 458752);
                        int i21111111111111119 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111111118 | (i21111111111111119 & 3670016) | (i21111111111111119 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hu4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i4 |= 196608;
            z6 = z2;
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((1572864 & i2) == 0) {
                    z7 = z3;
                    if (bj4VarO.c(z7)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i14 = i4 | 12582912;
                } else {
                    i13 = i4;
                    if ((i2 & 12582912) == 0) {
                        if (bj4VarO.c(z4)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i14 = i13 | i15;
                    } else {
                        i14 = i13;
                    }
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i14 |= i17;
                    }
                    if ((i2 & 805306368) != 0) {
                        i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211111111111111110 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111111110 & 7168) | (i211111111111111110 & 57344) | (i211111111111111110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211111111111111111 = i18 >> 3;
                            int i211111111111111112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111111111 & 7168) | (i211111111111111111 & 57344) | (i211111111111111111 & 458752);
                            int i211111111111111113 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111111112 | (i211111111111111113 & 3670016) | (i211111111111111113 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    } else {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211111111111111114 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111111114 & 7168) | (i211111111111111114 & 57344) | (i211111111111111114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211111111111111115 = i18 >> 3;
                            int i211111111111111116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111111115 & 7168) | (i211111111111111115 & 57344) | (i211111111111111115 & 458752);
                            int i211111111111111117 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111111116 | (i211111111111111117 & 3670016) | (i211111111111111117 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hu4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i2 & 805306368) != 0) {
                    i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                }
                if ((i14 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i211111111111111118 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111111118 & 7168) | (i211111111111111118 & 57344) | (i211111111111111118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i211111111111111119 = i18 >> 3;
                        int i2111111111111111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111111119 & 7168) | (i211111111111111119 & 57344) | (i211111111111111119 & 458752);
                        int i2111111111111111111 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111111111110 | (i2111111111111111111 & 3670016) | (i2111111111111111111 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                } else {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i2111111111111111112 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111111111112 & 7168) | (i2111111111111111112 & 57344) | (i2111111111111111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i2111111111111111113 = i18 >> 3;
                        int i2111111111111111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111111111113 & 7168) | (i2111111111111111113 & 57344) | (i2111111111111111113 & 458752);
                        int i2111111111111111115 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111111111114 | (i2111111111111111115 & 3670016) | (i2111111111111111115 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hu4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i4 |= 1572864;
            z7 = z3;
            i12 = i3 & 128;
            if (i12 != 0) {
                i14 = i4 | 12582912;
            } else {
                i13 = i4;
                if ((i2 & 12582912) == 0) {
                    if (bj4VarO.c(z4)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i14 = i13 | i15;
                } else {
                    i14 = i13;
                }
            }
            i16 = i3 & 256;
            if (i16 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i14 |= i17;
                }
                if ((i2 & 805306368) != 0) {
                    i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                }
                if ((i14 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i2111111111111111116 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111111111116 & 7168) | (i2111111111111111116 & 57344) | (i2111111111111111116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i2111111111111111117 = i18 >> 3;
                        int i2111111111111111118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111111111117 & 7168) | (i2111111111111111117 & 57344) | (i2111111111111111117 & 458752);
                        int i2111111111111111119 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111111111118 | (i2111111111111111119 & 3670016) | (i2111111111111111119 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                } else {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i21111111111111111110 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111111111110 & 7168) | (i21111111111111111110 & 57344) | (i21111111111111111110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i21111111111111111111 = i18 >> 3;
                        int i21111111111111111112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111111111 & 7168) | (i21111111111111111111 & 57344) | (i21111111111111111111 & 458752);
                        int i21111111111111111113 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111111111112 | (i21111111111111111113 & 3670016) | (i21111111111111111113 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hu4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i14 |= 100663296;
            if ((i2 & 805306368) != 0) {
                i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
            }
            if ((i14 & 306783379) == 306783378) {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                } else {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                }
                z10 = z7;
                i18 = i14;
                ox6Var3 = ox6Var2;
                str5 = str4;
                bj4VarO.V();
                if (z8) {
                    bj4VarO.K(-1365464858);
                    int i21111111111111111114 = i18 >> 3;
                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111111111114 & 7168) | (i21111111111111111114 & 57344) | (i21111111111111111114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                    bj4VarO.U(false);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.K(-1365149557);
                    int i21111111111111111115 = i18 >> 3;
                    int i21111111111111111116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111111115 & 7168) | (i21111111111111111115 & 57344) | (i21111111111111111115 & 458752);
                    int i21111111111111111117 = i18 >> 6;
                    ox6Var4 = ox6Var3;
                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111111111116 | (i21111111111111111117 & 3670016) | (i21111111111111111117 & 29360128), 0);
                    bj4VarO.U(false);
                }
                z11 = z8;
                str6 = str5;
                ox6Var2 = ox6Var4;
                z12 = z9;
                z13 = z10;
                mh4Var4 = mh4Var3;
                j2 = j;
            } else {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                } else {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                }
                z10 = z7;
                i18 = i14;
                ox6Var3 = ox6Var2;
                str5 = str4;
                bj4VarO.V();
                if (z8) {
                    bj4VarO.K(-1365464858);
                    int i21111111111111111118 = i18 >> 3;
                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111111111118 & 7168) | (i21111111111111111118 & 57344) | (i21111111111111111118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                    bj4VarO.U(false);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.K(-1365149557);
                    int i21111111111111111119 = i18 >> 3;
                    int i211111111111111111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111111119 & 7168) | (i21111111111111111119 & 57344) | (i21111111111111111119 & 458752);
                    int i211111111111111111111 = i18 >> 6;
                    ox6Var4 = ox6Var3;
                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111111111110 | (i211111111111111111111 & 3670016) | (i211111111111111111111 & 29360128), 0);
                    bj4VarO.U(false);
                }
                z11 = z8;
                str6 = str5;
                ox6Var2 = ox6Var4;
                z12 = z9;
                z13 = z10;
                mh4Var4 = mh4Var3;
                j2 = j;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hu4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 24576;
        str4 = str2;
        i8 = i3 & 32;
        if (i8 != 0) {
            if ((196608 & i2) == 0) {
                z6 = z2;
                if (bj4VarO.c(z6)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                if ((1572864 & i2) == 0) {
                    z7 = z3;
                    if (bj4VarO.c(z7)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i14 = i4 | 12582912;
                } else {
                    i13 = i4;
                    if ((i2 & 12582912) == 0) {
                        if (bj4VarO.c(z4)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                        i14 = i13 | i15;
                    } else {
                        i14 = i13;
                    }
                }
                i16 = i3 & 256;
                if (i16 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i17 = 67108864;
                        } else {
                            i17 = 33554432;
                        }
                        i14 |= i17;
                    }
                    if ((i2 & 805306368) != 0) {
                        i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211111111111111111112 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111111111112 & 7168) | (i211111111111111111112 & 57344) | (i211111111111111111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211111111111111111113 = i18 >> 3;
                            int i211111111111111111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111111111113 & 7168) | (i211111111111111111113 & 57344) | (i211111111111111111113 & 458752);
                            int i211111111111111111115 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111111111114 | (i211111111111111111115 & 3670016) | (i211111111111111111115 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    } else {
                        bj4VarO.v0();
                        if ((i2 & 1) != 0) {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        } else {
                            if (i19 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            if (i6 != 0) {
                                str4 = null;
                            }
                            if (i8 != 0) {
                                z6 = true;
                            }
                            if (i10 != 0) {
                                z7 = false;
                            }
                            if (i12 != 0) {
                                z8 = false;
                            } else {
                                z8 = z4;
                            }
                            if (i16 != 0) {
                                bj4VarO.K(1618517830);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new gu4();
                                    bj4VarO.C(objF);
                                }
                                mh4Var2 = (mh4) objF;
                                bj4VarO.U(false);
                            } else {
                                mh4Var2 = mh4Var;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                z9 = z6;
                                j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                                mh4Var3 = mh4Var2;
                            } else {
                                mh4Var3 = mh4Var2;
                                z9 = z6;
                            }
                        }
                        z10 = z7;
                        i18 = i14;
                        ox6Var3 = ox6Var2;
                        str5 = str4;
                        bj4VarO.V();
                        if (z8) {
                            bj4VarO.K(-1365464858);
                            int i211111111111111111116 = i18 >> 3;
                            ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111111111116 & 7168) | (i211111111111111111116 & 57344) | (i211111111111111111116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                            bj4VarO.U(false);
                            ox6Var4 = ox6Var3;
                        } else {
                            bj4VarO.K(-1365149557);
                            int i211111111111111111117 = i18 >> 3;
                            int i211111111111111111118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111111111117 & 7168) | (i211111111111111111117 & 57344) | (i211111111111111111117 & 458752);
                            int i211111111111111111119 = i18 >> 6;
                            ox6Var4 = ox6Var3;
                            m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111111111118 | (i211111111111111111119 & 3670016) | (i211111111111111111119 & 29360128), 0);
                            bj4VarO.U(false);
                        }
                        z11 = z8;
                        str6 = str5;
                        ox6Var2 = ox6Var4;
                        z12 = z9;
                        z13 = z10;
                        mh4Var4 = mh4Var3;
                        j2 = j;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hu4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i2 & 805306368) != 0) {
                    i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                }
                if ((i14 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i2111111111111111111110 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111111111111110 & 7168) | (i2111111111111111111110 & 57344) | (i2111111111111111111110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i2111111111111111111111 = i18 >> 3;
                        int i2111111111111111111112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111111111111111 & 7168) | (i2111111111111111111111 & 57344) | (i2111111111111111111111 & 458752);
                        int i2111111111111111111113 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111111111111112 | (i2111111111111111111113 & 3670016) | (i2111111111111111111113 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                } else {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i2111111111111111111114 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111111111111114 & 7168) | (i2111111111111111111114 & 57344) | (i2111111111111111111114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i2111111111111111111115 = i18 >> 3;
                        int i2111111111111111111116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111111111111115 & 7168) | (i2111111111111111111115 & 57344) | (i2111111111111111111115 & 458752);
                        int i2111111111111111111117 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111111111111116 | (i2111111111111111111117 & 3670016) | (i2111111111111111111117 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hu4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i4 |= 1572864;
            z7 = z3;
            i12 = i3 & 128;
            if (i12 != 0) {
                i14 = i4 | 12582912;
            } else {
                i13 = i4;
                if ((i2 & 12582912) == 0) {
                    if (bj4VarO.c(z4)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i14 = i13 | i15;
                } else {
                    i14 = i13;
                }
            }
            i16 = i3 & 256;
            if (i16 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i14 |= i17;
                }
                if ((i2 & 805306368) != 0) {
                    i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                }
                if ((i14 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i2111111111111111111118 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111111111111118 & 7168) | (i2111111111111111111118 & 57344) | (i2111111111111111111118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i2111111111111111111119 = i18 >> 3;
                        int i21111111111111111111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111111111111119 & 7168) | (i2111111111111111111119 & 57344) | (i2111111111111111111119 & 458752);
                        int i21111111111111111111111 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111111111111110 | (i21111111111111111111111 & 3670016) | (i21111111111111111111111 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                } else {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i21111111111111111111112 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111111111111112 & 7168) | (i21111111111111111111112 & 57344) | (i21111111111111111111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i21111111111111111111113 = i18 >> 3;
                        int i21111111111111111111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111111111113 & 7168) | (i21111111111111111111113 & 57344) | (i21111111111111111111113 & 458752);
                        int i21111111111111111111115 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111111111111114 | (i21111111111111111111115 & 3670016) | (i21111111111111111111115 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hu4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i14 |= 100663296;
            if ((i2 & 805306368) != 0) {
                i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
            }
            if ((i14 & 306783379) == 306783378) {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                } else {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                }
                z10 = z7;
                i18 = i14;
                ox6Var3 = ox6Var2;
                str5 = str4;
                bj4VarO.V();
                if (z8) {
                    bj4VarO.K(-1365464858);
                    int i21111111111111111111116 = i18 >> 3;
                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111111111111116 & 7168) | (i21111111111111111111116 & 57344) | (i21111111111111111111116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                    bj4VarO.U(false);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.K(-1365149557);
                    int i21111111111111111111117 = i18 >> 3;
                    int i21111111111111111111118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111111111117 & 7168) | (i21111111111111111111117 & 57344) | (i21111111111111111111117 & 458752);
                    int i21111111111111111111119 = i18 >> 6;
                    ox6Var4 = ox6Var3;
                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111111111111118 | (i21111111111111111111119 & 3670016) | (i21111111111111111111119 & 29360128), 0);
                    bj4VarO.U(false);
                }
                z11 = z8;
                str6 = str5;
                ox6Var2 = ox6Var4;
                z12 = z9;
                z13 = z10;
                mh4Var4 = mh4Var3;
                j2 = j;
            } else {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                } else {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                }
                z10 = z7;
                i18 = i14;
                ox6Var3 = ox6Var2;
                str5 = str4;
                bj4VarO.V();
                if (z8) {
                    bj4VarO.K(-1365464858);
                    int i211111111111111111111110 = i18 >> 3;
                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111111111111110 & 7168) | (i211111111111111111111110 & 57344) | (i211111111111111111111110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                    bj4VarO.U(false);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.K(-1365149557);
                    int i211111111111111111111111 = i18 >> 3;
                    int i211111111111111111111112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111111111111111 & 7168) | (i211111111111111111111111 & 57344) | (i211111111111111111111111 & 458752);
                    int i211111111111111111111113 = i18 >> 6;
                    ox6Var4 = ox6Var3;
                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111111111111112 | (i211111111111111111111113 & 3670016) | (i211111111111111111111113 & 29360128), 0);
                    bj4VarO.U(false);
                }
                z11 = z8;
                str6 = str5;
                ox6Var2 = ox6Var4;
                z12 = z9;
                z13 = z10;
                mh4Var4 = mh4Var3;
                j2 = j;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hu4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 196608;
        z6 = z2;
        i10 = i3 & 64;
        if (i10 != 0) {
            if ((1572864 & i2) == 0) {
                z7 = z3;
                if (bj4VarO.c(z7)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i14 = i4 | 12582912;
            } else {
                i13 = i4;
                if ((i2 & 12582912) == 0) {
                    if (bj4VarO.c(z4)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i14 = i13 | i15;
                } else {
                    i14 = i13;
                }
            }
            i16 = i3 & 256;
            if (i16 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i14 |= i17;
                }
                if ((i2 & 805306368) != 0) {
                    i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
                }
                if ((i14 & 306783379) == 306783378) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i211111111111111111111114 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111111111111114 & 7168) | (i211111111111111111111114 & 57344) | (i211111111111111111111114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i211111111111111111111115 = i18 >> 3;
                        int i211111111111111111111116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111111111111115 & 7168) | (i211111111111111111111115 & 57344) | (i211111111111111111111115 & 458752);
                        int i211111111111111111111117 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111111111111116 | (i211111111111111111111117 & 3670016) | (i211111111111111111111117 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                } else {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0) {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    } else {
                        if (i19 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i8 != 0) {
                            z6 = true;
                        }
                        if (i10 != 0) {
                            z7 = false;
                        }
                        if (i12 != 0) {
                            z8 = false;
                        } else {
                            z8 = z4;
                        }
                        if (i16 != 0) {
                            bj4VarO.K(1618517830);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new gu4();
                                bj4VarO.C(objF);
                            }
                            mh4Var2 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var2 = mh4Var;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            z9 = z6;
                            j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                            mh4Var3 = mh4Var2;
                        } else {
                            mh4Var3 = mh4Var2;
                            z9 = z6;
                        }
                    }
                    z10 = z7;
                    i18 = i14;
                    ox6Var3 = ox6Var2;
                    str5 = str4;
                    bj4VarO.V();
                    if (z8) {
                        bj4VarO.K(-1365464858);
                        int i211111111111111111111118 = i18 >> 3;
                        ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111111111111118 & 7168) | (i211111111111111111111118 & 57344) | (i211111111111111111111118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                        bj4VarO.U(false);
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.K(-1365149557);
                        int i211111111111111111111119 = i18 >> 3;
                        int i2111111111111111111111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111111111111119 & 7168) | (i211111111111111111111119 & 57344) | (i211111111111111111111119 & 458752);
                        int i2111111111111111111111111 = i18 >> 6;
                        ox6Var4 = ox6Var3;
                        m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111111111111111110 | (i2111111111111111111111111 & 3670016) | (i2111111111111111111111111 & 29360128), 0);
                        bj4VarO.U(false);
                    }
                    z11 = z8;
                    str6 = str5;
                    ox6Var2 = ox6Var4;
                    z12 = z9;
                    z13 = z10;
                    mh4Var4 = mh4Var3;
                    j2 = j;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hu4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i14 |= 100663296;
            if ((i2 & 805306368) != 0) {
                i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
            }
            if ((i14 & 306783379) == 306783378) {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                } else {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                }
                z10 = z7;
                i18 = i14;
                ox6Var3 = ox6Var2;
                str5 = str4;
                bj4VarO.V();
                if (z8) {
                    bj4VarO.K(-1365464858);
                    int i2111111111111111111111112 = i18 >> 3;
                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111111111111111112 & 7168) | (i2111111111111111111111112 & 57344) | (i2111111111111111111111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                    bj4VarO.U(false);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.K(-1365149557);
                    int i2111111111111111111111113 = i18 >> 3;
                    int i2111111111111111111111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111111111111111113 & 7168) | (i2111111111111111111111113 & 57344) | (i2111111111111111111111113 & 458752);
                    int i2111111111111111111111115 = i18 >> 6;
                    ox6Var4 = ox6Var3;
                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111111111111111114 | (i2111111111111111111111115 & 3670016) | (i2111111111111111111111115 & 29360128), 0);
                    bj4VarO.U(false);
                }
                z11 = z8;
                str6 = str5;
                ox6Var2 = ox6Var4;
                z12 = z9;
                z13 = z10;
                mh4Var4 = mh4Var3;
                j2 = j;
            } else {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                } else {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                }
                z10 = z7;
                i18 = i14;
                ox6Var3 = ox6Var2;
                str5 = str4;
                bj4VarO.V();
                if (z8) {
                    bj4VarO.K(-1365464858);
                    int i2111111111111111111111116 = i18 >> 3;
                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i2111111111111111111111116 & 7168) | (i2111111111111111111111116 & 57344) | (i2111111111111111111111116 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                    bj4VarO.U(false);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.K(-1365149557);
                    int i2111111111111111111111117 = i18 >> 3;
                    int i2111111111111111111111118 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i2111111111111111111111117 & 7168) | (i2111111111111111111111117 & 57344) | (i2111111111111111111111117 & 458752);
                    int i2111111111111111111111119 = i18 >> 6;
                    ox6Var4 = ox6Var3;
                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i2111111111111111111111118 | (i2111111111111111111111119 & 3670016) | (i2111111111111111111111119 & 29360128), 0);
                    bj4VarO.U(false);
                }
                z11 = z8;
                str6 = str5;
                ox6Var2 = ox6Var4;
                z12 = z9;
                z13 = z10;
                mh4Var4 = mh4Var3;
                j2 = j;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hu4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 1572864;
        z7 = z3;
        i12 = i3 & 128;
        if (i12 != 0) {
            i14 = i4 | 12582912;
        } else {
            i13 = i4;
            if ((i2 & 12582912) == 0) {
                if (bj4VarO.c(z4)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i14 = i13 | i15;
            } else {
                i14 = i13;
            }
        }
        i16 = i3 & 256;
        if (i16 != 0) {
            if ((i2 & 100663296) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i17 = 67108864;
                } else {
                    i17 = 33554432;
                }
                i14 |= i17;
            }
            if ((i2 & 805306368) != 0) {
                i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
            }
            if ((i14 & 306783379) == 306783378) {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                } else {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                }
                z10 = z7;
                i18 = i14;
                ox6Var3 = ox6Var2;
                str5 = str4;
                bj4VarO.V();
                if (z8) {
                    bj4VarO.K(-1365464858);
                    int i21111111111111111111111110 = i18 >> 3;
                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111111111111111110 & 7168) | (i21111111111111111111111110 & 57344) | (i21111111111111111111111110 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                    bj4VarO.U(false);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.K(-1365149557);
                    int i21111111111111111111111111 = i18 >> 3;
                    int i21111111111111111111111112 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111111111111111 & 7168) | (i21111111111111111111111111 & 57344) | (i21111111111111111111111111 & 458752);
                    int i21111111111111111111111113 = i18 >> 6;
                    ox6Var4 = ox6Var3;
                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111111111111111112 | (i21111111111111111111111113 & 3670016) | (i21111111111111111111111113 & 29360128), 0);
                    bj4VarO.U(false);
                }
                z11 = z8;
                str6 = str5;
                ox6Var2 = ox6Var4;
                z12 = z9;
                z13 = z10;
                mh4Var4 = mh4Var3;
                j2 = j;
            } else {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                } else {
                    if (i19 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z6 = true;
                    }
                    if (i10 != 0) {
                        z7 = false;
                    }
                    if (i12 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i16 != 0) {
                        bj4VarO.K(1618517830);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new gu4();
                            bj4VarO.C(objF);
                        }
                        mh4Var2 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        z9 = z6;
                        j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                        mh4Var3 = mh4Var2;
                    } else {
                        mh4Var3 = mh4Var2;
                        z9 = z6;
                    }
                }
                z10 = z7;
                i18 = i14;
                ox6Var3 = ox6Var2;
                str5 = str4;
                bj4VarO.V();
                if (z8) {
                    bj4VarO.K(-1365464858);
                    int i21111111111111111111111114 = i18 >> 3;
                    ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111111111111111114 & 7168) | (i21111111111111111111111114 & 57344) | (i21111111111111111111111114 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                    bj4VarO.U(false);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.K(-1365149557);
                    int i21111111111111111111111115 = i18 >> 3;
                    int i21111111111111111111111116 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111111111111115 & 7168) | (i21111111111111111111111115 & 57344) | (i21111111111111111111111115 & 458752);
                    int i21111111111111111111111117 = i18 >> 6;
                    ox6Var4 = ox6Var3;
                    m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i21111111111111111111111116 | (i21111111111111111111111117 & 3670016) | (i21111111111111111111111117 & 29360128), 0);
                    bj4VarO.U(false);
                }
                z11 = z8;
                str6 = str5;
                ox6Var2 = ox6Var4;
                z12 = z9;
                z13 = z10;
                mh4Var4 = mh4Var3;
                j2 = j;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hu4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i14 |= 100663296;
        if ((i2 & 805306368) != 0) {
            i14 |= ((i3 & 512) == 0 || !bj4VarO.i(j)) ? 268435456 : 536870912;
        }
        if ((i14 & 306783379) == 306783378) {
            bj4VarO.v0();
            if ((i2 & 1) != 0) {
                if (i19 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                if (i6 != 0) {
                    str4 = null;
                }
                if (i8 != 0) {
                    z6 = true;
                }
                if (i10 != 0) {
                    z7 = false;
                }
                if (i12 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                if (i16 != 0) {
                    bj4VarO.K(1618517830);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new gu4();
                        bj4VarO.C(objF);
                    }
                    mh4Var2 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                if ((i3 & 512) != 0) {
                    i14 &= -1879048193;
                    z9 = z6;
                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                    mh4Var3 = mh4Var2;
                } else {
                    mh4Var3 = mh4Var2;
                    z9 = z6;
                }
            } else {
                if (i19 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                if (i6 != 0) {
                    str4 = null;
                }
                if (i8 != 0) {
                    z6 = true;
                }
                if (i10 != 0) {
                    z7 = false;
                }
                if (i12 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                if (i16 != 0) {
                    bj4VarO.K(1618517830);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new gu4();
                        bj4VarO.C(objF);
                    }
                    mh4Var2 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                if ((i3 & 512) != 0) {
                    i14 &= -1879048193;
                    z9 = z6;
                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                    mh4Var3 = mh4Var2;
                } else {
                    mh4Var3 = mh4Var2;
                    z9 = z6;
                }
            }
            z10 = z7;
            i18 = i14;
            ox6Var3 = ox6Var2;
            str5 = str4;
            bj4VarO.V();
            if (z8) {
                bj4VarO.K(-1365464858);
                int i21111111111111111111111118 = i18 >> 3;
                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i21111111111111111111111118 & 7168) | (i21111111111111111111111118 & 57344) | (i21111111111111111111111118 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                bj4VarO.U(false);
                ox6Var4 = ox6Var3;
            } else {
                bj4VarO.K(-1365149557);
                int i21111111111111111111111119 = i18 >> 3;
                int i211111111111111111111111110 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i21111111111111111111111119 & 7168) | (i21111111111111111111111119 & 57344) | (i21111111111111111111111119 & 458752);
                int i211111111111111111111111111 = i18 >> 6;
                ox6Var4 = ox6Var3;
                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111111111111111110 | (i211111111111111111111111111 & 3670016) | (i211111111111111111111111111 & 29360128), 0);
                bj4VarO.U(false);
            }
            z11 = z8;
            str6 = str5;
            ox6Var2 = ox6Var4;
            z12 = z9;
            z13 = z10;
            mh4Var4 = mh4Var3;
            j2 = j;
        } else {
            bj4VarO.v0();
            if ((i2 & 1) != 0) {
                if (i19 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                if (i6 != 0) {
                    str4 = null;
                }
                if (i8 != 0) {
                    z6 = true;
                }
                if (i10 != 0) {
                    z7 = false;
                }
                if (i12 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                if (i16 != 0) {
                    bj4VarO.K(1618517830);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new gu4();
                        bj4VarO.C(objF);
                    }
                    mh4Var2 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                if ((i3 & 512) != 0) {
                    i14 &= -1879048193;
                    z9 = z6;
                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                    mh4Var3 = mh4Var2;
                } else {
                    mh4Var3 = mh4Var2;
                    z9 = z6;
                }
            } else {
                if (i19 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                if (i6 != 0) {
                    str4 = null;
                }
                if (i8 != 0) {
                    z6 = true;
                }
                if (i10 != 0) {
                    z7 = false;
                }
                if (i12 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                if (i16 != 0) {
                    bj4VarO.K(1618517830);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new gu4();
                        bj4VarO.C(objF);
                    }
                    mh4Var2 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var2 = mh4Var;
                }
                if ((i3 & 512) != 0) {
                    i14 &= -1879048193;
                    z9 = z6;
                    j = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU();
                    mh4Var3 = mh4Var2;
                } else {
                    mh4Var3 = mh4Var2;
                    z9 = z6;
                }
            }
            z10 = z7;
            i18 = i14;
            ox6Var3 = ox6Var2;
            str5 = str4;
            bj4VarO.V();
            if (z8) {
                bj4VarO.K(-1365464858);
                int i211111111111111111111111112 = i18 >> 3;
                ExpandedHeaderMenuItemRow(ox6Var3, str3, i5, str5, z9, z10, mh4Var3, z5, bj4VarO, (i18 & 896) | ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i211111111111111111111111112 & 7168) | (i211111111111111111111111112 & 57344) | (i211111111111111111111111112 & 458752) | ((i18 >> 6) & 3670016) | ((i18 << 18) & 29360128), 0);
                bj4VarO.U(false);
                ox6Var4 = ox6Var3;
            } else {
                bj4VarO.K(-1365149557);
                int i211111111111111111111111113 = i18 >> 3;
                int i211111111111111111111111114 = ((i18 >> 9) & 14) | ((i18 << 3) & 112) | (i18 & 896) | (i211111111111111111111111113 & 7168) | (i211111111111111111111111113 & 57344) | (i211111111111111111111111113 & 458752);
                int i211111111111111111111111115 = i18 >> 6;
                ox6Var4 = ox6Var3;
                m148CollapsedHeaderMenuItemRow88mDfTA(ox6Var4, str, i, str5, z9, z10, mh4Var3, j, bj4VarO, i211111111111111111111111114 | (i211111111111111111111111115 & 3670016) | (i211111111111111111111111115 & 29360128), 0);
                bj4VarO.U(false);
            }
            z11 = z8;
            str6 = str5;
            ox6Var2 = ox6Var4;
            z12 = z9;
            z13 = z10;
            mh4Var4 = mh4Var3;
            j2 = j;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hu4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$2(str, z, i, ox6Var2, str6, z12, z13, z11, mh4Var4, j2, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HeaderMenuItemRow_6RhP_wg$lambda$2(String str, boolean z, int i, ox6 ox6Var, String str2, boolean z2, boolean z3, boolean z4, mh4 mh4Var, long j, int i2, int i3, jt1 jt1Var, int i4) {
        m149HeaderMenuItemRow6RhP_wg(str, z, i, ox6Var, str2, z2, z3, z4, mh4Var, j, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UnreadBadge(final ox6 ox6Var, final String str, jt1 jt1Var, final int i, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(1917800334);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var2 = ox6Var;
            long jM756getBadge0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m756getBadge0d7_KjU();
            final long j = ColorExtensionsKt.m840isLightColor8_81llA(jM756getBadge0d7_KjU) ? uh1.b : uh1.e;
            wi0.a(ox6Var2, jM756getBadge0d7_KjU, 0L, gr1.b(-1370135743, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt.UnreadBadge.1
                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i5) {
                    oy8Var.getClass();
                    if ((i5 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    mia.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType05(), j, cka.b(10), ob4.u, null, 0L, 0L, null, null, 16744440), jt1Var2, 0, 0, 131070);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                    invoke(oy8Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (i3 & 14) | 3072, 4);
            ox6Var = ox6Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: iu4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HeaderMenuItemRowKt.UnreadBadge$lambda$8(ox6Var, str, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UnreadBadge$lambda$8(ox6 ox6Var, String str, int i, int i2, jt1 jt1Var, int i3) {
        UnreadBadge(ox6Var, str, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
