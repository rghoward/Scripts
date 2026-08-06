package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import com.intercom.twig.BuildConfig;
import defpackage.a30;
import defpackage.ac4;
import defpackage.ae8;
import defpackage.ay;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dt6;
import defpackage.dv0;
import defpackage.e15;
import defpackage.eh6;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.h65;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.it6;
import defpackage.iv6;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.jt6;
import defpackage.kha;
import defpackage.kt6;
import defpackage.kw7;
import defpackage.l02;
import defpackage.lt6;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.mx1;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.raa;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.tg5;
import defpackage.uh1;
import defpackage.v94;
import defpackage.xj8;
import defpackage.yz9;
import defpackage.z2a;
import defpackage.zl9;
import defpackage.zz9;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.preview.data.DeleteType;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MessageComposerKt {
    private static final float ComposerHalfSize = 48.0f / 2.0f;
    private static final float ComposerIconSize = 16.0f;
    private static final float ComposerMinSize = 48.0f;

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5 A[PHI: r0 r2 r3
      0x00a5: PHI (r0v18 int) = (r0v14 int), (r0v19 int) binds: [B:69:0x00b4, B:60:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r2v5 ox6) = (r2v2 ox6), (r2v7 ox6) binds: [B:69:0x00b4, B:60:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r3v7 boolean) = (r3v4 boolean), (r3v8 boolean) binds: [B:69:0x00b4, B:60:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    private static final void ComposerActionButton(final mh4<g2b> mh4Var, ox6 ox6Var, boolean z, int i, jt1 jt1Var, final int i2, final int i3) {
        mh4<g2b> mh4Var2;
        int i4;
        ox6 ox6Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        final ox6 ox6Var3;
        final boolean z3;
        final int i8;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(-960429944);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            mh4Var2 = mh4Var;
        } else {
            mh4Var2 = mh4Var;
            if ((i2 & 6) == 0) {
                i4 = (bj4VarO.j(mh4Var2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                ox6Var2 = ox6Var;
                i4 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        i7 = i;
                        int i10 = bj4VarO.h(i7) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                        i4 |= i10;
                    } else {
                        i7 = i;
                    }
                    i4 |= i10;
                } else {
                    i7 = i;
                }
                if ((i4 & 1171) == 1170 || !bj4VarO.r()) {
                    bj4VarO.v0();
                    if ((i2 & 1) != 0 || bj4VarO.c0()) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i3 & 8) != 0) {
                            i8 = R.drawable.intercom_ic_arrow_up;
                            i4 &= -7169;
                        }
                        bj4VarO.V();
                        ox6 ox6VarA = raa.a(ox6Var3, "send_button");
                        e15 e15Var = tg5.a;
                        ox6 ox6VarJ = ir9.j(ox6VarA.H(iv6.t), 32.0f);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i11 = IntercomTheme.$stable;
                        h65.a((i4 & 14) | 1572864 | (i4 & 896), 40, bj4VarO, mh4Var2, gr1.b(-1864507480, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.ComposerActionButton.1
                            public final void invoke(jt1 jt1Var2, int i12) {
                                if ((i12 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    m65.b(is7.a(i8, jt1Var2, 0), null, ir9.j(ox6.a.t, MessageComposerKt.ComposerIconSize), 0L, jt1Var2, 440, 8);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), mx1.c(intercomTheme.getColors(bj4VarO, i11).m752getActionContrastWhite0d7_KjU(), intercomTheme.getColors(bj4VarO, i11).m770getOnActionContrastWhite0d7_KjU(), intercomTheme.getColors(bj4VarO, i11).getContainer().m794getNeutral0d7_KjU(), intercomTheme.getColors(bj4VarO, i11).getIcon().m807getDisabled0d7_KjU(), bj4VarO, 0), ox6VarJ, null, z3);
                        bj4VarO = bj4VarO;
                    } else {
                        bj4VarO.u();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        ox6Var3 = ox6Var2;
                        z3 = z2;
                    }
                    i8 = i7;
                    bj4VarO.V();
                    ox6 ox6VarA2 = raa.a(ox6Var3, "send_button");
                    e15 e15Var2 = tg5.a;
                    ox6 ox6VarJ2 = ir9.j(ox6VarA2.H(iv6.t), 32.0f);
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    int i12 = IntercomTheme.$stable;
                    h65.a((i4 & 14) | 1572864 | (i4 & 896), 40, bj4VarO, mh4Var2, gr1.b(-1864507480, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.ComposerActionButton.1
                        public final void invoke(jt1 jt1Var2, int i13) {
                            if ((i13 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                m65.b(is7.a(i8, jt1Var2, 0), null, ir9.j(ox6.a.t, MessageComposerKt.ComposerIconSize), 0L, jt1Var2, 440, 8);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), mx1.c(intercomTheme2.getColors(bj4VarO, i12).m752getActionContrastWhite0d7_KjU(), intercomTheme2.getColors(bj4VarO, i12).m770getOnActionContrastWhite0d7_KjU(), intercomTheme2.getColors(bj4VarO, i12).getContainer().m794getNeutral0d7_KjU(), intercomTheme2.getColors(bj4VarO, i12).getIcon().m807getDisabled0d7_KjU(), bj4VarO, 0), ox6VarJ2, null, z3);
                    bj4VarO = bj4VarO;
                } else {
                    bj4VarO.u();
                    ox6Var3 = ox6Var2;
                    z3 = z2;
                    i8 = i7;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ht6
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return MessageComposerKt.ComposerActionButton$lambda$69(mh4Var, ox6Var3, z3, i8, i2, i3, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i4 |= 384;
            z2 = z;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    i7 = i;
                    if (bj4VarO.h(i7)) {
                    }
                    i4 |= i10;
                } else {
                    i7 = i;
                }
                i4 |= i10;
            } else {
                i7 = i;
            }
            if ((i4 & 1171) == 1170) {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i3 & 8) != 0) {
                        i8 = R.drawable.intercom_ic_arrow_up;
                        i4 &= -7169;
                    } else {
                        i8 = i7;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i3 & 8) != 0) {
                        i8 = R.drawable.intercom_ic_arrow_up;
                        i4 &= -7169;
                    } else {
                        i8 = i7;
                    }
                }
                bj4VarO.V();
                ox6 ox6VarA3 = raa.a(ox6Var3, "send_button");
                e15 e15Var3 = tg5.a;
                ox6 ox6VarJ3 = ir9.j(ox6VarA3.H(iv6.t), 32.0f);
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                int i13 = IntercomTheme.$stable;
                h65.a((i4 & 14) | 1572864 | (i4 & 896), 40, bj4VarO, mh4Var2, gr1.b(-1864507480, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.ComposerActionButton.1
                    public final void invoke(jt1 jt1Var2, int i14) {
                        if ((i14 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            m65.b(is7.a(i8, jt1Var2, 0), null, ir9.j(ox6.a.t, MessageComposerKt.ComposerIconSize), 0L, jt1Var2, 440, 8);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), mx1.c(intercomTheme3.getColors(bj4VarO, i13).m752getActionContrastWhite0d7_KjU(), intercomTheme3.getColors(bj4VarO, i13).m770getOnActionContrastWhite0d7_KjU(), intercomTheme3.getColors(bj4VarO, i13).getContainer().m794getNeutral0d7_KjU(), intercomTheme3.getColors(bj4VarO, i13).getIcon().m807getDisabled0d7_KjU(), bj4VarO, 0), ox6VarJ3, null, z3);
                bj4VarO = bj4VarO;
            } else {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i3 & 8) != 0) {
                        i8 = R.drawable.intercom_ic_arrow_up;
                        i4 &= -7169;
                    } else {
                        i8 = i7;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i3 & 8) != 0) {
                        i8 = R.drawable.intercom_ic_arrow_up;
                        i4 &= -7169;
                    } else {
                        i8 = i7;
                    }
                }
                bj4VarO.V();
                ox6 ox6VarA4 = raa.a(ox6Var3, "send_button");
                e15 e15Var4 = tg5.a;
                ox6 ox6VarJ4 = ir9.j(ox6VarA4.H(iv6.t), 32.0f);
                IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                int i14 = IntercomTheme.$stable;
                h65.a((i4 & 14) | 1572864 | (i4 & 896), 40, bj4VarO, mh4Var2, gr1.b(-1864507480, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.ComposerActionButton.1
                    public final void invoke(jt1 jt1Var2, int i15) {
                        if ((i15 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            m65.b(is7.a(i8, jt1Var2, 0), null, ir9.j(ox6.a.t, MessageComposerKt.ComposerIconSize), 0L, jt1Var2, 440, 8);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), mx1.c(intercomTheme4.getColors(bj4VarO, i14).m752getActionContrastWhite0d7_KjU(), intercomTheme4.getColors(bj4VarO, i14).m770getOnActionContrastWhite0d7_KjU(), intercomTheme4.getColors(bj4VarO, i14).getContainer().m794getNeutral0d7_KjU(), intercomTheme4.getColors(bj4VarO, i14).getIcon().m807getDisabled0d7_KjU(), bj4VarO, 0), ox6VarJ4, null, z3);
                bj4VarO = bj4VarO;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ht6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MessageComposerKt.ComposerActionButton$lambda$69(mh4Var, ox6Var3, z3, i8, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 48;
        ox6Var2 = ox6Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                z2 = z;
                if (bj4VarO.c(z2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    i7 = i;
                    if (bj4VarO.h(i7)) {
                    }
                    i4 |= i10;
                } else {
                    i7 = i;
                }
                i4 |= i10;
            } else {
                i7 = i;
            }
            if ((i4 & 1171) == 1170) {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i3 & 8) != 0) {
                        i8 = R.drawable.intercom_ic_arrow_up;
                        i4 &= -7169;
                    } else {
                        i8 = i7;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i3 & 8) != 0) {
                        i8 = R.drawable.intercom_ic_arrow_up;
                        i4 &= -7169;
                    } else {
                        i8 = i7;
                    }
                }
                bj4VarO.V();
                ox6 ox6VarA5 = raa.a(ox6Var3, "send_button");
                e15 e15Var5 = tg5.a;
                ox6 ox6VarJ5 = ir9.j(ox6VarA5.H(iv6.t), 32.0f);
                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                int i15 = IntercomTheme.$stable;
                h65.a((i4 & 14) | 1572864 | (i4 & 896), 40, bj4VarO, mh4Var2, gr1.b(-1864507480, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.ComposerActionButton.1
                    public final void invoke(jt1 jt1Var2, int i16) {
                        if ((i16 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            m65.b(is7.a(i8, jt1Var2, 0), null, ir9.j(ox6.a.t, MessageComposerKt.ComposerIconSize), 0L, jt1Var2, 440, 8);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), mx1.c(intercomTheme5.getColors(bj4VarO, i15).m752getActionContrastWhite0d7_KjU(), intercomTheme5.getColors(bj4VarO, i15).m770getOnActionContrastWhite0d7_KjU(), intercomTheme5.getColors(bj4VarO, i15).getContainer().m794getNeutral0d7_KjU(), intercomTheme5.getColors(bj4VarO, i15).getIcon().m807getDisabled0d7_KjU(), bj4VarO, 0), ox6VarJ5, null, z3);
                bj4VarO = bj4VarO;
            } else {
                bj4VarO.v0();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i3 & 8) != 0) {
                        i8 = R.drawable.intercom_ic_arrow_up;
                        i4 &= -7169;
                    } else {
                        i8 = i7;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i3 & 8) != 0) {
                        i8 = R.drawable.intercom_ic_arrow_up;
                        i4 &= -7169;
                    } else {
                        i8 = i7;
                    }
                }
                bj4VarO.V();
                ox6 ox6VarA6 = raa.a(ox6Var3, "send_button");
                e15 e15Var6 = tg5.a;
                ox6 ox6VarJ6 = ir9.j(ox6VarA6.H(iv6.t), 32.0f);
                IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                int i16 = IntercomTheme.$stable;
                h65.a((i4 & 14) | 1572864 | (i4 & 896), 40, bj4VarO, mh4Var2, gr1.b(-1864507480, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.ComposerActionButton.1
                    public final void invoke(jt1 jt1Var2, int i17) {
                        if ((i17 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            m65.b(is7.a(i8, jt1Var2, 0), null, ir9.j(ox6.a.t, MessageComposerKt.ComposerIconSize), 0L, jt1Var2, 440, 8);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), mx1.c(intercomTheme6.getColors(bj4VarO, i16).m752getActionContrastWhite0d7_KjU(), intercomTheme6.getColors(bj4VarO, i16).m770getOnActionContrastWhite0d7_KjU(), intercomTheme6.getColors(bj4VarO, i16).getContainer().m794getNeutral0d7_KjU(), intercomTheme6.getColors(bj4VarO, i16).getIcon().m807getDisabled0d7_KjU(), bj4VarO, 0), ox6VarJ6, null, z3);
                bj4VarO = bj4VarO;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ht6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MessageComposerKt.ComposerActionButton$lambda$69(mh4Var, ox6Var3, z3, i8, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 384;
        z2 = z;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                i7 = i;
                if (bj4VarO.h(i7)) {
                }
                i4 |= i10;
            } else {
                i7 = i;
            }
            i4 |= i10;
        } else {
            i7 = i;
        }
        if ((i4 & 1171) == 1170) {
            bj4VarO.v0();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i5 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i3 & 8) != 0) {
                    i8 = R.drawable.intercom_ic_arrow_up;
                    i4 &= -7169;
                } else {
                    i8 = i7;
                }
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i5 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i3 & 8) != 0) {
                    i8 = R.drawable.intercom_ic_arrow_up;
                    i4 &= -7169;
                } else {
                    i8 = i7;
                }
            }
            bj4VarO.V();
            ox6 ox6VarA7 = raa.a(ox6Var3, "send_button");
            e15 e15Var7 = tg5.a;
            ox6 ox6VarJ7 = ir9.j(ox6VarA7.H(iv6.t), 32.0f);
            IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
            int i17 = IntercomTheme.$stable;
            h65.a((i4 & 14) | 1572864 | (i4 & 896), 40, bj4VarO, mh4Var2, gr1.b(-1864507480, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.ComposerActionButton.1
                public final void invoke(jt1 jt1Var2, int i18) {
                    if ((i18 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        m65.b(is7.a(i8, jt1Var2, 0), null, ir9.j(ox6.a.t, MessageComposerKt.ComposerIconSize), 0L, jt1Var2, 440, 8);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), mx1.c(intercomTheme7.getColors(bj4VarO, i17).m752getActionContrastWhite0d7_KjU(), intercomTheme7.getColors(bj4VarO, i17).m770getOnActionContrastWhite0d7_KjU(), intercomTheme7.getColors(bj4VarO, i17).getContainer().m794getNeutral0d7_KjU(), intercomTheme7.getColors(bj4VarO, i17).getIcon().m807getDisabled0d7_KjU(), bj4VarO, 0), ox6VarJ7, null, z3);
            bj4VarO = bj4VarO;
        } else {
            bj4VarO.v0();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i5 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i3 & 8) != 0) {
                    i8 = R.drawable.intercom_ic_arrow_up;
                    i4 &= -7169;
                } else {
                    i8 = i7;
                }
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i5 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i3 & 8) != 0) {
                    i8 = R.drawable.intercom_ic_arrow_up;
                    i4 &= -7169;
                } else {
                    i8 = i7;
                }
            }
            bj4VarO.V();
            ox6 ox6VarA8 = raa.a(ox6Var3, "send_button");
            e15 e15Var8 = tg5.a;
            ox6 ox6VarJ8 = ir9.j(ox6VarA8.H(iv6.t), 32.0f);
            IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
            int i18 = IntercomTheme.$stable;
            h65.a((i4 & 14) | 1572864 | (i4 & 896), 40, bj4VarO, mh4Var2, gr1.b(-1864507480, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.ComposerActionButton.1
                public final void invoke(jt1 jt1Var2, int i19) {
                    if ((i19 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        m65.b(is7.a(i8, jt1Var2, 0), null, ir9.j(ox6.a.t, MessageComposerKt.ComposerIconSize), 0L, jt1Var2, 440, 8);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), mx1.c(intercomTheme8.getColors(bj4VarO, i18).m752getActionContrastWhite0d7_KjU(), intercomTheme8.getColors(bj4VarO, i18).m770getOnActionContrastWhite0d7_KjU(), intercomTheme8.getColors(bj4VarO, i18).getContainer().m794getNeutral0d7_KjU(), intercomTheme8.getColors(bj4VarO, i18).getIcon().m807getDisabled0d7_KjU(), bj4VarO, 0), ox6VarJ8, null, z3);
            bj4VarO = bj4VarO;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ht6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MessageComposerKt.ComposerActionButton$lambda$69(mh4Var, ox6Var3, z3, i8, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ComposerActionButton$lambda$69(mh4 mh4Var, ox6 ox6Var, boolean z, int i, int i2, int i3, jt1 jt1Var, int i4) {
        ComposerActionButton(mh4Var, ox6Var, z, i, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void MessageComposer(defpackage.ox6 r93, defpackage.ci4<? super java.lang.String, ? super java.util.List<io.intercom.android.sdk.m5.conversation.states.MediaUploadItem>, defpackage.g2b> r94, io.intercom.android.sdk.m5.conversation.states.ComposerState.TextInput r95, defpackage.mh4<defpackage.g2b> r96, defpackage.mh4<defpackage.g2b> r97, defpackage.oh4<? super io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType, defpackage.g2b> r98, defpackage.oh4<? super io.intercom.android.sdk.m5.conversation.metrics.MetricData, defpackage.g2b> r99, defpackage.mh4<defpackage.g2b> r100, defpackage.zl9<? extends io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect> r101, io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState r102, defpackage.zz9<java.lang.Float> r103, defpackage.mh4<defpackage.g2b> r104, defpackage.mh4<defpackage.g2b> r105, defpackage.mh4<defpackage.g2b> r106, defpackage.oh4<? super io.intercom.android.sdk.m5.conversation.states.MediaUploadItem, defpackage.g2b> r107, defpackage.oh4<? super io.intercom.android.sdk.m5.conversation.states.MediaUploadItem, defpackage.g2b> r108, defpackage.mh4<defpackage.g2b> r109, defpackage.jt1 r110, int r111, int r112, int r113) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.MessageComposer(ox6, ci4, io.intercom.android.sdk.m5.conversation.states.ComposerState$TextInput, mh4, mh4, oh4, oh4, mh4, zl9, io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState, zz9, mh4, mh4, mh4, oh4, oh4, mh4, jt1, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$17$lambda$16(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$19$lambda$18(MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h37 MessageComposer$lambda$23$lambda$22(String str) {
        int length = str.length();
        return bl7.i(new kha(4, ay.c(length, length), str));
    }

    private static final kha MessageComposer$lambda$24(h37<kha> h37Var) {
        return h37Var.getValue();
    }

    private static final long MessageComposer$lambda$28(h37<uh1> h37Var) {
        return h37Var.getValue().a;
    }

    private static final void MessageComposer$lambda$29(h37<uh1> h37Var, long j) {
        h37Var.setValue(new uh1(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState MessageComposer$lambda$30(yz9<KeyboardState> yz9Var) {
        return yz9Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$34$lambda$33(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$40$lambda$39(ComposerState.TextInput textInput, oh4 oh4Var, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        List<MediaUploadItem> mediaUploadItems = textInput.getMediaUploadItems();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mediaUploadItems) {
            if (!arrayList.remove(((MediaUploadItem) obj).getMediaData().getUri())) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            oh4Var.invoke((MediaUploadItem) obj2);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$5$lambda$4(ComposerInputType composerInputType) {
        composerInputType.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$66$lambda$42$lambda$41(mh4 mh4Var, oh4 oh4Var, h37 h37Var) {
        mh4Var.invoke();
        h37Var.setValue(new kha(6, 0L, BuildConfig.FLAVOR));
        oh4Var.invoke(ComposerInputType.Text.INSTANCE);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$66$lambda$44$lambda$43(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$66$lambda$47$lambda$46(eh6 eh6Var, ComposerState.TextInput textInput, int i) {
        List<MediaUploadItem> mediaUploadItems = textInput.getMediaUploadItems();
        ArrayList arrayList = new ArrayList(ph1.n(mediaUploadItems, 10));
        Iterator<T> it = mediaUploadItems.iterator();
        while (it.hasNext()) {
            arrayList.add(new IntercomPreviewFile.LocalFile(((MediaUploadItem) it.next()).getMediaData().getUri()));
        }
        eh6Var.a(new IntercomPreviewArgs(arrayList, DeleteType.Delete.INSTANCE, null, false, i, null, 44, null));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$66$lambda$56$lambda$53$lambda$49$lambda$48(long j, long j2, h37 h37Var, v94 v94Var) {
        v94Var.getClass();
        if (!v94Var.e()) {
            j = j2;
        }
        MessageComposer$lambda$29(h37Var, j);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$66$lambda$56$lambda$53$lambda$52$lambda$51(mh4 mh4Var, h37 h37Var, kha khaVar) {
        khaVar.getClass();
        mh4Var.invoke();
        h37Var.setValue(khaVar);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$66$lambda$56$lambda$55$lambda$54(ci4 ci4Var, ComposerState.TextInput textInput, mh4 mh4Var, h37 h37Var) {
        ci4Var.invoke(MessageComposer$lambda$24(h37Var).a.u, textInput.getMediaUploadItems());
        h37Var.setValue(new kha(6, 0L, BuildConfig.FLAVOR));
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$66$lambda$65$lambda$58$lambda$57(oh4 oh4Var, mh4 mh4Var) {
        oh4Var.invoke(new MetricData.ComposerInputClicked(MetricTracker.Object.GIF_INPUT));
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$66$lambda$65$lambda$60$lambda$59(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$66$lambda$65$lambda$62$lambda$61(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$66$lambda$65$lambda$64$lambda$63(ci4 ci4Var, ComposerState.TextInput textInput, mh4 mh4Var, h37 h37Var) {
        ci4Var.invoke(MessageComposer$lambda$24(h37Var).a.u, textInput.getMediaUploadItems());
        h37Var.setValue(new kha(6, 0L, BuildConfig.FLAVOR));
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$67(ox6 ox6Var, ci4 ci4Var, ComposerState.TextInput textInput, mh4 mh4Var, mh4 mh4Var2, oh4 oh4Var, oh4 oh4Var2, mh4 mh4Var3, zl9 zl9Var, VoiceTranscriptionState voiceTranscriptionState, zz9 zz9Var, mh4 mh4Var4, mh4 mh4Var5, mh4 mh4Var6, oh4 oh4Var3, oh4 oh4Var4, mh4 mh4Var7, int i, int i2, int i3, jt1 jt1Var, int i4) throws Throwable {
        MessageComposer(ox6Var, ci4Var, textInput, mh4Var, mh4Var2, oh4Var, oh4Var2, mh4Var3, zl9Var, voiceTranscriptionState, zz9Var, mh4Var4, mh4Var5, mh4Var6, oh4Var3, oh4Var4, mh4Var7, jt1Var, gz3.s(i | 1), gz3.s(i2), i3);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MessageComposer$lambda$7$lambda$6(MetricData metricData) {
        metricData.getClass();
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TextComposerPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-609144377);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m169getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jt6(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextComposerPreview$lambda$75(int i, jt1 jt1Var, int i2) {
        TextComposerPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TextComposerWithButtonsPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1468421996);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m170getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kt6(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextComposerWithButtonsPreview$lambda$76(int i, jt1 jt1Var, int i2) {
        TextComposerWithButtonsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TextComposerWithFileItemsPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(233053391);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m173getLambda7$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new lt6(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextComposerWithFileItemsPreview$lambda$79(int i, jt1 jt1Var, int i2) {
        TextComposerWithFileItemsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TextComposerWithInitialTextPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-986390788);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m171getLambda5$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new it6(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextComposerWithInitialTextPreview$lambda$77(int i, jt1 jt1Var, int i2) {
        TextComposerWithInitialTextPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TextComposerWithMediaItemsPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-71803831);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m172getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new dt6(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextComposerWithMediaItemsPreview$lambda$78(int i, jt1 jt1Var, int i2) {
        TextComposerWithMediaItemsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void VoiceNotesComposer(final VoiceTranscriptionState voiceTranscriptionState, final zz9<Float> zz9Var, final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, jt1 jt1Var, final int i) {
        int i2;
        boolean z;
        bj4 bj4VarO = jt1Var.o(-592615267);
        j1b j1bVar = bj4VarO.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bj4VarO.J(voiceTranscriptionState) : bj4VarO.j(voiceTranscriptionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(zz9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(mh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = ir9.c(aVar, 1.0f);
            c30.h hVar = new c30.h(8.0f, true, new a30());
            sp0.b bVar = di.a.k;
            ny8 ny8VarA = ly8.a(hVar, bVar, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            bt1.a.c cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, ny8VarA);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar2 = bt1.a.g;
            rd7.d(bj4VarO, bVar2, numValueOf);
            bt1.a.C0034a c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC2);
            e15 e15Var = tg5.a;
            ox6 ox6VarJ = ir9.j(iv6.t, 32.0f);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i3 = IntercomTheme.$stable;
            boolean z2 = true;
            int i4 = i2;
            h65.a(((i4 >> 6) & 14) | 1572912, 44, bj4VarO, mh4Var, ComposableSingletons$MessageComposerKt.INSTANCE.m168getLambda2$intercom_sdk_base_release(), mx1.c(intercomTheme.getColors(bj4VarO, i3).getAlpha().m687getBlack100d7_KjU(), intercomTheme.getColors(bj4VarO, i3).getIcon().m809getMuted0d7_KjU(), intercomTheme.getColors(bj4VarO, i3).getContainer().m794getNeutral0d7_KjU(), intercomTheme.getColors(bj4VarO, i3).getIcon().m807getDisabled0d7_KjU(), bj4VarO, 0), ox6VarJ, null, false);
            bj4VarO = bj4VarO;
            qs5 qs5Var = new qs5(true, 1.0f);
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP2 = bj4VarO.P();
            ox6 ox6VarC3 = it1.c(bj4VarO, qs5Var);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar2, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            boolean z3 = voiceTranscriptionState instanceof VoiceTranscriptionState.Recording;
            if (z3) {
                bj4VarO.K(1110825199);
                SoundWaveVisualizationKt.m194SoundWaveVisualizationFNF3uiM(zz9Var, null, intercomTheme.getColors(bj4VarO, i3).getText().m827getMuted0d7_KjU(), bj4VarO, (i4 >> 3) & 14, 2);
                bj4VarO.U(false);
                z = z3;
            } else if (voiceTranscriptionState instanceof VoiceTranscriptionState.Processing) {
                bj4VarO.K(1111106679);
                ny8 ny8VarA2 = ly8.a(new c30.h(4.0f, true, new a30()), bVar, bj4VarO, 54);
                int iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7 kw7VarP3 = bj4VarO.P();
                ox6 ox6VarC4 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar2, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC4);
                z = z3;
                ae8.a(ir9.j(aVar, 16.0f), ac4.b(intercomTheme, bj4VarO, i3), 2.0f, 0L, 0, 0.0f, bj4VarO, 390, 56);
                mia.b(nr1.f(bj4VarO, io.intercom.android.sdk.R.string.intercom_transcribing), null, ac4.b(intercomTheme, bj4VarO, i3), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i3).getType04(), bj4VarO, 0, 0, 131066);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(false);
                z2 = true;
            } else {
                z = z3;
                if (voiceTranscriptionState instanceof VoiceTranscriptionState.Error) {
                    bj4VarO.K(1111928985);
                    ny8 ny8VarA3 = ly8.a(new c30.h(4.0f, true, new a30()), bVar, bj4VarO, 54);
                    int iHashCode4 = Long.hashCode(bj4VarO.T);
                    kw7 kw7VarP4 = bj4VarO.P();
                    ox6 ox6VarC5 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, ny8VarA3);
                    rd7.d(bj4VarO, eVar, kw7VarP4);
                    l02.a(iHashCode4, bj4VarO, bVar2, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC5);
                    m65.b(is7.a(R.drawable.intercom_ic_error, bj4VarO, 0), null, null, intercomTheme.getColors(bj4VarO, i3).getIcon().m808getError0d7_KjU(), bj4VarO, 56, 4);
                    mia.b(((VoiceTranscriptionState.Error) voiceTranscriptionState).getError().getUserMessage().getText(bj4VarO, StringProvider.$stable), null, intercomTheme.getColors(bj4VarO, i3).getText().m826getError0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i3).getType04(), bj4VarO, 0, 0, 131066);
                    bj4VarO = bj4VarO;
                    z2 = true;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                } else {
                    z2 = true;
                    bj4VarO.K(1112700792);
                    bj4VarO.U(false);
                }
            }
            bj4VarO.U(z2);
            ComposerActionButton(mh4Var2, null, z, z ? R.drawable.intercom_ic_stop : R.drawable.intercom_ic_arrow_up, bj4VarO, (i4 >> 9) & 14, 2);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: qs6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MessageComposerKt.VoiceNotesComposer$lambda$74(voiceTranscriptionState, zz9Var, mh4Var, mh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b VoiceNotesComposer$lambda$74(VoiceTranscriptionState voiceTranscriptionState, zz9 zz9Var, mh4 mh4Var, mh4 mh4Var2, int i, jt1 jt1Var, int i2) {
        VoiceNotesComposer(voiceTranscriptionState, zz9Var, mh4Var, mh4Var2, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void VoiceNotesComposerPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1575191241);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m174getLambda8$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ws6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MessageComposerKt.VoiceNotesComposerPreview$lambda$80(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b VoiceNotesComposerPreview$lambda$80(int i, jt1 jt1Var, int i2) {
        VoiceNotesComposerPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final boolean canSendMessage(String str, List<MediaUploadItem> list, boolean z) {
        if (z) {
            return false;
        }
        if (z2a.w(str) && list.isEmpty()) {
            return false;
        }
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((MediaUploadItem) it.next()).isSuccess()) {
                return false;
            }
        }
        return true;
    }

    public static final float getComposerHalfSize() {
        return ComposerHalfSize;
    }

    public static final float getComposerMinSize() {
        return ComposerMinSize;
    }
}
