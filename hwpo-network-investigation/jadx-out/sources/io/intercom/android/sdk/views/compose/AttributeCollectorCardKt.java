package io.intercom.android.sdk.views.compose;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.hf3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.iu8;
import defpackage.j70;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m70;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.mm8;
import defpackage.n70;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.t43;
import defpackage.u7d;
import defpackage.wja;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AttributeCollectorCardKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0112  */
    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0178  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101  */
    /* JADX WARN: Code duplicated, block: B:98:0x0104  */
    public static final void AttributeCollectorCard(ox6 ox6Var, final List<Attribute> list, List<String> list2, List<String> list3, final String str, boolean z, oh4<? super AttributeData, g2b> oh4Var, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        List<Attribute> list4;
        int i4;
        List<String> list5;
        int i5;
        int i6;
        List<String> list6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        oh4<? super AttributeData, g2b> oh4Var2;
        int i12;
        List<String> list7;
        int i13;
        boolean z3;
        oh4<? super AttributeData, g2b> oh4Var3;
        bj4 bj4Var;
        final List<String> list8;
        final List<String> list9;
        final boolean z4;
        final oh4<? super AttributeData, g2b> oh4Var4;
        Object objF;
        xj8 xj8VarW;
        list.getClass();
        str.getClass();
        bj4 bj4VarO = jt1Var.o(-136461083);
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                list4 = list;
                i3 |= bj4VarO.j(list4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    list5 = list2;
                    if (bj4VarO.j(list5)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        list6 = list3;
                        if (bj4VarO.j(list6)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 16) != 0) {
                        if ((i & 24576) == 0) {
                            if (bj4VarO.J(str)) {
                                i8 = 16384;
                            } else {
                                i8 = 8192;
                            }
                            i3 |= i8;
                        }
                        i9 = i2 & 32;
                        if (i9 != 0) {
                            if ((196608 & i) == 0) {
                                z2 = z;
                                if (bj4VarO.c(z2)) {
                                    i10 = 131072;
                                } else {
                                    i10 = 65536;
                                }
                                i3 |= i10;
                            }
                            i11 = i2 & 64;
                            if (i11 != 0) {
                                if ((1572864 & i) == 0) {
                                    oh4Var2 = oh4Var;
                                    if (bj4VarO.j(oh4Var2)) {
                                        i12 = 1048576;
                                    } else {
                                        i12 = 524288;
                                    }
                                    i3 |= i12;
                                }
                                if ((599187 & i3) == 599186 || !bj4VarO.r()) {
                                    if (i14 != 0) {
                                        ox6Var2 = ox6.a.t;
                                    }
                                    list7 = hf3.t;
                                    if (i4 != 0) {
                                        list5 = list7;
                                    }
                                    if (i6 == 0) {
                                        list7 = list6;
                                    }
                                    i13 = 0;
                                    if (i9 != 0) {
                                        z3 = false;
                                    } else {
                                        z3 = z2;
                                    }
                                    if (i11 != 0) {
                                        bj4VarO.K(-1145807053);
                                        objF = bj4VarO.f();
                                        if (objF == jt1.a.a) {
                                            objF = new n70(i13);
                                            bj4VarO.C(objF);
                                        }
                                        bj4VarO.U(false);
                                        oh4Var3 = (oh4) objF;
                                    } else {
                                        oh4Var3 = oh4Var2;
                                    }
                                    List<String> list10 = list7;
                                    oh4<? super AttributeData, g2b> oh4Var5 = oh4Var3;
                                    List<String> list11 = list5;
                                    boolean z5 = z3;
                                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list10, str, z5, oh4Var5), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                    bj4Var = bj4VarO;
                                    list8 = list11;
                                    list9 = list10;
                                    z4 = z5;
                                    oh4Var4 = oh4Var5;
                                } else {
                                    bj4VarO.u();
                                    bj4Var = bj4VarO;
                                    list8 = list5;
                                    list9 = list6;
                                    z4 = z2;
                                    oh4Var4 = oh4Var2;
                                }
                                xj8VarW = bj4Var.W();
                                if (xj8VarW != null) {
                                    xj8VarW.d = new ci4() { // from class: o70
                                        @Override // defpackage.ci4
                                        public final Object invoke(Object obj, Object obj2) {
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                        }
                                    };
                                }
                            }
                            i3 |= 1572864;
                            oh4Var2 = oh4Var;
                            if ((599187 & i3) == 599186) {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list12 = list7;
                                oh4<? super AttributeData, g2b> oh4Var6 = oh4Var3;
                                List<String> list13 = list5;
                                boolean z6 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list13, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list12, str, z6, oh4Var6), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list13;
                                list9 = list12;
                                z4 = z6;
                                oh4Var4 = oh4Var6;
                            } else {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list14 = list7;
                                oh4<? super AttributeData, g2b> oh4Var7 = oh4Var3;
                                List<String> list15 = list5;
                                boolean z7 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list15, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list14, str, z7, oh4Var7), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list15;
                                list9 = list14;
                                z4 = z7;
                                oh4Var4 = oh4Var7;
                            }
                            xj8VarW = bj4Var.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new ci4() { // from class: o70
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i3 |= 196608;
                        z2 = z;
                        i11 = i2 & 64;
                        if (i11 != 0) {
                            if ((1572864 & i) == 0) {
                                oh4Var2 = oh4Var;
                                if (bj4VarO.j(oh4Var2)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                                i3 |= i12;
                            }
                            if ((599187 & i3) == 599186) {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list16 = list7;
                                oh4<? super AttributeData, g2b> oh4Var8 = oh4Var3;
                                List<String> list17 = list5;
                                boolean z8 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list17, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list16, str, z8, oh4Var8), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list17;
                                list9 = list16;
                                z4 = z8;
                                oh4Var4 = oh4Var8;
                            } else {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list18 = list7;
                                oh4<? super AttributeData, g2b> oh4Var9 = oh4Var3;
                                List<String> list19 = list5;
                                boolean z9 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list19, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list18, str, z9, oh4Var9), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list19;
                                list9 = list18;
                                z4 = z9;
                                oh4Var4 = oh4Var9;
                            }
                            xj8VarW = bj4Var.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new ci4() { // from class: o70
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i3 |= 1572864;
                        oh4Var2 = oh4Var;
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list110 = list7;
                            oh4<? super AttributeData, g2b> oh4Var10 = oh4Var3;
                            List<String> list111 = list5;
                            boolean z10 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list110, str, z10, oh4Var10), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111;
                            list9 = list110;
                            z4 = z10;
                            oh4Var4 = oh4Var10;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list112 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11 = oh4Var3;
                            List<String> list113 = list5;
                            boolean z11 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list112, str, z11, oh4Var11), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list113;
                            list9 = list112;
                            z4 = z11;
                            oh4Var4 = oh4Var11;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 24576;
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (bj4VarO.c(z2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        i11 = i2 & 64;
                        if (i11 != 0) {
                            if ((1572864 & i) == 0) {
                                oh4Var2 = oh4Var;
                                if (bj4VarO.j(oh4Var2)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                                i3 |= i12;
                            }
                            if ((599187 & i3) == 599186) {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list114 = list7;
                                oh4<? super AttributeData, g2b> oh4Var12 = oh4Var3;
                                List<String> list115 = list5;
                                boolean z12 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list114, str, z12, oh4Var12), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list115;
                                list9 = list114;
                                z4 = z12;
                                oh4Var4 = oh4Var12;
                            } else {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list116 = list7;
                                oh4<? super AttributeData, g2b> oh4Var13 = oh4Var3;
                                List<String> list117 = list5;
                                boolean z13 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list116, str, z13, oh4Var13), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list117;
                                list9 = list116;
                                z4 = z13;
                                oh4Var4 = oh4Var13;
                            }
                            xj8VarW = bj4Var.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new ci4() { // from class: o70
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i3 |= 1572864;
                        oh4Var2 = oh4Var;
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list118 = list7;
                            oh4<? super AttributeData, g2b> oh4Var14 = oh4Var3;
                            List<String> list119 = list5;
                            boolean z14 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list118, str, z14, oh4Var14), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list119;
                            list9 = list118;
                            z4 = z14;
                            oh4Var4 = oh4Var14;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list1110 = list7;
                            oh4<? super AttributeData, g2b> oh4Var15 = oh4Var3;
                            List<String> list1111 = list5;
                            boolean z15 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1110, str, z15, oh4Var15), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list1111;
                            list9 = list1110;
                            z4 = z15;
                            oh4Var4 = oh4Var15;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    z2 = z;
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            oh4Var2 = oh4Var;
                            if (bj4VarO.j(oh4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list1112 = list7;
                            oh4<? super AttributeData, g2b> oh4Var16 = oh4Var3;
                            List<String> list1113 = list5;
                            boolean z16 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1112, str, z16, oh4Var16), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list1113;
                            list9 = list1112;
                            z4 = z16;
                            oh4Var4 = oh4Var16;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list1114 = list7;
                            oh4<? super AttributeData, g2b> oh4Var17 = oh4Var3;
                            List<String> list1115 = list5;
                            boolean z17 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1114, str, z17, oh4Var17), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list1115;
                            list9 = list1114;
                            z4 = z17;
                            oh4Var4 = oh4Var17;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var2 = oh4Var;
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1116 = list7;
                        oh4<? super AttributeData, g2b> oh4Var18 = oh4Var3;
                        List<String> list1117 = list5;
                        boolean z18 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1116, str, z18, oh4Var18), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1117;
                        list9 = list1116;
                        z4 = z18;
                        oh4Var4 = oh4Var18;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1118 = list7;
                        oh4<? super AttributeData, g2b> oh4Var19 = oh4Var3;
                        List<String> list1119 = list5;
                        boolean z19 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1118, str, z19, oh4Var19), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1119;
                        list9 = list1118;
                        z4 = z19;
                        oh4Var4 = oh4Var19;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                list6 = list3;
                if ((i2 & 16) != 0) {
                    if ((i & 24576) == 0) {
                        if (bj4VarO.J(str)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (bj4VarO.c(z2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        i11 = i2 & 64;
                        if (i11 != 0) {
                            if ((1572864 & i) == 0) {
                                oh4Var2 = oh4Var;
                                if (bj4VarO.j(oh4Var2)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                                i3 |= i12;
                            }
                            if ((599187 & i3) == 599186) {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list11110 = list7;
                                oh4<? super AttributeData, g2b> oh4Var110 = oh4Var3;
                                List<String> list11111 = list5;
                                boolean z110 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11110, str, z110, oh4Var110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list11111;
                                list9 = list11110;
                                z4 = z110;
                                oh4Var4 = oh4Var110;
                            } else {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list11112 = list7;
                                oh4<? super AttributeData, g2b> oh4Var111 = oh4Var3;
                                List<String> list11113 = list5;
                                boolean z111 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11112, str, z111, oh4Var111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list11113;
                                list9 = list11112;
                                z4 = z111;
                                oh4Var4 = oh4Var111;
                            }
                            xj8VarW = bj4Var.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new ci4() { // from class: o70
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i3 |= 1572864;
                        oh4Var2 = oh4Var;
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list11114 = list7;
                            oh4<? super AttributeData, g2b> oh4Var112 = oh4Var3;
                            List<String> list11115 = list5;
                            boolean z112 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11114, str, z112, oh4Var112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list11115;
                            list9 = list11114;
                            z4 = z112;
                            oh4Var4 = oh4Var112;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list11116 = list7;
                            oh4<? super AttributeData, g2b> oh4Var113 = oh4Var3;
                            List<String> list11117 = list5;
                            boolean z113 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11116, str, z113, oh4Var113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list11117;
                            list9 = list11116;
                            z4 = z113;
                            oh4Var4 = oh4Var113;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    z2 = z;
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            oh4Var2 = oh4Var;
                            if (bj4VarO.j(oh4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list11118 = list7;
                            oh4<? super AttributeData, g2b> oh4Var114 = oh4Var3;
                            List<String> list11119 = list5;
                            boolean z114 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11118, str, z114, oh4Var114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list11119;
                            list9 = list11118;
                            z4 = z114;
                            oh4Var4 = oh4Var114;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111110 = list7;
                            oh4<? super AttributeData, g2b> oh4Var115 = oh4Var3;
                            List<String> list111111 = list5;
                            boolean z115 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111110, str, z115, oh4Var115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111;
                            list9 = list111110;
                            z4 = z115;
                            oh4Var4 = oh4Var115;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var2 = oh4Var;
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111112 = list7;
                        oh4<? super AttributeData, g2b> oh4Var116 = oh4Var3;
                        List<String> list111113 = list5;
                        boolean z116 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111112, str, z116, oh4Var116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111113;
                        list9 = list111112;
                        z4 = z116;
                        oh4Var4 = oh4Var116;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111114 = list7;
                        oh4<? super AttributeData, g2b> oh4Var117 = oh4Var3;
                        List<String> list111115 = list5;
                        boolean z117 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111114, str, z117, oh4Var117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111115;
                        list9 = list111114;
                        z4 = z117;
                        oh4Var4 = oh4Var117;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            oh4Var2 = oh4Var;
                            if (bj4VarO.j(oh4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111116 = list7;
                            oh4<? super AttributeData, g2b> oh4Var118 = oh4Var3;
                            List<String> list111117 = list5;
                            boolean z118 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111116, str, z118, oh4Var118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111117;
                            list9 = list111116;
                            z4 = z118;
                            oh4Var4 = oh4Var118;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111118 = list7;
                            oh4<? super AttributeData, g2b> oh4Var119 = oh4Var3;
                            List<String> list111119 = list5;
                            boolean z119 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111118, str, z119, oh4Var119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111119;
                            list9 = list111118;
                            z4 = z119;
                            oh4Var4 = oh4Var119;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var2 = oh4Var;
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111110 = list7;
                        oh4<? super AttributeData, g2b> oh4Var1110 = oh4Var3;
                        List<String> list1111111 = list5;
                        boolean z1110 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111110, str, z1110, oh4Var1110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111;
                        list9 = list1111110;
                        z4 = z1110;
                        oh4Var4 = oh4Var1110;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111112 = list7;
                        oh4<? super AttributeData, g2b> oh4Var1111 = oh4Var3;
                        List<String> list1111113 = list5;
                        boolean z1111 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111112, str, z1111, oh4Var1111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111113;
                        list9 = list1111112;
                        z4 = z1111;
                        oh4Var4 = oh4Var1111;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                z2 = z;
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111114 = list7;
                        oh4<? super AttributeData, g2b> oh4Var1112 = oh4Var3;
                        List<String> list1111115 = list5;
                        boolean z1112 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111114, str, z1112, oh4Var1112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111115;
                        list9 = list1111114;
                        z4 = z1112;
                        oh4Var4 = oh4Var1112;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111116 = list7;
                        oh4<? super AttributeData, g2b> oh4Var1113 = oh4Var3;
                        List<String> list1111117 = list5;
                        boolean z1113 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111116, str, z1113, oh4Var1113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111117;
                        list9 = list1111116;
                        z4 = z1113;
                        oh4Var4 = oh4Var1113;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var2 = oh4Var;
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111118 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1114 = oh4Var3;
                    List<String> list1111119 = list5;
                    boolean z1114 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111118, str, z1114, oh4Var1114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111119;
                    list9 = list1111118;
                    z4 = z1114;
                    oh4Var4 = oh4Var1114;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111110 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1115 = oh4Var3;
                    List<String> list11111111 = list5;
                    boolean z1115 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111110, str, z1115, oh4Var1115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111;
                    list9 = list11111110;
                    z4 = z1115;
                    oh4Var4 = oh4Var1115;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            list5 = list2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    list6 = list3;
                    if (bj4VarO.j(list6)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    if ((i & 24576) == 0) {
                        if (bj4VarO.J(str)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (bj4VarO.c(z2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        i11 = i2 & 64;
                        if (i11 != 0) {
                            if ((1572864 & i) == 0) {
                                oh4Var2 = oh4Var;
                                if (bj4VarO.j(oh4Var2)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                                i3 |= i12;
                            }
                            if ((599187 & i3) == 599186) {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list11111112 = list7;
                                oh4<? super AttributeData, g2b> oh4Var1116 = oh4Var3;
                                List<String> list11111113 = list5;
                                boolean z1116 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111112, str, z1116, oh4Var1116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list11111113;
                                list9 = list11111112;
                                z4 = z1116;
                                oh4Var4 = oh4Var1116;
                            } else {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list11111114 = list7;
                                oh4<? super AttributeData, g2b> oh4Var1117 = oh4Var3;
                                List<String> list11111115 = list5;
                                boolean z1117 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111114, str, z1117, oh4Var1117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list11111115;
                                list9 = list11111114;
                                z4 = z1117;
                                oh4Var4 = oh4Var1117;
                            }
                            xj8VarW = bj4Var.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new ci4() { // from class: o70
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i3 |= 1572864;
                        oh4Var2 = oh4Var;
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list11111116 = list7;
                            oh4<? super AttributeData, g2b> oh4Var1118 = oh4Var3;
                            List<String> list11111117 = list5;
                            boolean z1118 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111116, str, z1118, oh4Var1118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list11111117;
                            list9 = list11111116;
                            z4 = z1118;
                            oh4Var4 = oh4Var1118;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list11111118 = list7;
                            oh4<? super AttributeData, g2b> oh4Var1119 = oh4Var3;
                            List<String> list11111119 = list5;
                            boolean z1119 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111118, str, z1119, oh4Var1119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list11111119;
                            list9 = list11111118;
                            z4 = z1119;
                            oh4Var4 = oh4Var1119;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    z2 = z;
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            oh4Var2 = oh4Var;
                            if (bj4VarO.j(oh4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111111110 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11110 = oh4Var3;
                            List<String> list111111111 = list5;
                            boolean z11110 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111110, str, z11110, oh4Var11110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111111;
                            list9 = list111111110;
                            z4 = z11110;
                            oh4Var4 = oh4Var11110;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111111112 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11111 = oh4Var3;
                            List<String> list111111113 = list5;
                            boolean z11111 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111112, str, z11111, oh4Var11111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111113;
                            list9 = list111111112;
                            z4 = z11111;
                            oh4Var4 = oh4Var11111;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var2 = oh4Var;
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111114 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11112 = oh4Var3;
                        List<String> list111111115 = list5;
                        boolean z11112 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111114, str, z11112, oh4Var11112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111115;
                        list9 = list111111114;
                        z4 = z11112;
                        oh4Var4 = oh4Var11112;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111116 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11113 = oh4Var3;
                        List<String> list111111117 = list5;
                        boolean z11113 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111116, str, z11113, oh4Var11113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111117;
                        list9 = list111111116;
                        z4 = z11113;
                        oh4Var4 = oh4Var11113;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            oh4Var2 = oh4Var;
                            if (bj4VarO.j(oh4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111111118 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11114 = oh4Var3;
                            List<String> list111111119 = list5;
                            boolean z11114 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111118, str, z11114, oh4Var11114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111119;
                            list9 = list111111118;
                            z4 = z11114;
                            oh4Var4 = oh4Var11114;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list1111111110 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11115 = oh4Var3;
                            List<String> list1111111111 = list5;
                            boolean z11115 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111110, str, z11115, oh4Var11115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list1111111111;
                            list9 = list1111111110;
                            z4 = z11115;
                            oh4Var4 = oh4Var11115;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var2 = oh4Var;
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111112 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11116 = oh4Var3;
                        List<String> list1111111113 = list5;
                        boolean z11116 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111112, str, z11116, oh4Var11116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111113;
                        list9 = list1111111112;
                        z4 = z11116;
                        oh4Var4 = oh4Var11116;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111114 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11117 = oh4Var3;
                        List<String> list1111111115 = list5;
                        boolean z11117 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111114, str, z11117, oh4Var11117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111115;
                        list9 = list1111111114;
                        z4 = z11117;
                        oh4Var4 = oh4Var11117;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                z2 = z;
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111116 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11118 = oh4Var3;
                        List<String> list1111111117 = list5;
                        boolean z11118 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111116, str, z11118, oh4Var11118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111117;
                        list9 = list1111111116;
                        z4 = z11118;
                        oh4Var4 = oh4Var11118;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111118 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11119 = oh4Var3;
                        List<String> list1111111119 = list5;
                        boolean z11119 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111118, str, z11119, oh4Var11119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111119;
                        list9 = list1111111118;
                        z4 = z11119;
                        oh4Var4 = oh4Var11119;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var2 = oh4Var;
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111110 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111110 = oh4Var3;
                    List<String> list11111111111 = list5;
                    boolean z111110 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111110, str, z111110, oh4Var111110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111;
                    list9 = list11111111110;
                    z4 = z111110;
                    oh4Var4 = oh4Var111110;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111112 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111111 = oh4Var3;
                    List<String> list11111111113 = list5;
                    boolean z111111 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111112, str, z111111, oh4Var111111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111113;
                    list9 = list11111111112;
                    z4 = z111111;
                    oh4Var4 = oh4Var111111;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            list6 = list3;
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    if (bj4VarO.J(str)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            oh4Var2 = oh4Var;
                            if (bj4VarO.j(oh4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list11111111114 = list7;
                            oh4<? super AttributeData, g2b> oh4Var111112 = oh4Var3;
                            List<String> list11111111115 = list5;
                            boolean z111112 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111114, str, z111112, oh4Var111112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list11111111115;
                            list9 = list11111111114;
                            z4 = z111112;
                            oh4Var4 = oh4Var111112;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list11111111116 = list7;
                            oh4<? super AttributeData, g2b> oh4Var111113 = oh4Var3;
                            List<String> list11111111117 = list5;
                            boolean z111113 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111116, str, z111113, oh4Var111113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list11111111117;
                            list9 = list11111111116;
                            z4 = z111113;
                            oh4Var4 = oh4Var111113;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var2 = oh4Var;
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list11111111118 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111114 = oh4Var3;
                        List<String> list11111111119 = list5;
                        boolean z111114 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111118, str, z111114, oh4Var111114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list11111111119;
                        list9 = list11111111118;
                        z4 = z111114;
                        oh4Var4 = oh4Var111114;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111110 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111115 = oh4Var3;
                        List<String> list111111111111 = list5;
                        boolean z111115 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111110, str, z111115, oh4Var111115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111;
                        list9 = list111111111110;
                        z4 = z111115;
                        oh4Var4 = oh4Var111115;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                z2 = z;
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111112 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111116 = oh4Var3;
                        List<String> list111111111113 = list5;
                        boolean z111116 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111112, str, z111116, oh4Var111116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111113;
                        list9 = list111111111112;
                        z4 = z111116;
                        oh4Var4 = oh4Var111116;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111114 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111117 = oh4Var3;
                        List<String> list111111111115 = list5;
                        boolean z111117 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111114, str, z111117, oh4Var111117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111115;
                        list9 = list111111111114;
                        z4 = z111117;
                        oh4Var4 = oh4Var111117;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var2 = oh4Var;
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list111111111116 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111118 = oh4Var3;
                    List<String> list111111111117 = list5;
                    boolean z111118 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111116, str, z111118, oh4Var111118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list111111111117;
                    list9 = list111111111116;
                    z4 = z111118;
                    oh4Var4 = oh4Var111118;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list111111111118 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111119 = oh4Var3;
                    List<String> list111111111119 = list5;
                    boolean z111119 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111118, str, z111119, oh4Var111119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list111111111119;
                    list9 = list111111111118;
                    z4 = z111119;
                    oh4Var4 = oh4Var111119;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111111110 = list7;
                        oh4<? super AttributeData, g2b> oh4Var1111110 = oh4Var3;
                        List<String> list1111111111111 = list5;
                        boolean z1111110 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111110, str, z1111110, oh4Var1111110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111111111;
                        list9 = list1111111111110;
                        z4 = z1111110;
                        oh4Var4 = oh4Var1111110;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111111112 = list7;
                        oh4<? super AttributeData, g2b> oh4Var1111111 = oh4Var3;
                        List<String> list1111111111113 = list5;
                        boolean z1111111 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111112, str, z1111111, oh4Var1111111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111111113;
                        list9 = list1111111111112;
                        z4 = z1111111;
                        oh4Var4 = oh4Var1111111;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var2 = oh4Var;
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111114 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111112 = oh4Var3;
                    List<String> list1111111111115 = list5;
                    boolean z1111112 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111114, str, z1111112, oh4Var1111112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111115;
                    list9 = list1111111111114;
                    z4 = z1111112;
                    oh4Var4 = oh4Var1111112;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111116 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111113 = oh4Var3;
                    List<String> list1111111111117 = list5;
                    boolean z1111113 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111116, str, z1111113, oh4Var1111113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111117;
                    list9 = list1111111111116;
                    z4 = z1111113;
                    oh4Var4 = oh4Var1111113;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            z2 = z;
            i11 = i2 & 64;
            if (i11 != 0) {
                if ((1572864 & i) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111118 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111114 = oh4Var3;
                    List<String> list1111111111119 = list5;
                    boolean z1111114 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111118, str, z1111114, oh4Var1111114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111119;
                    list9 = list1111111111118;
                    z4 = z1111114;
                    oh4Var4 = oh4Var1111114;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111110 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111115 = oh4Var3;
                    List<String> list11111111111111 = list5;
                    boolean z1111115 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111110, str, z1111115, oh4Var1111115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111;
                    list9 = list11111111111110;
                    z4 = z1111115;
                    oh4Var4 = oh4Var1111115;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            oh4Var2 = oh4Var;
            if ((599187 & i3) == 599186) {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list11111111111112 = list7;
                oh4<? super AttributeData, g2b> oh4Var1111116 = oh4Var3;
                List<String> list11111111111113 = list5;
                boolean z1111116 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111112, str, z1111116, oh4Var1111116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list11111111111113;
                list9 = list11111111111112;
                z4 = z1111116;
                oh4Var4 = oh4Var1111116;
            } else {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list11111111111114 = list7;
                oh4<? super AttributeData, g2b> oh4Var1111117 = oh4Var3;
                List<String> list11111111111115 = list5;
                boolean z1111117 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111114, str, z1111117, oh4Var1111117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list11111111111115;
                list9 = list11111111111114;
                z4 = z1111117;
                oh4Var4 = oh4Var1111117;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: o70
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        list4 = list;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                list5 = list2;
                if (bj4VarO.j(list5)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    list6 = list3;
                    if (bj4VarO.j(list6)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i2 & 16) != 0) {
                    if ((i & 24576) == 0) {
                        if (bj4VarO.J(str)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (bj4VarO.c(z2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        i11 = i2 & 64;
                        if (i11 != 0) {
                            if ((1572864 & i) == 0) {
                                oh4Var2 = oh4Var;
                                if (bj4VarO.j(oh4Var2)) {
                                    i12 = 1048576;
                                } else {
                                    i12 = 524288;
                                }
                                i3 |= i12;
                            }
                            if ((599187 & i3) == 599186) {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list11111111111116 = list7;
                                oh4<? super AttributeData, g2b> oh4Var1111118 = oh4Var3;
                                List<String> list11111111111117 = list5;
                                boolean z1111118 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111116, str, z1111118, oh4Var1111118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list11111111111117;
                                list9 = list11111111111116;
                                z4 = z1111118;
                                oh4Var4 = oh4Var1111118;
                            } else {
                                if (i14 != 0) {
                                    ox6Var2 = ox6.a.t;
                                }
                                list7 = hf3.t;
                                if (i4 != 0) {
                                    list5 = list7;
                                }
                                if (i6 == 0) {
                                    list7 = list6;
                                }
                                i13 = 0;
                                if (i9 != 0) {
                                    z3 = false;
                                } else {
                                    z3 = z2;
                                }
                                if (i11 != 0) {
                                    bj4VarO.K(-1145807053);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        objF = new n70(i13);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var3 = (oh4) objF;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                List<String> list11111111111118 = list7;
                                oh4<? super AttributeData, g2b> oh4Var1111119 = oh4Var3;
                                List<String> list11111111111119 = list5;
                                boolean z1111119 = z3;
                                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111118, str, z1111119, oh4Var1111119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                                bj4Var = bj4VarO;
                                list8 = list11111111111119;
                                list9 = list11111111111118;
                                z4 = z1111119;
                                oh4Var4 = oh4Var1111119;
                            }
                            xj8VarW = bj4Var.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new ci4() { // from class: o70
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i3 |= 1572864;
                        oh4Var2 = oh4Var;
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111111111111110 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11111110 = oh4Var3;
                            List<String> list111111111111111 = list5;
                            boolean z11111110 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111110, str, z11111110, oh4Var11111110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111111111111;
                            list9 = list111111111111110;
                            z4 = z11111110;
                            oh4Var4 = oh4Var11111110;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111111111111112 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11111111 = oh4Var3;
                            List<String> list111111111111113 = list5;
                            boolean z11111111 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111112, str, z11111111, oh4Var11111111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111111111113;
                            list9 = list111111111111112;
                            z4 = z11111111;
                            oh4Var4 = oh4Var11111111;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    z2 = z;
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            oh4Var2 = oh4Var;
                            if (bj4VarO.j(oh4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111111111111114 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11111112 = oh4Var3;
                            List<String> list111111111111115 = list5;
                            boolean z11111112 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111114, str, z11111112, oh4Var11111112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111111111115;
                            list9 = list111111111111114;
                            z4 = z11111112;
                            oh4Var4 = oh4Var11111112;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111111111111116 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11111113 = oh4Var3;
                            List<String> list111111111111117 = list5;
                            boolean z11111113 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111116, str, z11111113, oh4Var11111113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111111111117;
                            list9 = list111111111111116;
                            z4 = z11111113;
                            oh4Var4 = oh4Var11111113;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var2 = oh4Var;
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111111118 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11111114 = oh4Var3;
                        List<String> list111111111111119 = list5;
                        boolean z11111114 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111118, str, z11111114, oh4Var11111114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111119;
                        list9 = list111111111111118;
                        z4 = z11111114;
                        oh4Var4 = oh4Var11111114;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111111111110 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11111115 = oh4Var3;
                        List<String> list1111111111111111 = list5;
                        boolean z11111115 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111110, str, z11111115, oh4Var11111115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111111111111;
                        list9 = list1111111111111110;
                        z4 = z11111115;
                        oh4Var4 = oh4Var11111115;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            oh4Var2 = oh4Var;
                            if (bj4VarO.j(oh4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list1111111111111112 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11111116 = oh4Var3;
                            List<String> list1111111111111113 = list5;
                            boolean z11111116 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111112, str, z11111116, oh4Var11111116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list1111111111111113;
                            list9 = list1111111111111112;
                            z4 = z11111116;
                            oh4Var4 = oh4Var11111116;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list1111111111111114 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11111117 = oh4Var3;
                            List<String> list1111111111111115 = list5;
                            boolean z11111117 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111114, str, z11111117, oh4Var11111117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list1111111111111115;
                            list9 = list1111111111111114;
                            z4 = z11111117;
                            oh4Var4 = oh4Var11111117;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var2 = oh4Var;
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111111111116 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11111118 = oh4Var3;
                        List<String> list1111111111111117 = list5;
                        boolean z11111118 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111116, str, z11111118, oh4Var11111118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111111111117;
                        list9 = list1111111111111116;
                        z4 = z11111118;
                        oh4Var4 = oh4Var11111118;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111111111118 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11111119 = oh4Var3;
                        List<String> list1111111111111119 = list5;
                        boolean z11111119 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111118, str, z11111119, oh4Var11111119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111111111119;
                        list9 = list1111111111111118;
                        z4 = z11111119;
                        oh4Var4 = oh4Var11111119;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                z2 = z;
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list11111111111111110 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111111110 = oh4Var3;
                        List<String> list11111111111111111 = list5;
                        boolean z111111110 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111110, str, z111111110, oh4Var111111110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list11111111111111111;
                        list9 = list11111111111111110;
                        z4 = z111111110;
                        oh4Var4 = oh4Var111111110;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list11111111111111112 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111111111 = oh4Var3;
                        List<String> list11111111111111113 = list5;
                        boolean z111111111 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111112, str, z111111111, oh4Var111111111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list11111111111111113;
                        list9 = list11111111111111112;
                        z4 = z111111111;
                        oh4Var4 = oh4Var111111111;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var2 = oh4Var;
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111111114 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111111112 = oh4Var3;
                    List<String> list11111111111111115 = list5;
                    boolean z111111112 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111114, str, z111111112, oh4Var111111112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111115;
                    list9 = list11111111111111114;
                    z4 = z111111112;
                    oh4Var4 = oh4Var111111112;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111111116 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111111113 = oh4Var3;
                    List<String> list11111111111111117 = list5;
                    boolean z111111113 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111116, str, z111111113, oh4Var111111113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111117;
                    list9 = list11111111111111116;
                    z4 = z111111113;
                    oh4Var4 = oh4Var111111113;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            list6 = list3;
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    if (bj4VarO.J(str)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            oh4Var2 = oh4Var;
                            if (bj4VarO.j(oh4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list11111111111111118 = list7;
                            oh4<? super AttributeData, g2b> oh4Var111111114 = oh4Var3;
                            List<String> list11111111111111119 = list5;
                            boolean z111111114 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111118, str, z111111114, oh4Var111111114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list11111111111111119;
                            list9 = list11111111111111118;
                            z4 = z111111114;
                            oh4Var4 = oh4Var111111114;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111111111111111110 = list7;
                            oh4<? super AttributeData, g2b> oh4Var111111115 = oh4Var3;
                            List<String> list111111111111111111 = list5;
                            boolean z111111115 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111110, str, z111111115, oh4Var111111115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111111111111111;
                            list9 = list111111111111111110;
                            z4 = z111111115;
                            oh4Var4 = oh4Var111111115;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var2 = oh4Var;
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111111111112 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111111116 = oh4Var3;
                        List<String> list111111111111111113 = list5;
                        boolean z111111116 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111112, str, z111111116, oh4Var111111116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111111113;
                        list9 = list111111111111111112;
                        z4 = z111111116;
                        oh4Var4 = oh4Var111111116;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111111111114 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111111117 = oh4Var3;
                        List<String> list111111111111111115 = list5;
                        boolean z111111117 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111114, str, z111111117, oh4Var111111117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111111115;
                        list9 = list111111111111111114;
                        z4 = z111111117;
                        oh4Var4 = oh4Var111111117;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                z2 = z;
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111111111116 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111111118 = oh4Var3;
                        List<String> list111111111111111117 = list5;
                        boolean z111111118 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111116, str, z111111118, oh4Var111111118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111111117;
                        list9 = list111111111111111116;
                        z4 = z111111118;
                        oh4Var4 = oh4Var111111118;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111111111118 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111111119 = oh4Var3;
                        List<String> list111111111111111119 = list5;
                        boolean z111111119 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111118, str, z111111119, oh4Var111111119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111111119;
                        list9 = list111111111111111118;
                        z4 = z111111119;
                        oh4Var4 = oh4Var111111119;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var2 = oh4Var;
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111111111110 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111111110 = oh4Var3;
                    List<String> list1111111111111111111 = list5;
                    boolean z1111111110 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111110, str, z1111111110, oh4Var1111111110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111111111111;
                    list9 = list1111111111111111110;
                    z4 = z1111111110;
                    oh4Var4 = oh4Var1111111110;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111111111112 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111111111 = oh4Var3;
                    List<String> list1111111111111111113 = list5;
                    boolean z1111111111 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111112, str, z1111111111, oh4Var1111111111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111111111113;
                    list9 = list1111111111111111112;
                    z4 = z1111111111;
                    oh4Var4 = oh4Var1111111111;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111111111111114 = list7;
                        oh4<? super AttributeData, g2b> oh4Var1111111112 = oh4Var3;
                        List<String> list1111111111111111115 = list5;
                        boolean z1111111112 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111114, str, z1111111112, oh4Var1111111112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111111111111115;
                        list9 = list1111111111111111114;
                        z4 = z1111111112;
                        oh4Var4 = oh4Var1111111112;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111111111111116 = list7;
                        oh4<? super AttributeData, g2b> oh4Var1111111113 = oh4Var3;
                        List<String> list1111111111111111117 = list5;
                        boolean z1111111113 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111116, str, z1111111113, oh4Var1111111113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111111111111117;
                        list9 = list1111111111111111116;
                        z4 = z1111111113;
                        oh4Var4 = oh4Var1111111113;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var2 = oh4Var;
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111111111118 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111111114 = oh4Var3;
                    List<String> list1111111111111111119 = list5;
                    boolean z1111111114 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111118, str, z1111111114, oh4Var1111111114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111111111119;
                    list9 = list1111111111111111118;
                    z4 = z1111111114;
                    oh4Var4 = oh4Var1111111114;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111111111110 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111111115 = oh4Var3;
                    List<String> list11111111111111111111 = list5;
                    boolean z1111111115 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111110, str, z1111111115, oh4Var1111111115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111111111;
                    list9 = list11111111111111111110;
                    z4 = z1111111115;
                    oh4Var4 = oh4Var1111111115;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            z2 = z;
            i11 = i2 & 64;
            if (i11 != 0) {
                if ((1572864 & i) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111111111112 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111111116 = oh4Var3;
                    List<String> list11111111111111111113 = list5;
                    boolean z1111111116 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111112, str, z1111111116, oh4Var1111111116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111111113;
                    list9 = list11111111111111111112;
                    z4 = z1111111116;
                    oh4Var4 = oh4Var1111111116;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111111111114 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111111117 = oh4Var3;
                    List<String> list11111111111111111115 = list5;
                    boolean z1111111117 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111114, str, z1111111117, oh4Var1111111117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111111115;
                    list9 = list11111111111111111114;
                    z4 = z1111111117;
                    oh4Var4 = oh4Var1111111117;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            oh4Var2 = oh4Var;
            if ((599187 & i3) == 599186) {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list11111111111111111116 = list7;
                oh4<? super AttributeData, g2b> oh4Var1111111118 = oh4Var3;
                List<String> list11111111111111111117 = list5;
                boolean z1111111118 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111116, str, z1111111118, oh4Var1111111118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list11111111111111111117;
                list9 = list11111111111111111116;
                z4 = z1111111118;
                oh4Var4 = oh4Var1111111118;
            } else {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list11111111111111111118 = list7;
                oh4<? super AttributeData, g2b> oh4Var1111111119 = oh4Var3;
                List<String> list11111111111111111119 = list5;
                boolean z1111111119 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111118, str, z1111111119, oh4Var1111111119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list11111111111111111119;
                list9 = list11111111111111111118;
                z4 = z1111111119;
                oh4Var4 = oh4Var1111111119;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: o70
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        list5 = list2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                list6 = list3;
                if (bj4VarO.j(list6)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i2 & 16) != 0) {
                if ((i & 24576) == 0) {
                    if (bj4VarO.J(str)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            oh4Var2 = oh4Var;
                            if (bj4VarO.j(oh4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                        if ((599187 & i3) == 599186) {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111111111111111111110 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11111111110 = oh4Var3;
                            List<String> list111111111111111111111 = list5;
                            boolean z11111111110 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111110, str, z11111111110, oh4Var11111111110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111111111111111111;
                            list9 = list111111111111111111110;
                            z4 = z11111111110;
                            oh4Var4 = oh4Var11111111110;
                        } else {
                            if (i14 != 0) {
                                ox6Var2 = ox6.a.t;
                            }
                            list7 = hf3.t;
                            if (i4 != 0) {
                                list5 = list7;
                            }
                            if (i6 == 0) {
                                list7 = list6;
                            }
                            i13 = 0;
                            if (i9 != 0) {
                                z3 = false;
                            } else {
                                z3 = z2;
                            }
                            if (i11 != 0) {
                                bj4VarO.K(-1145807053);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    objF = new n70(i13);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var3 = (oh4) objF;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            List<String> list111111111111111111112 = list7;
                            oh4<? super AttributeData, g2b> oh4Var11111111111 = oh4Var3;
                            List<String> list111111111111111111113 = list5;
                            boolean z11111111111 = z3;
                            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111112, str, z11111111111, oh4Var11111111111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                            bj4Var = bj4VarO;
                            list8 = list111111111111111111113;
                            list9 = list111111111111111111112;
                            z4 = z11111111111;
                            oh4Var4 = oh4Var11111111111;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: o70
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    oh4Var2 = oh4Var;
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111111111111114 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11111111112 = oh4Var3;
                        List<String> list111111111111111111115 = list5;
                        boolean z11111111112 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111114, str, z11111111112, oh4Var11111111112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111111111115;
                        list9 = list111111111111111111114;
                        z4 = z11111111112;
                        oh4Var4 = oh4Var11111111112;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111111111111116 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11111111113 = oh4Var3;
                        List<String> list111111111111111111117 = list5;
                        boolean z11111111113 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111116, str, z11111111113, oh4Var11111111113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111111111117;
                        list9 = list111111111111111111116;
                        z4 = z11111111113;
                        oh4Var4 = oh4Var11111111113;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                z2 = z;
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111111111111118 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11111111114 = oh4Var3;
                        List<String> list111111111111111111119 = list5;
                        boolean z11111111114 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111118, str, z11111111114, oh4Var11111111114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111111111119;
                        list9 = list111111111111111111118;
                        z4 = z11111111114;
                        oh4Var4 = oh4Var11111111114;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111111111111111110 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11111111115 = oh4Var3;
                        List<String> list1111111111111111111111 = list5;
                        boolean z11111111115 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111111110, str, z11111111115, oh4Var11111111115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111111111111111111;
                        list9 = list1111111111111111111110;
                        z4 = z11111111115;
                        oh4Var4 = oh4Var11111111115;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var2 = oh4Var;
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111111111111112 = list7;
                    oh4<? super AttributeData, g2b> oh4Var11111111116 = oh4Var3;
                    List<String> list1111111111111111111113 = list5;
                    boolean z11111111116 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111111112, str, z11111111116, oh4Var11111111116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111111111111113;
                    list9 = list1111111111111111111112;
                    z4 = z11111111116;
                    oh4Var4 = oh4Var11111111116;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111111111111114 = list7;
                    oh4<? super AttributeData, g2b> oh4Var11111111117 = oh4Var3;
                    List<String> list1111111111111111111115 = list5;
                    boolean z11111111117 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111111114, str, z11111111117, oh4Var11111111117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111111111111115;
                    list9 = list1111111111111111111114;
                    z4 = z11111111117;
                    oh4Var4 = oh4Var11111111117;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111111111111111116 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11111111118 = oh4Var3;
                        List<String> list1111111111111111111117 = list5;
                        boolean z11111111118 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111111116, str, z11111111118, oh4Var11111111118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111111111111111117;
                        list9 = list1111111111111111111116;
                        z4 = z11111111118;
                        oh4Var4 = oh4Var11111111118;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list1111111111111111111118 = list7;
                        oh4<? super AttributeData, g2b> oh4Var11111111119 = oh4Var3;
                        List<String> list1111111111111111111119 = list5;
                        boolean z11111111119 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111111118, str, z11111111119, oh4Var11111111119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list1111111111111111111119;
                        list9 = list1111111111111111111118;
                        z4 = z11111111119;
                        oh4Var4 = oh4Var11111111119;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var2 = oh4Var;
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111111111111110 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111111111110 = oh4Var3;
                    List<String> list11111111111111111111111 = list5;
                    boolean z111111111110 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111111110, str, z111111111110, oh4Var111111111110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111111111111;
                    list9 = list11111111111111111111110;
                    z4 = z111111111110;
                    oh4Var4 = oh4Var111111111110;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111111111111112 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111111111111 = oh4Var3;
                    List<String> list11111111111111111111113 = list5;
                    boolean z111111111111 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111111112, str, z111111111111, oh4Var111111111111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111111111113;
                    list9 = list11111111111111111111112;
                    z4 = z111111111111;
                    oh4Var4 = oh4Var111111111111;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            z2 = z;
            i11 = i2 & 64;
            if (i11 != 0) {
                if ((1572864 & i) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111111111111114 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111111111112 = oh4Var3;
                    List<String> list11111111111111111111115 = list5;
                    boolean z111111111112 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111111114, str, z111111111112, oh4Var111111111112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111111111115;
                    list9 = list11111111111111111111114;
                    z4 = z111111111112;
                    oh4Var4 = oh4Var111111111112;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111111111111116 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111111111113 = oh4Var3;
                    List<String> list11111111111111111111117 = list5;
                    boolean z111111111113 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111111116, str, z111111111113, oh4Var111111111113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111111111117;
                    list9 = list11111111111111111111116;
                    z4 = z111111111113;
                    oh4Var4 = oh4Var111111111113;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            oh4Var2 = oh4Var;
            if ((599187 & i3) == 599186) {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list11111111111111111111118 = list7;
                oh4<? super AttributeData, g2b> oh4Var111111111114 = oh4Var3;
                List<String> list11111111111111111111119 = list5;
                boolean z111111111114 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111111118, str, z111111111114, oh4Var111111111114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list11111111111111111111119;
                list9 = list11111111111111111111118;
                z4 = z111111111114;
                oh4Var4 = oh4Var111111111114;
            } else {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list111111111111111111111110 = list7;
                oh4<? super AttributeData, g2b> oh4Var111111111115 = oh4Var3;
                List<String> list111111111111111111111111 = list5;
                boolean z111111111115 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111111110, str, z111111111115, oh4Var111111111115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list111111111111111111111111;
                list9 = list111111111111111111111110;
                z4 = z111111111115;
                oh4Var4 = oh4Var111111111115;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: o70
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        list6 = list3;
        if ((i2 & 16) != 0) {
            if ((i & 24576) == 0) {
                if (bj4VarO.J(str)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((599187 & i3) == 599186) {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111111111111111112 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111111111116 = oh4Var3;
                        List<String> list111111111111111111111113 = list5;
                        boolean z111111111116 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111111112, str, z111111111116, oh4Var111111111116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111111111111113;
                        list9 = list111111111111111111111112;
                        z4 = z111111111116;
                        oh4Var4 = oh4Var111111111116;
                    } else {
                        if (i14 != 0) {
                            ox6Var2 = ox6.a.t;
                        }
                        list7 = hf3.t;
                        if (i4 != 0) {
                            list5 = list7;
                        }
                        if (i6 == 0) {
                            list7 = list6;
                        }
                        i13 = 0;
                        if (i9 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (i11 != 0) {
                            bj4VarO.K(-1145807053);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new n70(i13);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var3 = (oh4) objF;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        List<String> list111111111111111111111114 = list7;
                        oh4<? super AttributeData, g2b> oh4Var111111111117 = oh4Var3;
                        List<String> list111111111111111111111115 = list5;
                        boolean z111111111117 = z3;
                        IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111111114, str, z111111111117, oh4Var111111111117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                        bj4Var = bj4VarO;
                        list8 = list111111111111111111111115;
                        list9 = list111111111111111111111114;
                        z4 = z111111111117;
                        oh4Var4 = oh4Var111111111117;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: o70
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                oh4Var2 = oh4Var;
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list111111111111111111111116 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111111111118 = oh4Var3;
                    List<String> list111111111111111111111117 = list5;
                    boolean z111111111118 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111111116, str, z111111111118, oh4Var111111111118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list111111111111111111111117;
                    list9 = list111111111111111111111116;
                    z4 = z111111111118;
                    oh4Var4 = oh4Var111111111118;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list111111111111111111111118 = list7;
                    oh4<? super AttributeData, g2b> oh4Var111111111119 = oh4Var3;
                    List<String> list111111111111111111111119 = list5;
                    boolean z111111111119 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111111118, str, z111111111119, oh4Var111111111119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list111111111111111111111119;
                    list9 = list111111111111111111111118;
                    z4 = z111111111119;
                    oh4Var4 = oh4Var111111111119;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            z2 = z;
            i11 = i2 & 64;
            if (i11 != 0) {
                if ((1572864 & i) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111111111111111110 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111111111110 = oh4Var3;
                    List<String> list1111111111111111111111111 = list5;
                    boolean z1111111111110 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111111111110, str, z1111111111110, oh4Var1111111111110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111111111111111111;
                    list9 = list1111111111111111111111110;
                    z4 = z1111111111110;
                    oh4Var4 = oh4Var1111111111110;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111111111111111112 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111111111111 = oh4Var3;
                    List<String> list1111111111111111111111113 = list5;
                    boolean z1111111111111 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111111111112, str, z1111111111111, oh4Var1111111111111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111111111111111113;
                    list9 = list1111111111111111111111112;
                    z4 = z1111111111111;
                    oh4Var4 = oh4Var1111111111111;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            oh4Var2 = oh4Var;
            if ((599187 & i3) == 599186) {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list1111111111111111111111114 = list7;
                oh4<? super AttributeData, g2b> oh4Var1111111111112 = oh4Var3;
                List<String> list1111111111111111111111115 = list5;
                boolean z1111111111112 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111111111114, str, z1111111111112, oh4Var1111111111112), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list1111111111111111111111115;
                list9 = list1111111111111111111111114;
                z4 = z1111111111112;
                oh4Var4 = oh4Var1111111111112;
            } else {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list1111111111111111111111116 = list7;
                oh4<? super AttributeData, g2b> oh4Var1111111111113 = oh4Var3;
                List<String> list1111111111111111111111117 = list5;
                boolean z1111111111113 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111111111116, str, z1111111111113, oh4Var1111111111113), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list1111111111111111111111117;
                list9 = list1111111111111111111111116;
                z4 = z1111111111113;
                oh4Var4 = oh4Var1111111111113;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: o70
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        i9 = i2 & 32;
        if (i9 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (bj4VarO.c(z2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                if ((1572864 & i) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((599187 & i3) == 599186) {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list1111111111111111111111118 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111111111114 = oh4Var3;
                    List<String> list1111111111111111111111119 = list5;
                    boolean z1111111111114 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list1111111111111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list1111111111111111111111118, str, z1111111111114, oh4Var1111111111114), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list1111111111111111111111119;
                    list9 = list1111111111111111111111118;
                    z4 = z1111111111114;
                    oh4Var4 = oh4Var1111111111114;
                } else {
                    if (i14 != 0) {
                        ox6Var2 = ox6.a.t;
                    }
                    list7 = hf3.t;
                    if (i4 != 0) {
                        list5 = list7;
                    }
                    if (i6 == 0) {
                        list7 = list6;
                    }
                    i13 = 0;
                    if (i9 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (i11 != 0) {
                        bj4VarO.K(-1145807053);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new n70(i13);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    List<String> list11111111111111111111111110 = list7;
                    oh4<? super AttributeData, g2b> oh4Var1111111111115 = oh4Var3;
                    List<String> list11111111111111111111111111 = list5;
                    boolean z1111111111115 = z3;
                    IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111111111110, str, z1111111111115, oh4Var1111111111115), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                    bj4Var = bj4VarO;
                    list8 = list11111111111111111111111111;
                    list9 = list11111111111111111111111110;
                    z4 = z1111111111115;
                    oh4Var4 = oh4Var1111111111115;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: o70
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            oh4Var2 = oh4Var;
            if ((599187 & i3) == 599186) {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list11111111111111111111111112 = list7;
                oh4<? super AttributeData, g2b> oh4Var1111111111116 = oh4Var3;
                List<String> list11111111111111111111111113 = list5;
                boolean z1111111111116 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111111111112, str, z1111111111116, oh4Var1111111111116), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list11111111111111111111111113;
                list9 = list11111111111111111111111112;
                z4 = z1111111111116;
                oh4Var4 = oh4Var1111111111116;
            } else {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list11111111111111111111111114 = list7;
                oh4<? super AttributeData, g2b> oh4Var1111111111117 = oh4Var3;
                List<String> list11111111111111111111111115 = list5;
                boolean z1111111111117 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111111115, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111111111114, str, z1111111111117, oh4Var1111111111117), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list11111111111111111111111115;
                list9 = list11111111111111111111111114;
                z4 = z1111111111117;
                oh4Var4 = oh4Var1111111111117;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: o70
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        z2 = z;
        i11 = i2 & 64;
        if (i11 != 0) {
            if ((1572864 & i) == 0) {
                oh4Var2 = oh4Var;
                if (bj4VarO.j(oh4Var2)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((599187 & i3) == 599186) {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list11111111111111111111111116 = list7;
                oh4<? super AttributeData, g2b> oh4Var1111111111118 = oh4Var3;
                List<String> list11111111111111111111111117 = list5;
                boolean z1111111111118 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111111117, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111111111116, str, z1111111111118, oh4Var1111111111118), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list11111111111111111111111117;
                list9 = list11111111111111111111111116;
                z4 = z1111111111118;
                oh4Var4 = oh4Var1111111111118;
            } else {
                if (i14 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                list7 = hf3.t;
                if (i4 != 0) {
                    list5 = list7;
                }
                if (i6 == 0) {
                    list7 = list6;
                }
                i13 = 0;
                if (i9 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (i11 != 0) {
                    bj4VarO.K(-1145807053);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new n70(i13);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                List<String> list11111111111111111111111118 = list7;
                oh4<? super AttributeData, g2b> oh4Var1111111111119 = oh4Var3;
                List<String> list11111111111111111111111119 = list5;
                boolean z1111111111119 = z3;
                IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list11111111111111111111111119, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list11111111111111111111111118, str, z1111111111119, oh4Var1111111111119), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
                bj4Var = bj4VarO;
                list8 = list11111111111111111111111119;
                list9 = list11111111111111111111111118;
                z4 = z1111111111119;
                oh4Var4 = oh4Var1111111111119;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: o70
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 1572864;
        oh4Var2 = oh4Var;
        if ((599187 & i3) == 599186) {
            if (i14 != 0) {
                ox6Var2 = ox6.a.t;
            }
            list7 = hf3.t;
            if (i4 != 0) {
                list5 = list7;
            }
            if (i6 == 0) {
                list7 = list6;
            }
            i13 = 0;
            if (i9 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (i11 != 0) {
                bj4VarO.K(-1145807053);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new n70(i13);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                oh4Var3 = (oh4) objF;
            } else {
                oh4Var3 = oh4Var2;
            }
            List<String> list111111111111111111111111110 = list7;
            oh4<? super AttributeData, g2b> oh4Var11111111111110 = oh4Var3;
            List<String> list111111111111111111111111111 = list5;
            boolean z11111111111110 = z3;
            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111111111111, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111111111110, str, z11111111111110, oh4Var11111111111110), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
            bj4Var = bj4VarO;
            list8 = list111111111111111111111111111;
            list9 = list111111111111111111111111110;
            z4 = z11111111111110;
            oh4Var4 = oh4Var11111111111110;
        } else {
            if (i14 != 0) {
                ox6Var2 = ox6.a.t;
            }
            list7 = hf3.t;
            if (i4 != 0) {
                list5 = list7;
            }
            if (i6 == 0) {
                list7 = list6;
            }
            i13 = 0;
            if (i9 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (i11 != 0) {
                bj4VarO.K(-1145807053);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new n70(i13);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                oh4Var3 = (oh4) objF;
            } else {
                oh4Var3 = oh4Var2;
            }
            List<String> list111111111111111111111111112 = list7;
            oh4<? super AttributeData, g2b> oh4Var11111111111111 = oh4Var3;
            List<String> list111111111111111111111111113 = list5;
            boolean z11111111111111 = z3;
            IntercomCardKt.IntercomCard(ox6Var2, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31), gr1.b(-1007698855, new AnonymousClass2(list4, list111111111111111111111111113, ((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)).getResources(), list111111111111111111111111112, str, z11111111111111, oh4Var11111111111111), bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 3) | (i3 & 14) | 384, 0);
            bj4Var = bj4VarO;
            list8 = list111111111111111111111111113;
            list9 = list111111111111111111111111112;
            z4 = z11111111111111;
            oh4Var4 = oh4Var11111111111111;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: o70
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AttributeCollectorCardKt.AttributeCollectorCard$lambda$2(ox6Var2, list, list8, list9, str, z4, oh4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AttributeCollectorCard$lambda$1$lambda$0(AttributeData attributeData) {
        attributeData.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AttributeCollectorCard$lambda$2(ox6 ox6Var, List list, List list2, List list3, String str, boolean z, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        AttributeCollectorCard(ox6Var, list, list2, list3, str, z, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void BooleanAttributeCard(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-96019153);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m844getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new j70(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BooleanAttributeCard$lambda$3(int i, jt1 jt1Var, int i2) {
        BooleanAttributeCard(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ListAttributeCard(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-100505407);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m846getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new m70(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ListAttributeCard$lambda$4(int i, jt1 jt1Var, int i2) {
        ListAttributeCard(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void MultipleAttributeCard(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(327354419);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m850getLambda8$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: l70
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AttributeCollectorCardKt.MultipleAttributeCard$lambda$6(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MultipleAttributeCard$lambda$6(int i, jt1 jt1Var, int i2) {
        MultipleAttributeCard(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TextAttributeCard(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1807263952);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AttributeCollectorCardKt.INSTANCE.m848getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: k70
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AttributeCollectorCardKt.TextAttributeCard$lambda$5(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextAttributeCard$lambda$5(int i, jt1 jt1Var, int i2) {
        TextAttributeCard(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$AttributeCollectorCard$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass2 implements ei4<bj1, jt1, Integer, g2b> {
        final /* synthetic */ List<Attribute> $attributes;
        final /* synthetic */ List<String> $failedAttributeIdentifiers;
        final /* synthetic */ boolean $isFormDisabled;
        final /* synthetic */ List<String> $loadingAttributeIdentifiers;
        final /* synthetic */ oh4<AttributeData, g2b> $onSubmitAttribute;
        final /* synthetic */ String $partId;
        final /* synthetic */ Resources $resources;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<Attribute> list, List<String> list2, Resources resources, List<String> list3, String str, boolean z, oh4<? super AttributeData, g2b> oh4Var) {
            this.$attributes = list;
            this.$failedAttributeIdentifiers = list2;
            this.$resources = resources;
            this.$loadingAttributeIdentifiers = list3;
            this.$partId = str;
            this.$isFormDisabled = z;
            this.$onSubmitAttribute = oh4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h37 invoke$lambda$11$lambda$10$lambda$3$lambda$2() {
            return bl7.i(BuildConfig.FLAVOR);
        }

        private static final String invoke$lambda$11$lambda$10$lambda$4(h37<String> h37Var) {
            return h37Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37 h37Var, String str) {
            str.getClass();
            h37Var.setValue(str);
            return g2b.a;
        }

        /* JADX WARN: Code duplicated, block: B:107:0x03c9 A[PHI: r4
          0x03c9: PHI (r4v23 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>) = 
          (r4v5 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
          (r4v6 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
          (r4v7 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
          (r4v8 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
          (r4v10 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
          (r4v11 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
          (r4v12 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
          (r4v15 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
          (r4v24 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
         binds: [B:106:0x03c7, B:97:0x039c, B:94:0x038f, B:145:?, B:141:?, B:144:?, B:143:?, B:142:?, B:70:0x032a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:108:0x03d5 A[PHI: r4
          0x03d5: PHI (r4v13 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>) = 
          (r4v5 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
          (r4v7 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
          (r4v14 oh4<io.intercom.android.sdk.m5.conversation.states.AttributeData, g2b>)
         binds: [B:106:0x03c7, B:94:0x038f, B:74:0x0337] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:110:0x03ed  */
        /* JADX WARN: Code duplicated, block: B:112:0x03f1  */
        /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0327. Please report as an issue. */
        public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
            jt1 jt1Var2;
            IntercomTheme intercomTheme;
            boolean z;
            oh4<AttributeData, g2b> oh4Var;
            final h37 h37Var;
            boolean zJ;
            Object objF;
            jt1 jt1Var3;
            String str;
            jt1 jt1Var4 = jt1Var;
            bj1Var.getClass();
            if ((i & 17) == 16 && jt1Var4.r()) {
                jt1Var4.u();
                return;
            }
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarI = eo7.i(aVar, 24.0f);
            List<Attribute> list = this.$attributes;
            List<String> list2 = this.$failedAttributeIdentifiers;
            Resources resources = this.$resources;
            List<String> list3 = this.$loadingAttributeIdentifiers;
            String str2 = this.$partId;
            boolean z2 = this.$isFormDisabled;
            oh4<AttributeData, g2b> oh4Var2 = this.$onSubmitAttribute;
            c30.k kVar = c30.c;
            sp0.a aVar2 = di.a.m;
            aj1 aj1VarA = yi1.a(kVar, aVar2, jt1Var4, 0);
            int iHashCode = Long.hashCode(jt1Var4.v());
            kw7 kw7VarY = jt1Var4.y();
            ox6 ox6VarC = it1.c(jt1Var4, ox6VarI);
            bt1.c.getClass();
            qr5.a aVar3 = bt1.a.b;
            if (jt1Var4.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var4.q();
            if (jt1Var4.l()) {
                jt1Var4.k(aVar3);
            } else {
                jt1Var4.z();
            }
            rd7.d(jt1Var4, bt1.a.f, aj1VarA);
            rd7.d(jt1Var4, bt1.a.e, kw7VarY);
            rd7.d(jt1Var4, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var4, bt1.a.h);
            rd7.d(jt1Var4, bt1.a.d, ox6VarC);
            Iterator<Attribute> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (!it.next().hasValue()) {
                    break;
                } else {
                    i2++;
                }
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (i2 == -1) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : list.size() - 1;
            jt1Var4.K(1866899712);
            int i3 = iIntValue + 1;
            int i4 = 0;
            while (i4 < i3) {
                Attribute attribute = list.get(i4);
                aj1 aj1VarA2 = yi1.a(kVar, aVar2, jt1Var4, 0);
                int iHashCode2 = Long.hashCode(jt1Var4.v());
                oh4<AttributeData, g2b> oh4Var3 = oh4Var2;
                kw7 kw7VarY2 = jt1Var4.y();
                int i5 = i3;
                ox6 ox6VarC2 = it1.c(jt1Var4, aVar);
                bt1.c.getClass();
                List<Attribute> list4 = list;
                qr5.a aVar4 = bt1.a.b;
                if (jt1Var4.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var4.q();
                if (jt1Var4.l()) {
                    jt1Var4.k(aVar4);
                } else {
                    jt1Var4.z();
                }
                String str3 = str2;
                bt1.a.c cVar = bt1.a.f;
                rd7.d(jt1Var4, cVar, aj1VarA2);
                bt1.a.e eVar = bt1.a.e;
                rd7.d(jt1Var4, eVar, kw7VarY2);
                Integer numValueOf2 = Integer.valueOf(iHashCode2);
                bt1.a.b bVar = bt1.a.g;
                rd7.d(jt1Var4, bVar, numValueOf2);
                bt1.a.C0034a c0034a = bt1.a.h;
                rd7.c(jt1Var4, c0034a);
                boolean z3 = z2;
                bt1.a.d dVar = bt1.a.d;
                rd7.d(jt1Var4, dVar, ox6VarC2);
                c30.k kVar2 = kVar;
                Object[] objArr = new Object[0];
                jt1Var4.K(671988484);
                Object objF2 = jt1Var4.f();
                sp0.a aVar5 = aVar2;
                jt1.a.C0187a c0187a = jt1.a.a;
                if (objF2 == c0187a) {
                    objF2 = new a();
                    jt1Var4.C(objF2);
                }
                jt1Var4.B();
                h37 h37Var2 = (h37) mm8.d(objArr, (mh4) objF2, jt1Var4, 48);
                String string = list2.contains(attribute.getIdentifier()) ? resources.getString(R.string.intercom_something_went_wrong_try_again) : BuildConfig.FLAVOR;
                string.getClass();
                boolean zContains = list3.contains(attribute.getIdentifier());
                jt1Var4.K(672001750);
                if (i4 > 0) {
                    b47.b(jt1Var4, ir9.d(aVar, 24.0f));
                }
                jt1Var4.B();
                ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                ox6.a aVar6 = aVar;
                ny8 ny8VarA = ly8.a(c30.a, di.a.j, jt1Var4, 0);
                int iHashCode3 = Long.hashCode(jt1Var4.v());
                kw7 kw7VarY3 = jt1Var4.y();
                ox6 ox6VarC4 = it1.c(jt1Var4, ox6VarC3);
                if (jt1Var4.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var4.q();
                if (jt1Var4.l()) {
                    jt1Var4.k(aVar4);
                } else {
                    jt1Var4.z();
                }
                rd7.d(jt1Var4, cVar, ny8VarA);
                rd7.d(jt1Var4, eVar, kw7VarY3);
                g3.c(iHashCode3, jt1Var4, bVar, jt1Var4, c0034a);
                rd7.d(jt1Var4, dVar, ox6VarC4);
                qs5 qs5Var = new qs5(true, 1.0f);
                String name = list4.size() > 1 ? (i4 + 1) + ". " + attribute.getName() : attribute.getName();
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i6 = IntercomTheme.$stable;
                List<String> list5 = list2;
                Resources resources2 = resources;
                List<String> list6 = list3;
                int i7 = i4;
                oh4<AttributeData, g2b> oh4Var4 = oh4Var3;
                mia.b(name, qs5Var, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme2.getTypography(jt1Var4, i6).getType04(), jt1Var, 0, 24960, 110588);
                jt1Var.K(-86962638);
                if (i7 != 0) {
                    jt1Var2 = jt1Var;
                    intercomTheme = intercomTheme2;
                    z = true;
                } else if (list4.size() > 1) {
                    ox6 ox6VarM = eo7.m(aVar6, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    StringBuilder sbB = t43.b(i5, "(", " / ");
                    sbB.append(list4.size());
                    sbB.append(')');
                    String string2 = sbB.toString();
                    wja type04 = intercomTheme2.getTypography(jt1Var, i6).getType04();
                    int i8 = R.color.intercom_attribute_input_hint;
                    Context context = (Context) jt1Var.F(AndroidCompositionLocals_androidKt.b);
                    Resources resources3 = (Resources) jt1Var.F(AndroidCompositionLocals_androidKt.c);
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal<TypedValue> threadLocal = iu8.a;
                    z = true;
                    intercomTheme = intercomTheme2;
                    mia.b(string2, ox6VarM, u7d.c(resources3.getColor(i8, theme)), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var, 48, 0, 131064);
                    jt1Var2 = jt1Var;
                } else {
                    jt1Var2 = jt1Var;
                    z = true;
                    intercomTheme = intercomTheme2;
                }
                jt1Var2.B();
                jt1Var2.I();
                AttributeData attributeData = new AttributeData(attribute, str3, z3);
                ox6 ox6VarM2 = eo7.m(ir9.c(aVar6, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                String renderType = attribute.getRenderType();
                switch (renderType.hashCode()) {
                    case -1034364087:
                        oh4Var = oh4Var4;
                        if (!renderType.equals(AttributeType.NUMBER)) {
                            jt1Var2.K(-639614028);
                            jt1Var2.B();
                            g2b g2bVar = g2b.a;
                            oh4Var4 = oh4Var;
                            jt1Var3 = jt1Var2;
                            h37Var = h37Var2;
                        } else {
                            jt1Var2.K(672066800);
                            jt1Var2.K(672076166);
                            h37Var = h37Var2;
                            zJ = jt1Var2.J(h37Var);
                            objF = jt1Var2.f();
                            if (zJ || objF == c0187a) {
                                objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                    }
                                };
                                jt1Var2.C(objF);
                            }
                            jt1Var2.B();
                            TextAttributeCollectorKt.TextAttributeCollector(ox6VarM2, attributeData, zContains, (oh4) objF, oh4Var, jt1Var2, 6, 0);
                            oh4Var4 = oh4Var;
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                            g2b g2bVar2 = g2b.a;
                        }
                        break;
                    case 3322014:
                        oh4Var = oh4Var4;
                        if (renderType.equals(AttributeType.LIST)) {
                            jt1Var2.K(672092489);
                            ListAttributeCollectorKt.ListAttributeCollector(ox6VarM2, attributeData, string.length() > 0 ? z : false, zContains, oh4Var, jt1Var2, 6, 0);
                            jt1Var2.B();
                            g2b g2bVar3 = g2b.a;
                        } else {
                            jt1Var2.K(-639614028);
                            jt1Var2.B();
                            g2b g2bVar4 = g2b.a;
                        }
                        oh4Var4 = oh4Var;
                        jt1Var3 = jt1Var2;
                        h37Var = h37Var2;
                        break;
                    case 3556653:
                        oh4Var = oh4Var4;
                        if (!renderType.equals(AttributeType.TEXT)) {
                            jt1Var2.K(-639614028);
                            jt1Var2.B();
                            g2b g2bVar5 = g2b.a;
                            oh4Var4 = oh4Var;
                            jt1Var3 = jt1Var2;
                            h37Var = h37Var2;
                        } else {
                            jt1Var2.K(672066800);
                            jt1Var2.K(672076166);
                            h37Var = h37Var2;
                            zJ = jt1Var2.J(h37Var);
                            objF = jt1Var2.f();
                            if (zJ) {
                                objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                    }
                                };
                                jt1Var2.C(objF);
                            } else {
                                objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                    }
                                };
                                jt1Var2.C(objF);
                            }
                            jt1Var2.B();
                            TextAttributeCollectorKt.TextAttributeCollector(ox6VarM2, attributeData, zContains, (oh4) objF, oh4Var, jt1Var2, 6, 0);
                            oh4Var4 = oh4Var;
                            jt1Var3 = jt1Var2;
                            jt1Var3.B();
                            g2b g2bVar6 = g2b.a;
                        }
                        break;
                    case 64711720:
                        if (renderType.equals(AttributeType.BOOLEAN)) {
                            jt1Var2.K(672079756);
                            BooleanAttributeCollectorKt.BooleanAttributeCollector(ox6VarM2, attributeData, string.length() > 0 ? z : false, zContains, oh4Var4, jt1Var2, 6, 0);
                            jt1Var2.B();
                            g2b g2bVar7 = g2b.a;
                        } else {
                            oh4Var = oh4Var4;
                            jt1Var2.K(-639614028);
                            jt1Var2.B();
                            g2b g2bVar8 = g2b.a;
                            oh4Var4 = oh4Var;
                        }
                        jt1Var3 = jt1Var2;
                        h37Var = h37Var2;
                        break;
                    case 75849770:
                        if (!renderType.equals(AttributeType.WEBSITE)) {
                            oh4Var = oh4Var4;
                            jt1Var2.K(-639614028);
                            jt1Var2.B();
                            g2b g2bVar9 = g2b.a;
                            oh4Var4 = oh4Var;
                            jt1Var3 = jt1Var2;
                            h37Var = h37Var2;
                        }
                        oh4Var = oh4Var4;
                        jt1Var2.K(672066800);
                        jt1Var2.K(672076166);
                        h37Var = h37Var2;
                        zJ = jt1Var2.J(h37Var);
                        objF = jt1Var2.f();
                        if (zJ) {
                            objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                }
                            };
                            jt1Var2.C(objF);
                        } else {
                            objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                }
                            };
                            jt1Var2.C(objF);
                        }
                        jt1Var2.B();
                        TextAttributeCollectorKt.TextAttributeCollector(ox6VarM2, attributeData, zContains, (oh4) objF, oh4Var, jt1Var2, 6, 0);
                        oh4Var4 = oh4Var;
                        jt1Var3 = jt1Var2;
                        jt1Var3.B();
                        g2b g2bVar10 = g2b.a;
                        break;
                    case 96619420:
                        if (!renderType.equals("email")) {
                            oh4Var = oh4Var4;
                            jt1Var2.K(-639614028);
                            jt1Var2.B();
                            g2b g2bVar11 = g2b.a;
                            oh4Var4 = oh4Var;
                            jt1Var3 = jt1Var2;
                            h37Var = h37Var2;
                        }
                        oh4Var = oh4Var4;
                        jt1Var2.K(672066800);
                        jt1Var2.K(672076166);
                        h37Var = h37Var2;
                        zJ = jt1Var2.J(h37Var);
                        objF = jt1Var2.f();
                        if (zJ) {
                            objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                }
                            };
                            jt1Var2.C(objF);
                        } else {
                            objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                }
                            };
                            jt1Var2.C(objF);
                        }
                        jt1Var2.B();
                        TextAttributeCollectorKt.TextAttributeCollector(ox6VarM2, attributeData, zContains, (oh4) objF, oh4Var, jt1Var2, 6, 0);
                        oh4Var4 = oh4Var;
                        jt1Var3 = jt1Var2;
                        jt1Var3.B();
                        g2b g2bVar12 = g2b.a;
                        break;
                    case 97526364:
                        if (!renderType.equals(AttributeType.FLOAT)) {
                            oh4Var = oh4Var4;
                            jt1Var2.K(-639614028);
                            jt1Var2.B();
                            g2b g2bVar13 = g2b.a;
                            oh4Var4 = oh4Var;
                            jt1Var3 = jt1Var2;
                            h37Var = h37Var2;
                        }
                        oh4Var = oh4Var4;
                        jt1Var2.K(672066800);
                        jt1Var2.K(672076166);
                        h37Var = h37Var2;
                        zJ = jt1Var2.J(h37Var);
                        objF = jt1Var2.f();
                        if (zJ) {
                            objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                }
                            };
                            jt1Var2.C(objF);
                        } else {
                            objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                }
                            };
                            jt1Var2.C(objF);
                        }
                        jt1Var2.B();
                        TextAttributeCollectorKt.TextAttributeCollector(ox6VarM2, attributeData, zContains, (oh4) objF, oh4Var, jt1Var2, 6, 0);
                        oh4Var4 = oh4Var;
                        jt1Var3 = jt1Var2;
                        jt1Var3.B();
                        g2b g2bVar14 = g2b.a;
                        break;
                    case 106642798:
                        if (!renderType.equals(AttributeType.PHONE)) {
                            oh4Var = oh4Var4;
                            jt1Var2.K(-639614028);
                            jt1Var2.B();
                            g2b g2bVar15 = g2b.a;
                            oh4Var4 = oh4Var;
                            jt1Var3 = jt1Var2;
                            h37Var = h37Var2;
                        }
                        oh4Var = oh4Var4;
                        jt1Var2.K(672066800);
                        jt1Var2.K(672076166);
                        h37Var = h37Var2;
                        zJ = jt1Var2.J(h37Var);
                        objF = jt1Var2.f();
                        if (zJ) {
                            objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                }
                            };
                            jt1Var2.C(objF);
                        } else {
                            objF = new oh4() { // from class: io.intercom.android.sdk.views.compose.b
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return AttributeCollectorCardKt.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7(h37Var, (String) obj);
                                }
                            };
                            jt1Var2.C(objF);
                        }
                        jt1Var2.B();
                        TextAttributeCollectorKt.TextAttributeCollector(ox6VarM2, attributeData, zContains, (oh4) objF, oh4Var, jt1Var2, 6, 0);
                        oh4Var4 = oh4Var;
                        jt1Var3 = jt1Var2;
                        jt1Var3.B();
                        g2b g2bVar16 = g2b.a;
                        break;
                    default:
                        oh4Var = oh4Var4;
                        jt1Var2.K(-639614028);
                        jt1Var2.B();
                        g2b g2bVar17 = g2b.a;
                        oh4Var4 = oh4Var;
                        jt1Var3 = jt1Var2;
                        h37Var = h37Var2;
                        break;
                }
                jt1Var3.K(672105265);
                if (invoke$lambda$11$lambda$10$lambda$4(h37Var).length() <= 0 && string.length() <= 0) {
                    str = str3;
                } else {
                    ox6 ox6VarM3 = eo7.m(ir9.c(aVar6, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    String strInvoke$lambda$11$lambda$10$lambda$4 = invoke$lambda$11$lambda$10$lambda$4(h37Var);
                    if (strInvoke$lambda$11$lambda$10$lambda$4.length() != 0) {
                        string = strInvoke$lambda$11$lambda$10$lambda$4;
                    }
                    wja type05 = intercomTheme.getTypography(jt1Var3, i6).getType04();
                    int i9 = R.color.intercom_attribute_collector_error;
                    Context context2 = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                    Resources resources4 = (Resources) jt1Var3.F(AndroidCompositionLocals_androidKt.c);
                    Resources.Theme theme2 = context2.getTheme();
                    ThreadLocal<TypedValue> threadLocal2 = iu8.a;
                    str = str3;
                    mia.b(string, ox6VarM3, u7d.c(resources4.getColor(i9, theme2)), 0L, null, 0L, null, 0L, 2, false, 3, 0, null, type05, jt1Var3, 48, 24960, 110584);
                }
                jt1Var.B();
                jt1Var.I();
                i4 = i7 + 1;
                jt1Var4 = jt1Var;
                list = list4;
                aVar2 = aVar5;
                aVar = aVar6;
                list2 = list5;
                resources = resources2;
                list3 = list6;
                kVar = kVar2;
                oh4Var2 = oh4Var4;
                str2 = str;
                z2 = z3;
                i3 = i5;
            }
            jt1Var.B();
            jt1Var.I();
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var, Integer num) {
            invoke(bj1Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
