package io.intercom.android.sdk.tickets;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a30;
import defpackage.aj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.m65;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.v5a;
import defpackage.we1;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z2a;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.FileType;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import io.intercom.android.sdk.tickets.FIleAttachmentListKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.BoxedTextLayoutKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FIleAttachmentListKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void FailedFileAttached(ox6 ox6Var, final String str, final FileType fileType, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        String str2;
        FileType fileType2;
        ox6 ox6Var3;
        xj8 xj8VarW;
        str.getClass();
        fileType.getClass();
        bj4 bj4VarO = jt1Var.o(912363521);
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
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.J(str2) ? 32 : 16;
            }
        }
        if ((i2 & 4) == 0) {
            if ((i & 384) == 0) {
                fileType2 = fileType;
                i3 |= bj4VarO.J(fileType2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i5 = IntercomTheme.$stable;
                m525FileAttachmentvRFhKjU(ox6Var3, str2, fileType2, intercomTheme.getColors(bj4VarO, i5).m766getError0d7_KjU(), intercomTheme.getColors(bj4VarO, i5).m766getError0d7_KjU(), ComposableSingletons$FIleAttachmentListKt.INSTANCE.m508getLambda1$intercom_sdk_base_release(), null, bj4VarO, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896), 64);
                ox6Var2 = ox6Var3;
            } else {
                bj4VarO.u();
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: os3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FIleAttachmentListKt.FailedFileAttached$lambda$6(ox6Var2, str, fileType, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        fileType2 = fileType;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i6 = IntercomTheme.$stable;
            m525FileAttachmentvRFhKjU(ox6Var3, str2, fileType2, intercomTheme2.getColors(bj4VarO, i6).m766getError0d7_KjU(), intercomTheme2.getColors(bj4VarO, i6).m766getError0d7_KjU(), ComposableSingletons$FIleAttachmentListKt.INSTANCE.m508getLambda1$intercom_sdk_base_release(), null, bj4VarO, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896), 64);
            ox6Var2 = ox6Var3;
        } else {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i7 = IntercomTheme.$stable;
            m525FileAttachmentvRFhKjU(ox6Var3, str2, fileType2, intercomTheme3.getColors(bj4VarO, i7).m766getError0d7_KjU(), intercomTheme3.getColors(bj4VarO, i7).m766getError0d7_KjU(), ComposableSingletons$FIleAttachmentListKt.INSTANCE.m508getLambda1$intercom_sdk_base_release(), null, bj4VarO, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896), 64);
            ox6Var2 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: os3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FIleAttachmentListKt.FailedFileAttached$lambda$6(ox6Var2, str, fileType, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FailedFileAttached$lambda$6(ox6 ox6Var, String str, FileType fileType, int i, int i2, jt1 jt1Var, int i3) {
        FailedFileAttached(ox6Var, str, fileType, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011d  */
    /* JADX WARN: Code duplicated, block: B:104:0x013a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:114:0x0190  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    /* JADX INFO: renamed from: FileAttachment-vRFhKjU, reason: not valid java name */
    public static final void m525FileAttachmentvRFhKjU(ox6 ox6Var, final String str, final FileType fileType, long j, long j2, ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var, ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var2, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        String str2;
        long jB;
        long jA;
        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var3;
        int i4;
        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var4;
        int i5;
        ox6 ox6Var3;
        ox6 ox6Var4;
        final ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var5;
        long j3;
        long j4;
        bj4 bj4Var;
        final ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var6;
        final ox6 ox6Var5;
        final long j5;
        final long j6;
        final ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var7;
        xj8 xj8VarW;
        str.getClass();
        fileType.getClass();
        bj4 bj4VarO = jt1Var.o(1921960973);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.J(str2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(fileType) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jB = j;
                int i7 = bj4VarO.i(jB) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                i3 |= i7;
            } else {
                jB = j;
            }
            i3 |= i7;
        } else {
            jB = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jA = j2;
                int i8 = bj4VarO.i(jA) ? 16384 : 8192;
                i3 |= i8;
            } else {
                jA = j2;
            }
            i3 |= i8;
        } else {
            jA = j2;
        }
        int i9 = i2 & 32;
        if (i9 == 0) {
            if ((196608 & i) == 0) {
                ei4Var3 = ei4Var;
                i3 |= bj4VarO.j(ei4Var3) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    ei4Var4 = ei4Var2;
                    if (bj4VarO.j(ei4Var4)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                if ((599187 & i3) == 599186 || !bj4VarO.r()) {
                    bj4VarO.v0();
                    if ((i & 1) != 0 || bj4VarO.c0()) {
                        if (i6 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 8) != 0) {
                            jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            i3 &= -57345;
                        }
                        if (i9 != 0) {
                            ei4Var3 = null;
                        }
                        if (i4 != 0) {
                            ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var8 = ei4Var3;
                            ox6Var4 = ox6Var3;
                            ei4Var5 = ei4Var8;
                            ei4Var4 = null;
                            j4 = jB;
                            j3 = jA;
                        } else {
                            ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var9 = ei4Var3;
                            ox6Var4 = ox6Var3;
                            ei4Var5 = ei4Var9;
                            j3 = jA;
                        }
                        bj4VarO.V();
                        int i10 = (i3 & 14) | 24576 | (i3 & 112);
                        int i11 = i3 >> 3;
                        bj4Var = bj4VarO;
                        BoxedTextLayoutKt.m556BoxedTextLayoutY0xEhic(ox6Var4, str2, j4, j3, gr1.b(-344274505, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[FileType.values().length];
                                    try {
                                        iArr[FileType.IMAGE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[FileType.VIDEO.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i12) {
                                int i13;
                                oy8Var.getClass();
                                if ((i12 & 6) == 0) {
                                    i12 |= jt1Var2.J(oy8Var) ? 4 : 2;
                                }
                                if ((i12 & 19) == 18 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                if (ei4Var5 != null) {
                                    jt1Var2.K(1377521019);
                                    ei4Var5.invoke(oy8Var, jt1Var2, Integer.valueOf(i12 & 14));
                                    jt1Var2.B();
                                    return;
                                }
                                jt1Var2.K(1377586987);
                                int i14 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                                if (i14 != 1) {
                                    i13 = i14 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                                } else {
                                    i13 = R.drawable.intercom_ic_image;
                                }
                                m65.b(is7.a(i13, jt1Var2, 0), "Image Icon", ir9.j(ox6.a.t, 16.0f), 0L, jt1Var2, 440, 8);
                                jt1Var2.B();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                                invoke(oy8Var, jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ei4Var4, bj4Var, i10 | (i11 & 896) | (i11 & 7168) | (i11 & 458752), 0);
                        ei4Var6 = ei4Var5;
                        ox6Var5 = ox6Var4;
                        j5 = j4;
                        j6 = j3;
                        ei4Var7 = ei4Var4;
                    } else {
                        bj4VarO.u();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        j3 = jA;
                        ei4Var5 = ei4Var3;
                        ox6Var4 = ox6Var2;
                    }
                    j4 = jB;
                    bj4VarO.V();
                    int i12 = (i3 & 14) | 24576 | (i3 & 112);
                    int i13 = i3 >> 3;
                    bj4Var = bj4VarO;
                    BoxedTextLayoutKt.m556BoxedTextLayoutY0xEhic(ox6Var4, str2, j4, j3, gr1.b(-344274505, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[FileType.values().length];
                                try {
                                    iArr[FileType.IMAGE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[FileType.VIDEO.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i14) {
                            int i15;
                            oy8Var.getClass();
                            if ((i14 & 6) == 0) {
                                i14 |= jt1Var2.J(oy8Var) ? 4 : 2;
                            }
                            if ((i14 & 19) == 18 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            if (ei4Var5 != null) {
                                jt1Var2.K(1377521019);
                                ei4Var5.invoke(oy8Var, jt1Var2, Integer.valueOf(i14 & 14));
                                jt1Var2.B();
                                return;
                            }
                            jt1Var2.K(1377586987);
                            int i16 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                            if (i16 != 1) {
                                i15 = i16 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                            } else {
                                i15 = R.drawable.intercom_ic_image;
                            }
                            m65.b(is7.a(i15, jt1Var2, 0), "Image Icon", ir9.j(ox6.a.t, 16.0f), 0L, jt1Var2, 440, 8);
                            jt1Var2.B();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ei4Var4, bj4Var, i12 | (i13 & 896) | (i13 & 7168) | (i13 & 458752), 0);
                    ei4Var6 = ei4Var5;
                    ox6Var5 = ox6Var4;
                    j5 = j4;
                    j6 = j3;
                    ei4Var7 = ei4Var4;
                } else {
                    bj4VarO.u();
                    bj4Var = bj4VarO;
                    ox6Var5 = ox6Var2;
                    j5 = jB;
                    j6 = jA;
                    ei4Var6 = ei4Var3;
                    ei4Var7 = ei4Var4;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ps3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$5(ox6Var5, str, fileType, j5, j6, ei4Var6, ei4Var7, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            ei4Var4 = ei4Var2;
            if ((599187 & i3) == 599186) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -57345;
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var10 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var10;
                        ei4Var4 = null;
                        j4 = jB;
                        j3 = jA;
                    } else {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var11 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var11;
                        j3 = jA;
                        j4 = jB;
                    }
                } else {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -57345;
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var12 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var12;
                        ei4Var4 = null;
                        j4 = jB;
                        j3 = jA;
                    } else {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var13 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var13;
                        j3 = jA;
                        j4 = jB;
                    }
                }
                bj4VarO.V();
                int i14 = (i3 & 14) | 24576 | (i3 & 112);
                int i15 = i3 >> 3;
                bj4Var = bj4VarO;
                BoxedTextLayoutKt.m556BoxedTextLayoutY0xEhic(ox6Var4, str2, j4, j3, gr1.b(-344274505, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i16) {
                        int i17;
                        oy8Var.getClass();
                        if ((i16 & 6) == 0) {
                            i16 |= jt1Var2.J(oy8Var) ? 4 : 2;
                        }
                        if ((i16 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        if (ei4Var5 != null) {
                            jt1Var2.K(1377521019);
                            ei4Var5.invoke(oy8Var, jt1Var2, Integer.valueOf(i16 & 14));
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(1377586987);
                        int i18 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i18 != 1) {
                            i17 = i18 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                        } else {
                            i17 = R.drawable.intercom_ic_image;
                        }
                        m65.b(is7.a(i17, jt1Var2, 0), "Image Icon", ir9.j(ox6.a.t, 16.0f), 0L, jt1Var2, 440, 8);
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ei4Var4, bj4Var, i14 | (i15 & 896) | (i15 & 7168) | (i15 & 458752), 0);
                ei4Var6 = ei4Var5;
                ox6Var5 = ox6Var4;
                j5 = j4;
                j6 = j3;
                ei4Var7 = ei4Var4;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -57345;
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var14 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var14;
                        ei4Var4 = null;
                        j4 = jB;
                        j3 = jA;
                    } else {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var15 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var15;
                        j3 = jA;
                        j4 = jB;
                    }
                } else {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -57345;
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var16 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var16;
                        ei4Var4 = null;
                        j4 = jB;
                        j3 = jA;
                    } else {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var17 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var17;
                        j3 = jA;
                        j4 = jB;
                    }
                }
                bj4VarO.V();
                int i16 = (i3 & 14) | 24576 | (i3 & 112);
                int i17 = i3 >> 3;
                bj4Var = bj4VarO;
                BoxedTextLayoutKt.m556BoxedTextLayoutY0xEhic(ox6Var4, str2, j4, j3, gr1.b(-344274505, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i18) {
                        int i19;
                        oy8Var.getClass();
                        if ((i18 & 6) == 0) {
                            i18 |= jt1Var2.J(oy8Var) ? 4 : 2;
                        }
                        if ((i18 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        if (ei4Var5 != null) {
                            jt1Var2.K(1377521019);
                            ei4Var5.invoke(oy8Var, jt1Var2, Integer.valueOf(i18 & 14));
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(1377586987);
                        int i110 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i110 != 1) {
                            i19 = i110 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                        } else {
                            i19 = R.drawable.intercom_ic_image;
                        }
                        m65.b(is7.a(i19, jt1Var2, 0), "Image Icon", ir9.j(ox6.a.t, 16.0f), 0L, jt1Var2, 440, 8);
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ei4Var4, bj4Var, i16 | (i17 & 896) | (i17 & 7168) | (i17 & 458752), 0);
                ei4Var6 = ei4Var5;
                ox6Var5 = ox6Var4;
                j5 = j4;
                j6 = j3;
                ei4Var7 = ei4Var4;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ps3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$5(ox6Var5, str, fileType, j5, j6, ei4Var6, ei4Var7, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        ei4Var3 = ei4Var;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                ei4Var4 = ei4Var2;
                if (bj4VarO.j(ei4Var4)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((599187 & i3) == 599186) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -57345;
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var18 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var18;
                        ei4Var4 = null;
                        j4 = jB;
                        j3 = jA;
                    } else {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var19 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var19;
                        j3 = jA;
                        j4 = jB;
                    }
                } else {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -57345;
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var110 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var110;
                        ei4Var4 = null;
                        j4 = jB;
                        j3 = jA;
                    } else {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var111 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var111;
                        j3 = jA;
                        j4 = jB;
                    }
                }
                bj4VarO.V();
                int i18 = (i3 & 14) | 24576 | (i3 & 112);
                int i19 = i3 >> 3;
                bj4Var = bj4VarO;
                BoxedTextLayoutKt.m556BoxedTextLayoutY0xEhic(ox6Var4, str2, j4, j3, gr1.b(-344274505, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i110) {
                        int i111;
                        oy8Var.getClass();
                        if ((i110 & 6) == 0) {
                            i110 |= jt1Var2.J(oy8Var) ? 4 : 2;
                        }
                        if ((i110 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        if (ei4Var5 != null) {
                            jt1Var2.K(1377521019);
                            ei4Var5.invoke(oy8Var, jt1Var2, Integer.valueOf(i110 & 14));
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(1377586987);
                        int i112 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i112 != 1) {
                            i111 = i112 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                        } else {
                            i111 = R.drawable.intercom_ic_image;
                        }
                        m65.b(is7.a(i111, jt1Var2, 0), "Image Icon", ir9.j(ox6.a.t, 16.0f), 0L, jt1Var2, 440, 8);
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ei4Var4, bj4Var, i18 | (i19 & 896) | (i19 & 7168) | (i19 & 458752), 0);
                ei4Var6 = ei4Var5;
                ox6Var5 = ox6Var4;
                j5 = j4;
                j6 = j3;
                ei4Var7 = ei4Var4;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -57345;
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var112 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var112;
                        ei4Var4 = null;
                        j4 = jB;
                        j3 = jA;
                    } else {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var113 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var113;
                        j3 = jA;
                        j4 = jB;
                    }
                } else {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        i3 &= -57345;
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var114 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var114;
                        ei4Var4 = null;
                        j4 = jB;
                        j3 = jA;
                    } else {
                        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var115 = ei4Var3;
                        ox6Var4 = ox6Var3;
                        ei4Var5 = ei4Var115;
                        j3 = jA;
                        j4 = jB;
                    }
                }
                bj4VarO.V();
                int i110 = (i3 & 14) | 24576 | (i3 & 112);
                int i111 = i3 >> 3;
                bj4Var = bj4VarO;
                BoxedTextLayoutKt.m556BoxedTextLayoutY0xEhic(ox6Var4, str2, j4, j3, gr1.b(-344274505, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[FileType.values().length];
                            try {
                                iArr[FileType.IMAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[FileType.VIDEO.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i112) {
                        int i113;
                        oy8Var.getClass();
                        if ((i112 & 6) == 0) {
                            i112 |= jt1Var2.J(oy8Var) ? 4 : 2;
                        }
                        if ((i112 & 19) == 18 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        if (ei4Var5 != null) {
                            jt1Var2.K(1377521019);
                            ei4Var5.invoke(oy8Var, jt1Var2, Integer.valueOf(i112 & 14));
                            jt1Var2.B();
                            return;
                        }
                        jt1Var2.K(1377586987);
                        int i114 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                        if (i114 != 1) {
                            i113 = i114 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                        } else {
                            i113 = R.drawable.intercom_ic_image;
                        }
                        m65.b(is7.a(i113, jt1Var2, 0), "Image Icon", ir9.j(ox6.a.t, 16.0f), 0L, jt1Var2, 440, 8);
                        jt1Var2.B();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                        invoke(oy8Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ei4Var4, bj4Var, i110 | (i111 & 896) | (i111 & 7168) | (i111 & 458752), 0);
                ei4Var6 = ei4Var5;
                ox6Var5 = ox6Var4;
                j5 = j4;
                j6 = j3;
                ei4Var7 = ei4Var4;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ps3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$5(ox6Var5, str, fileType, j5, j6, ei4Var6, ei4Var7, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 1572864;
        ei4Var4 = ei4Var2;
        if ((599187 & i3) == 599186) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 8) != 0) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -57345;
                }
                if (i9 != 0) {
                    ei4Var3 = null;
                }
                if (i4 != 0) {
                    ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var116 = ei4Var3;
                    ox6Var4 = ox6Var3;
                    ei4Var5 = ei4Var116;
                    ei4Var4 = null;
                    j4 = jB;
                    j3 = jA;
                } else {
                    ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var117 = ei4Var3;
                    ox6Var4 = ox6Var3;
                    ei4Var5 = ei4Var117;
                    j3 = jA;
                    j4 = jB;
                }
            } else {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 8) != 0) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -57345;
                }
                if (i9 != 0) {
                    ei4Var3 = null;
                }
                if (i4 != 0) {
                    ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var118 = ei4Var3;
                    ox6Var4 = ox6Var3;
                    ei4Var5 = ei4Var118;
                    ei4Var4 = null;
                    j4 = jB;
                    j3 = jA;
                } else {
                    ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var119 = ei4Var3;
                    ox6Var4 = ox6Var3;
                    ei4Var5 = ei4Var119;
                    j3 = jA;
                    j4 = jB;
                }
            }
            bj4VarO.V();
            int i112 = (i3 & 14) | 24576 | (i3 & 112);
            int i113 = i3 >> 3;
            bj4Var = bj4VarO;
            BoxedTextLayoutKt.m556BoxedTextLayoutY0xEhic(ox6Var4, str2, j4, j3, gr1.b(-344274505, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[FileType.values().length];
                        try {
                            iArr[FileType.IMAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[FileType.VIDEO.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i114) {
                    int i115;
                    oy8Var.getClass();
                    if ((i114 & 6) == 0) {
                        i114 |= jt1Var2.J(oy8Var) ? 4 : 2;
                    }
                    if ((i114 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    if (ei4Var5 != null) {
                        jt1Var2.K(1377521019);
                        ei4Var5.invoke(oy8Var, jt1Var2, Integer.valueOf(i114 & 14));
                        jt1Var2.B();
                        return;
                    }
                    jt1Var2.K(1377586987);
                    int i116 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                    if (i116 != 1) {
                        i115 = i116 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                    } else {
                        i115 = R.drawable.intercom_ic_image;
                    }
                    m65.b(is7.a(i115, jt1Var2, 0), "Image Icon", ir9.j(ox6.a.t, 16.0f), 0L, jt1Var2, 440, 8);
                    jt1Var2.B();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                    invoke(oy8Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ei4Var4, bj4Var, i112 | (i113 & 896) | (i113 & 7168) | (i113 & 458752), 0);
            ei4Var6 = ei4Var5;
            ox6Var5 = ox6Var4;
            j5 = j4;
            j6 = j3;
            ei4Var7 = ei4Var4;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 8) != 0) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -57345;
                }
                if (i9 != 0) {
                    ei4Var3 = null;
                }
                if (i4 != 0) {
                    ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var1110 = ei4Var3;
                    ox6Var4 = ox6Var3;
                    ei4Var5 = ei4Var1110;
                    ei4Var4 = null;
                    j4 = jB;
                    j3 = jA;
                } else {
                    ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var1111 = ei4Var3;
                    ox6Var4 = ox6Var3;
                    ei4Var5 = ei4Var1111;
                    j3 = jA;
                    j4 = jB;
                }
            } else {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 8) != 0) {
                    jB = uh1.b(0.1f, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m824getDefault0d7_KjU());
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    i3 &= -57345;
                }
                if (i9 != 0) {
                    ei4Var3 = null;
                }
                if (i4 != 0) {
                    ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var1112 = ei4Var3;
                    ox6Var4 = ox6Var3;
                    ei4Var5 = ei4Var1112;
                    ei4Var4 = null;
                    j4 = jB;
                    j3 = jA;
                } else {
                    ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var1113 = ei4Var3;
                    ox6Var4 = ox6Var3;
                    ei4Var5 = ei4Var1113;
                    j3 = jA;
                    j4 = jB;
                }
            }
            bj4VarO.V();
            int i114 = (i3 & 14) | 24576 | (i3 & 112);
            int i115 = i3 >> 3;
            bj4Var = bj4VarO;
            BoxedTextLayoutKt.m556BoxedTextLayoutY0xEhic(ox6Var4, str2, j4, j3, gr1.b(-344274505, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.FIleAttachmentListKt$FileAttachment$1

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[FileType.values().length];
                        try {
                            iArr[FileType.IMAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[FileType.VIDEO.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i116) {
                    int i117;
                    oy8Var.getClass();
                    if ((i116 & 6) == 0) {
                        i116 |= jt1Var2.J(oy8Var) ? 4 : 2;
                    }
                    if ((i116 & 19) == 18 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    if (ei4Var5 != null) {
                        jt1Var2.K(1377521019);
                        ei4Var5.invoke(oy8Var, jt1Var2, Integer.valueOf(i116 & 14));
                        jt1Var2.B();
                        return;
                    }
                    jt1Var2.K(1377586987);
                    int i118 = WhenMappings.$EnumSwitchMapping$0[fileType.ordinal()];
                    if (i118 != 1) {
                        i117 = i118 != 2 ? R.drawable.intercom_ic_attachment : R.drawable.intercom_ic_video;
                    } else {
                        i117 = R.drawable.intercom_ic_image;
                    }
                    m65.b(is7.a(i117, jt1Var2, 0), "Image Icon", ir9.j(ox6.a.t, 16.0f), 0L, jt1Var2, 440, 8);
                    jt1Var2.B();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                    invoke(oy8Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ei4Var4, bj4Var, i114 | (i115 & 896) | (i115 & 7168) | (i115 & 458752), 0);
            ei4Var6 = ei4Var5;
            ox6Var5 = ox6Var4;
            j5 = j4;
            j6 = j3;
            ei4Var7 = ei4Var4;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ps3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FIleAttachmentListKt.FileAttachment_vRFhKjU$lambda$5(ox6Var5, str, fileType, j5, j6, ei4Var6, ei4Var7, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    public static final void FileAttachmentList(ox6 ox6Var, final List<Ticket.TicketAttribute.FilesAttribute.File> list, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        list.getClass();
        bj4 bj4VarO = jt1Var.o(580044030);
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
            i3 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var3 = i4 != 0 ? aVar : ox6Var2;
            final Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            boolean z = true;
            aj1 aj1VarA = yi1.a(new c30.h(6.0f, true, new a30()), di.a.m, bj4VarO, 6);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var3);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            String str = null;
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-1441890306);
            for (final Ticket.TicketAttribute.FilesAttribute.File file : list) {
                String name = file.getName();
                FileType fileType = file.getFileType();
                bj4VarO.K(-1188185032);
                boolean zJ = bj4VarO.J(file) | bj4VarO.j(context);
                Object objF = bj4VarO.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new mh4() { // from class: qs3
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return FIleAttachmentListKt.FileAttachmentList$lambda$3$lambda$2$lambda$1$lambda$0(file, context);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                m525FileAttachmentvRFhKjU(we1.c(aVar, false, str, (mh4) objF, 15), name, fileType, 0L, 0L, null, null, bj4VarO, 0, 120);
                z = z;
                context = context;
                ox6Var3 = ox6Var3;
                str = str;
                aVar = aVar;
            }
            bj4VarO.U(false);
            bj4VarO.U(z);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: rs3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FIleAttachmentListKt.FileAttachmentList$lambda$4(ox6Var2, list, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileAttachmentList$lambda$3$lambda$2$lambda$1$lambda$0(Ticket.TicketAttribute.FilesAttribute.File file, Context context) {
        LinkOpener.handleUrl(file.getUrl(), context, Injector.get().getApi());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileAttachmentList$lambda$4(ox6 ox6Var, List list, int i, int i2, jt1 jt1Var, int i3) {
        FileAttachmentList(ox6Var, list, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void FileAttachmentListPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-414644973);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FIleAttachmentListKt.INSTANCE.m509getLambda2$intercom_sdk_base_release(), bj4VarO, 12582912, 127);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ss3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FIleAttachmentListKt.FileAttachmentListPreview$lambda$7(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileAttachmentListPreview$lambda$7(int i, jt1 jt1Var, int i2) {
        FileAttachmentListPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileAttachment_vRFhKjU$lambda$5(ox6 ox6Var, String str, FileType fileType, long j, long j2, ei4 ei4Var, ei4 ei4Var2, int i, int i2, jt1 jt1Var, int i3) {
        m525FileAttachmentvRFhKjU(ox6Var, str, fileType, j, j2, ei4Var, ei4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final FileType getFileType(String str) {
        str.getClass();
        if (z2a.o(str, AppearanceType.IMAGE, false)) {
            return FileType.IMAGE;
        }
        return z2a.o(str, "video", false) ? FileType.VIDEO : FileType.ATTACHMENT;
    }
}
