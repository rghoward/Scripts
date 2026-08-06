package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.ac4;
import defpackage.aj1;
import defpackage.b52;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.c52;
import defpackage.d52;
import defpackage.di;
import defpackage.e52;
import defpackage.f52;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.tq9;
import defpackage.u;
import defpackage.uh1;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.yz9;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.tickets.TicketProgressBannerKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationTopAppBarKt {

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

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:104:0x015b  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:109:0x0164  */
    /* JADX WARN: Code duplicated, block: B:111:0x0168  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0175  */
    /* JADX WARN: Code duplicated, block: B:118:0x0182  */
    /* JADX WARN: Code duplicated, block: B:120:0x0188  */
    /* JADX WARN: Code duplicated, block: B:121:0x0195  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:139:0x0208  */
    /* JADX WARN: Code duplicated, block: B:142:0x0241  */
    /* JADX WARN: Code duplicated, block: B:144:0x0248  */
    /* JADX WARN: Code duplicated, block: B:145:0x024c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0282  */
    /* JADX WARN: Code duplicated, block: B:149:0x0285  */
    /* JADX WARN: Code duplicated, block: B:152:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:154:0x0301  */
    /* JADX WARN: Code duplicated, block: B:158:0x032f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0339  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0136  */
    public static final void ConversationTopAppBar(TopAppBarUiState topAppBarUiState, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, mh4<g2b> mh4Var3, oh4<? super HeaderMenuItem, g2b> oh4Var, oh4<? super MetricData, g2b> oh4Var2, jt1 jt1Var, int i, int i2) {
        int i3;
        mh4<g2b> mh4Var4;
        int i4;
        mh4<g2b> mh4Var5;
        int i5;
        int i6;
        mh4<g2b> mh4Var6;
        int i7;
        int i8;
        oh4<? super HeaderMenuItem, g2b> oh4Var3;
        int i9;
        int i10;
        oh4<? super MetricData, g2b> oh4Var4;
        int i11;
        int i12;
        jt1.a.C0187a c0187a;
        mh4<g2b> mh4Var7;
        mh4<g2b> mh4Var8;
        oh4<? super HeaderMenuItem, g2b> oh4Var5;
        oh4<? super MetricData, g2b> oh4Var6;
        boolean zQ;
        int i13;
        boolean z;
        uh1 uh1VarM107getBackgroundColorQN2ZGVo;
        long jM767getHeader0d7_KjU;
        yz9 yz9VarA;
        uh1 uh1VarM109getContentColorQN2ZGVo;
        long jM771getOnHeader0d7_KjU;
        yz9 yz9VarA2;
        uh1 uh1VarM111getSubTitleColorQN2ZGVo;
        long jB;
        yz9 yz9VarA3;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        int i14;
        StringProvider subTitle;
        String text;
        TicketProgressRowState ticketStatusState;
        oh4<? super HeaderMenuItem, g2b> oh4Var7;
        mh4<g2b> mh4Var9;
        oh4<? super MetricData, g2b> oh4Var8;
        mh4<g2b> mh4Var10;
        Object objF;
        Object objF2;
        Object objF3;
        Object objF4;
        mh4<g2b> mh4Var11;
        xj8 xj8VarW;
        topAppBarUiState.getClass();
        bj4 bj4VarO = jt1Var.o(1613129219);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(topAppBarUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                mh4Var4 = mh4Var;
                i3 |= bj4VarO.j(mh4Var4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    mh4Var5 = mh4Var2;
                    if (bj4VarO.j(mh4Var5)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        mh4Var6 = mh4Var3;
                        if (bj4VarO.j(mh4Var6)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            oh4Var3 = oh4Var;
                            if (bj4VarO.j(oh4Var3)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            if ((196608 & i) == 0) {
                                oh4Var4 = oh4Var2;
                                if (bj4VarO.j(oh4Var4)) {
                                    i11 = 131072;
                                } else {
                                    i11 = 65536;
                                }
                                i3 |= i11;
                            }
                            if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                                if (i15 != 0) {
                                    mh4Var4 = null;
                                }
                                i12 = 0;
                                c0187a = jt1.a.a;
                                if (i4 != 0) {
                                    bj4VarO.K(-287893905);
                                    objF4 = bj4VarO.f();
                                    if (objF4 == c0187a) {
                                        objF4 = new b52();
                                        bj4VarO.C(objF4);
                                    }
                                    bj4VarO.U(false);
                                    mh4Var7 = (mh4) objF4;
                                } else {
                                    mh4Var7 = mh4Var5;
                                }
                                if (i6 != 0) {
                                    bj4VarO.K(-287892465);
                                    objF3 = bj4VarO.f();
                                    if (objF3 == c0187a) {
                                        objF3 = new c52();
                                        bj4VarO.C(objF3);
                                    }
                                    mh4Var8 = (mh4) objF3;
                                    bj4VarO.U(false);
                                } else {
                                    mh4Var8 = mh4Var6;
                                }
                                if (i8 != 0) {
                                    bj4VarO.K(-287890865);
                                    objF2 = bj4VarO.f();
                                    if (objF2 == c0187a) {
                                        objF2 = new d52();
                                        bj4VarO.C(objF2);
                                    }
                                    oh4Var5 = (oh4) objF2;
                                    bj4VarO.U(false);
                                } else {
                                    oh4Var5 = oh4Var3;
                                }
                                if (i10 != 0) {
                                    bj4VarO.K(-287889457);
                                    objF = bj4VarO.f();
                                    if (objF == c0187a) {
                                        objF = new e52(i12);
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO.U(false);
                                    oh4Var6 = (oh4) objF;
                                } else {
                                    oh4Var6 = oh4Var4;
                                }
                                zQ = gz3.q(bj4VarO);
                                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                                if (i13 == 1) {
                                    z = true;
                                } else if (i13 == 2) {
                                    z = false;
                                } else {
                                    if (i13 != 3) {
                                        u.b();
                                        return;
                                    }
                                    z = zQ;
                                }
                                bj4VarO.K(-287873620);
                                if (z || topAppBarUiState.m108getBackgroundColorDarkQN2ZGVo() == null) {
                                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                    } else {
                                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                    }
                                } else {
                                    jM767getHeader0d7_KjU = topAppBarUiState.m108getBackgroundColorDarkQN2ZGVo().a;
                                }
                                bj4VarO.U(false);
                                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                                bj4VarO.K(-287862139);
                                if (z || topAppBarUiState.m110getContentColorDarkQN2ZGVo() == null) {
                                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                    } else {
                                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                    }
                                } else {
                                    jM771getOnHeader0d7_KjU = topAppBarUiState.m110getContentColorDarkQN2ZGVo().a;
                                }
                                bj4VarO.U(false);
                                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                                bj4VarO.K(-287850806);
                                if (z || topAppBarUiState.m112getSubTitleColorDarkQN2ZGVo() == null) {
                                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                    } else {
                                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                    }
                                } else {
                                    jB = topAppBarUiState.m112getSubTitleColorDarkQN2ZGVo().a;
                                }
                                bj4VarO.U(false);
                                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                                iHashCode = Long.hashCode(bj4VarO.T);
                                kw7VarP = bj4VarO.P();
                                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                                bt1.c.getClass();
                                aVar = bt1.a.b;
                                if (bj4VarO.a == null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4VarO.q();
                                if (bj4VarO.S) {
                                    bj4VarO.k(aVar);
                                } else {
                                    bj4VarO.z();
                                }
                                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                                rd7.c(bj4VarO, bt1.a.h);
                                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                                StringProvider title = topAppBarUiState.getTitle();
                                i14 = StringProvider.$stable;
                                String text2 = title.getText(bj4VarO, i14);
                                subTitle = topAppBarUiState.getSubTitle();
                                bj4VarO.K(603575061);
                                if (subTitle == null) {
                                    text = null;
                                } else {
                                    text = subTitle.getText(bj4VarO, i14);
                                }
                                bj4VarO.U(false);
                                mh4<g2b> mh4Var12 = mh4Var4;
                                oh4<? super MetricData, g2b> oh4Var9 = oh4Var6;
                                TopActionBarKt.m90TopActionBarNpQZenA(null, text2, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var12, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                                bj4VarO = bj4VarO;
                                ticketStatusState = topAppBarUiState.getTicketStatusState();
                                bj4VarO.K(603606589);
                                if (ticketStatusState == null) {
                                    mh4Var6 = mh4Var8;
                                } else {
                                    mh4Var6 = mh4Var8;
                                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                    g2b g2bVar = g2b.a;
                                }
                                bj4VarO.U(false);
                                bj4VarO.U(true);
                                oh4Var7 = oh4Var5;
                                mh4Var9 = mh4Var7;
                                oh4Var8 = oh4Var9;
                                mh4Var10 = mh4Var12;
                            } else {
                                bj4VarO.u();
                                mh4Var10 = mh4Var4;
                                mh4Var9 = mh4Var5;
                                oh4Var7 = oh4Var3;
                                oh4Var8 = oh4Var4;
                            }
                            mh4Var11 = mh4Var6;
                            xj8VarW = bj4VarO.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                            }
                        }
                        i3 |= 196608;
                        oh4Var4 = oh4Var2;
                        if ((74899 & i3) == 74898) {
                            if (i15 != 0) {
                                mh4Var4 = null;
                            }
                            i12 = 0;
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(-287893905);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new b52();
                                    bj4VarO.C(objF4);
                                }
                                bj4VarO.U(false);
                                mh4Var7 = (mh4) objF4;
                            } else {
                                mh4Var7 = mh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-287892465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new c52();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var8 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var8 = mh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-287890865);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new d52();
                                    bj4VarO.C(objF2);
                                }
                                oh4Var5 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-287889457);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new e52(i12);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var6 = (oh4) objF;
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            zQ = gz3.q(bj4VarO);
                            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                            if (i13 == 1) {
                                z = true;
                            } else if (i13 == 2) {
                                z = false;
                            } else {
                                if (i13 != 3) {
                                    u.b();
                                    return;
                                }
                                z = zQ;
                            }
                            bj4VarO.K(-287873620);
                            if (z) {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287862139);
                            if (z) {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287850806);
                            if (z) {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6.a.t);
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            StringProvider title2 = topAppBarUiState.getTitle();
                            i14 = StringProvider.$stable;
                            String text3 = title2.getText(bj4VarO, i14);
                            subTitle = topAppBarUiState.getSubTitle();
                            bj4VarO.K(603575061);
                            if (subTitle == null) {
                                text = null;
                            } else {
                                text = subTitle.getText(bj4VarO, i14);
                            }
                            bj4VarO.U(false);
                            mh4<g2b> mh4Var13 = mh4Var4;
                            oh4<? super MetricData, g2b> oh4Var10 = oh4Var6;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, text3, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var13, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                            bj4VarO = bj4VarO;
                            ticketStatusState = topAppBarUiState.getTicketStatusState();
                            bj4VarO.K(603606589);
                            if (ticketStatusState == null) {
                                mh4Var6 = mh4Var8;
                            } else {
                                mh4Var6 = mh4Var8;
                                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                g2b g2bVar2 = g2b.a;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            oh4Var7 = oh4Var5;
                            mh4Var9 = mh4Var7;
                            oh4Var8 = oh4Var10;
                            mh4Var10 = mh4Var13;
                        } else {
                            if (i15 != 0) {
                                mh4Var4 = null;
                            }
                            i12 = 0;
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(-287893905);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new b52();
                                    bj4VarO.C(objF4);
                                }
                                bj4VarO.U(false);
                                mh4Var7 = (mh4) objF4;
                            } else {
                                mh4Var7 = mh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-287892465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new c52();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var8 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var8 = mh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-287890865);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new d52();
                                    bj4VarO.C(objF2);
                                }
                                oh4Var5 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-287889457);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new e52(i12);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var6 = (oh4) objF;
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            zQ = gz3.q(bj4VarO);
                            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                            if (i13 == 1) {
                                z = true;
                            } else if (i13 == 2) {
                                z = false;
                            } else {
                                if (i13 != 3) {
                                    u.b();
                                    return;
                                }
                                z = zQ;
                            }
                            bj4VarO.K(-287873620);
                            if (z) {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287862139);
                            if (z) {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287850806);
                            if (z) {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6.a.t);
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            StringProvider title3 = topAppBarUiState.getTitle();
                            i14 = StringProvider.$stable;
                            String text4 = title3.getText(bj4VarO, i14);
                            subTitle = topAppBarUiState.getSubTitle();
                            bj4VarO.K(603575061);
                            if (subTitle == null) {
                                text = null;
                            } else {
                                text = subTitle.getText(bj4VarO, i14);
                            }
                            bj4VarO.U(false);
                            mh4<g2b> mh4Var14 = mh4Var4;
                            oh4<? super MetricData, g2b> oh4Var11 = oh4Var6;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, text4, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var14, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                            bj4VarO = bj4VarO;
                            ticketStatusState = topAppBarUiState.getTicketStatusState();
                            bj4VarO.K(603606589);
                            if (ticketStatusState == null) {
                                mh4Var6 = mh4Var8;
                            } else {
                                mh4Var6 = mh4Var8;
                                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                g2b g2bVar3 = g2b.a;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            oh4Var7 = oh4Var5;
                            mh4Var9 = mh4Var7;
                            oh4Var8 = oh4Var11;
                            mh4Var10 = mh4Var14;
                        }
                        mh4Var11 = mh4Var6;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                        }
                    }
                    i3 |= 24576;
                    oh4Var3 = oh4Var;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            oh4Var4 = oh4Var2;
                            if (bj4VarO.j(oh4Var4)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((74899 & i3) == 74898) {
                            if (i15 != 0) {
                                mh4Var4 = null;
                            }
                            i12 = 0;
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(-287893905);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new b52();
                                    bj4VarO.C(objF4);
                                }
                                bj4VarO.U(false);
                                mh4Var7 = (mh4) objF4;
                            } else {
                                mh4Var7 = mh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-287892465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new c52();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var8 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var8 = mh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-287890865);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new d52();
                                    bj4VarO.C(objF2);
                                }
                                oh4Var5 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-287889457);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new e52(i12);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var6 = (oh4) objF;
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            zQ = gz3.q(bj4VarO);
                            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                            if (i13 == 1) {
                                z = true;
                            } else if (i13 == 2) {
                                z = false;
                            } else {
                                if (i13 != 3) {
                                    u.b();
                                    return;
                                }
                                z = zQ;
                            }
                            bj4VarO.K(-287873620);
                            if (z) {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287862139);
                            if (z) {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287850806);
                            if (z) {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6.a.t);
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            StringProvider title4 = topAppBarUiState.getTitle();
                            i14 = StringProvider.$stable;
                            String text5 = title4.getText(bj4VarO, i14);
                            subTitle = topAppBarUiState.getSubTitle();
                            bj4VarO.K(603575061);
                            if (subTitle == null) {
                                text = null;
                            } else {
                                text = subTitle.getText(bj4VarO, i14);
                            }
                            bj4VarO.U(false);
                            mh4<g2b> mh4Var15 = mh4Var4;
                            oh4<? super MetricData, g2b> oh4Var12 = oh4Var6;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, text5, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var15, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                            bj4VarO = bj4VarO;
                            ticketStatusState = topAppBarUiState.getTicketStatusState();
                            bj4VarO.K(603606589);
                            if (ticketStatusState == null) {
                                mh4Var6 = mh4Var8;
                            } else {
                                mh4Var6 = mh4Var8;
                                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                g2b g2bVar4 = g2b.a;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            oh4Var7 = oh4Var5;
                            mh4Var9 = mh4Var7;
                            oh4Var8 = oh4Var12;
                            mh4Var10 = mh4Var15;
                        } else {
                            if (i15 != 0) {
                                mh4Var4 = null;
                            }
                            i12 = 0;
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(-287893905);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new b52();
                                    bj4VarO.C(objF4);
                                }
                                bj4VarO.U(false);
                                mh4Var7 = (mh4) objF4;
                            } else {
                                mh4Var7 = mh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-287892465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new c52();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var8 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var8 = mh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-287890865);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new d52();
                                    bj4VarO.C(objF2);
                                }
                                oh4Var5 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-287889457);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new e52(i12);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var6 = (oh4) objF;
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            zQ = gz3.q(bj4VarO);
                            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                            if (i13 == 1) {
                                z = true;
                            } else if (i13 == 2) {
                                z = false;
                            } else {
                                if (i13 != 3) {
                                    u.b();
                                    return;
                                }
                                z = zQ;
                            }
                            bj4VarO.K(-287873620);
                            if (z) {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287862139);
                            if (z) {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287850806);
                            if (z) {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6.a.t);
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            StringProvider title5 = topAppBarUiState.getTitle();
                            i14 = StringProvider.$stable;
                            String text6 = title5.getText(bj4VarO, i14);
                            subTitle = topAppBarUiState.getSubTitle();
                            bj4VarO.K(603575061);
                            if (subTitle == null) {
                                text = null;
                            } else {
                                text = subTitle.getText(bj4VarO, i14);
                            }
                            bj4VarO.U(false);
                            mh4<g2b> mh4Var16 = mh4Var4;
                            oh4<? super MetricData, g2b> oh4Var13 = oh4Var6;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, text6, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var16, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                            bj4VarO = bj4VarO;
                            ticketStatusState = topAppBarUiState.getTicketStatusState();
                            bj4VarO.K(603606589);
                            if (ticketStatusState == null) {
                                mh4Var6 = mh4Var8;
                            } else {
                                mh4Var6 = mh4Var8;
                                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                g2b g2bVar5 = g2b.a;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            oh4Var7 = oh4Var5;
                            mh4Var9 = mh4Var7;
                            oh4Var8 = oh4Var13;
                            mh4Var10 = mh4Var16;
                        }
                        mh4Var11 = mh4Var6;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                        }
                    }
                    i3 |= 196608;
                    oh4Var4 = oh4Var2;
                    if ((74899 & i3) == 74898) {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title6 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text7 = title6.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var17 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var14 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text7, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var17, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar6 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var14;
                        mh4Var10 = mh4Var17;
                    } else {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title7 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text8 = title7.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var18 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var15 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text8, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var18, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar7 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var15;
                        mh4Var10 = mh4Var18;
                    }
                    mh4Var11 = mh4Var6;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                    }
                }
                i3 |= 3072;
                mh4Var6 = mh4Var3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        oh4Var3 = oh4Var;
                        if (bj4VarO.j(oh4Var3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            oh4Var4 = oh4Var2;
                            if (bj4VarO.j(oh4Var4)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((74899 & i3) == 74898) {
                            if (i15 != 0) {
                                mh4Var4 = null;
                            }
                            i12 = 0;
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(-287893905);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new b52();
                                    bj4VarO.C(objF4);
                                }
                                bj4VarO.U(false);
                                mh4Var7 = (mh4) objF4;
                            } else {
                                mh4Var7 = mh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-287892465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new c52();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var8 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var8 = mh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-287890865);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new d52();
                                    bj4VarO.C(objF2);
                                }
                                oh4Var5 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-287889457);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new e52(i12);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var6 = (oh4) objF;
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            zQ = gz3.q(bj4VarO);
                            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                            if (i13 == 1) {
                                z = true;
                            } else if (i13 == 2) {
                                z = false;
                            } else {
                                if (i13 != 3) {
                                    u.b();
                                    return;
                                }
                                z = zQ;
                            }
                            bj4VarO.K(-287873620);
                            if (z) {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287862139);
                            if (z) {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287850806);
                            if (z) {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6.a.t);
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            StringProvider title8 = topAppBarUiState.getTitle();
                            i14 = StringProvider.$stable;
                            String text9 = title8.getText(bj4VarO, i14);
                            subTitle = topAppBarUiState.getSubTitle();
                            bj4VarO.K(603575061);
                            if (subTitle == null) {
                                text = null;
                            } else {
                                text = subTitle.getText(bj4VarO, i14);
                            }
                            bj4VarO.U(false);
                            mh4<g2b> mh4Var19 = mh4Var4;
                            oh4<? super MetricData, g2b> oh4Var16 = oh4Var6;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, text9, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var19, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                            bj4VarO = bj4VarO;
                            ticketStatusState = topAppBarUiState.getTicketStatusState();
                            bj4VarO.K(603606589);
                            if (ticketStatusState == null) {
                                mh4Var6 = mh4Var8;
                            } else {
                                mh4Var6 = mh4Var8;
                                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                g2b g2bVar8 = g2b.a;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            oh4Var7 = oh4Var5;
                            mh4Var9 = mh4Var7;
                            oh4Var8 = oh4Var16;
                            mh4Var10 = mh4Var19;
                        } else {
                            if (i15 != 0) {
                                mh4Var4 = null;
                            }
                            i12 = 0;
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(-287893905);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new b52();
                                    bj4VarO.C(objF4);
                                }
                                bj4VarO.U(false);
                                mh4Var7 = (mh4) objF4;
                            } else {
                                mh4Var7 = mh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-287892465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new c52();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var8 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var8 = mh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-287890865);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new d52();
                                    bj4VarO.C(objF2);
                                }
                                oh4Var5 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-287889457);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new e52(i12);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var6 = (oh4) objF;
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            zQ = gz3.q(bj4VarO);
                            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                            if (i13 == 1) {
                                z = true;
                            } else if (i13 == 2) {
                                z = false;
                            } else {
                                if (i13 != 3) {
                                    u.b();
                                    return;
                                }
                                z = zQ;
                            }
                            bj4VarO.K(-287873620);
                            if (z) {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287862139);
                            if (z) {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287850806);
                            if (z) {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6.a.t);
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            StringProvider title9 = topAppBarUiState.getTitle();
                            i14 = StringProvider.$stable;
                            String text10 = title9.getText(bj4VarO, i14);
                            subTitle = topAppBarUiState.getSubTitle();
                            bj4VarO.K(603575061);
                            if (subTitle == null) {
                                text = null;
                            } else {
                                text = subTitle.getText(bj4VarO, i14);
                            }
                            bj4VarO.U(false);
                            mh4<g2b> mh4Var110 = mh4Var4;
                            oh4<? super MetricData, g2b> oh4Var17 = oh4Var6;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, text10, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var110, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                            bj4VarO = bj4VarO;
                            ticketStatusState = topAppBarUiState.getTicketStatusState();
                            bj4VarO.K(603606589);
                            if (ticketStatusState == null) {
                                mh4Var6 = mh4Var8;
                            } else {
                                mh4Var6 = mh4Var8;
                                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                g2b g2bVar9 = g2b.a;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            oh4Var7 = oh4Var5;
                            mh4Var9 = mh4Var7;
                            oh4Var8 = oh4Var17;
                            mh4Var10 = mh4Var110;
                        }
                        mh4Var11 = mh4Var6;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                        }
                    }
                    i3 |= 196608;
                    oh4Var4 = oh4Var2;
                    if ((74899 & i3) == 74898) {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title10 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text11 = title10.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var111 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var18 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text11, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar10 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var18;
                        mh4Var10 = mh4Var111;
                    } else {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title11 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text12 = title11.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var112 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var19 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text12, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var112, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar11 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var19;
                        mh4Var10 = mh4Var112;
                    }
                    mh4Var11 = mh4Var6;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                    }
                }
                i3 |= 24576;
                oh4Var3 = oh4Var;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title12 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text13 = title12.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var113 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var110 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text13, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var113, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar12 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var110;
                        mh4Var10 = mh4Var113;
                    } else {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title13 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text14 = title13.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var114 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var111 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text14, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var114, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar13 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var111;
                        mh4Var10 = mh4Var114;
                    }
                    mh4Var11 = mh4Var6;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                    }
                }
                i3 |= 196608;
                oh4Var4 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title14 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text15 = title14.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var115 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var112 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text15, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var115, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar14 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var112;
                    mh4Var10 = mh4Var115;
                } else {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title15 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text16 = title15.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var116 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var113 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text16, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var116, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar15 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var113;
                    mh4Var10 = mh4Var116;
                }
                mh4Var11 = mh4Var6;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                }
            }
            i3 |= 384;
            mh4Var5 = mh4Var2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    mh4Var6 = mh4Var3;
                    if (bj4VarO.j(mh4Var6)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        oh4Var3 = oh4Var;
                        if (bj4VarO.j(oh4Var3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            oh4Var4 = oh4Var2;
                            if (bj4VarO.j(oh4Var4)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((74899 & i3) == 74898) {
                            if (i15 != 0) {
                                mh4Var4 = null;
                            }
                            i12 = 0;
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(-287893905);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new b52();
                                    bj4VarO.C(objF4);
                                }
                                bj4VarO.U(false);
                                mh4Var7 = (mh4) objF4;
                            } else {
                                mh4Var7 = mh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-287892465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new c52();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var8 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var8 = mh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-287890865);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new d52();
                                    bj4VarO.C(objF2);
                                }
                                oh4Var5 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-287889457);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new e52(i12);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var6 = (oh4) objF;
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            zQ = gz3.q(bj4VarO);
                            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                            if (i13 == 1) {
                                z = true;
                            } else if (i13 == 2) {
                                z = false;
                            } else {
                                if (i13 != 3) {
                                    u.b();
                                    return;
                                }
                                z = zQ;
                            }
                            bj4VarO.K(-287873620);
                            if (z) {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287862139);
                            if (z) {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287850806);
                            if (z) {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6.a.t);
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            StringProvider title16 = topAppBarUiState.getTitle();
                            i14 = StringProvider.$stable;
                            String text17 = title16.getText(bj4VarO, i14);
                            subTitle = topAppBarUiState.getSubTitle();
                            bj4VarO.K(603575061);
                            if (subTitle == null) {
                                text = null;
                            } else {
                                text = subTitle.getText(bj4VarO, i14);
                            }
                            bj4VarO.U(false);
                            mh4<g2b> mh4Var117 = mh4Var4;
                            oh4<? super MetricData, g2b> oh4Var114 = oh4Var6;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, text17, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var117, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                            bj4VarO = bj4VarO;
                            ticketStatusState = topAppBarUiState.getTicketStatusState();
                            bj4VarO.K(603606589);
                            if (ticketStatusState == null) {
                                mh4Var6 = mh4Var8;
                            } else {
                                mh4Var6 = mh4Var8;
                                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                g2b g2bVar16 = g2b.a;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            oh4Var7 = oh4Var5;
                            mh4Var9 = mh4Var7;
                            oh4Var8 = oh4Var114;
                            mh4Var10 = mh4Var117;
                        } else {
                            if (i15 != 0) {
                                mh4Var4 = null;
                            }
                            i12 = 0;
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(-287893905);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new b52();
                                    bj4VarO.C(objF4);
                                }
                                bj4VarO.U(false);
                                mh4Var7 = (mh4) objF4;
                            } else {
                                mh4Var7 = mh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-287892465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new c52();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var8 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var8 = mh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-287890865);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new d52();
                                    bj4VarO.C(objF2);
                                }
                                oh4Var5 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-287889457);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new e52(i12);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var6 = (oh4) objF;
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            zQ = gz3.q(bj4VarO);
                            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                            if (i13 == 1) {
                                z = true;
                            } else if (i13 == 2) {
                                z = false;
                            } else {
                                if (i13 != 3) {
                                    u.b();
                                    return;
                                }
                                z = zQ;
                            }
                            bj4VarO.K(-287873620);
                            if (z) {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287862139);
                            if (z) {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287850806);
                            if (z) {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6.a.t);
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            StringProvider title17 = topAppBarUiState.getTitle();
                            i14 = StringProvider.$stable;
                            String text18 = title17.getText(bj4VarO, i14);
                            subTitle = topAppBarUiState.getSubTitle();
                            bj4VarO.K(603575061);
                            if (subTitle == null) {
                                text = null;
                            } else {
                                text = subTitle.getText(bj4VarO, i14);
                            }
                            bj4VarO.U(false);
                            mh4<g2b> mh4Var118 = mh4Var4;
                            oh4<? super MetricData, g2b> oh4Var115 = oh4Var6;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, text18, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var118, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                            bj4VarO = bj4VarO;
                            ticketStatusState = topAppBarUiState.getTicketStatusState();
                            bj4VarO.K(603606589);
                            if (ticketStatusState == null) {
                                mh4Var6 = mh4Var8;
                            } else {
                                mh4Var6 = mh4Var8;
                                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                g2b g2bVar17 = g2b.a;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            oh4Var7 = oh4Var5;
                            mh4Var9 = mh4Var7;
                            oh4Var8 = oh4Var115;
                            mh4Var10 = mh4Var118;
                        }
                        mh4Var11 = mh4Var6;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                        }
                    }
                    i3 |= 196608;
                    oh4Var4 = oh4Var2;
                    if ((74899 & i3) == 74898) {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title18 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text19 = title18.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var119 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var116 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text19, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var119, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar18 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var116;
                        mh4Var10 = mh4Var119;
                    } else {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title19 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text110 = title19.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var1110 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var117 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text110, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1110, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar19 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var117;
                        mh4Var10 = mh4Var1110;
                    }
                    mh4Var11 = mh4Var6;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                    }
                }
                i3 |= 24576;
                oh4Var3 = oh4Var;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title110 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text111 = title110.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var1111 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var118 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text111, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar110 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var118;
                        mh4Var10 = mh4Var1111;
                    } else {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title111 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text112 = title111.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var1112 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var119 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text112, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1112, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar111 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var119;
                        mh4Var10 = mh4Var1112;
                    }
                    mh4Var11 = mh4Var6;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                    }
                }
                i3 |= 196608;
                oh4Var4 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title112 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text113 = title112.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1113 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var1110 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text113, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1113, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar112 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var1110;
                    mh4Var10 = mh4Var1113;
                } else {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title113 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text114 = title113.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1114 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var1111 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text114, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1114, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar113 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var1111;
                    mh4Var10 = mh4Var1114;
                }
                mh4Var11 = mh4Var6;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                }
            }
            i3 |= 3072;
            mh4Var6 = mh4Var3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var3 = oh4Var;
                    if (bj4VarO.j(oh4Var3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title114 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text115 = title114.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var1115 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var1112 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text115, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1115, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar114 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var1112;
                        mh4Var10 = mh4Var1115;
                    } else {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title115 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text116 = title115.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var1116 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var1113 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text116, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1116, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar115 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var1113;
                        mh4Var10 = mh4Var1116;
                    }
                    mh4Var11 = mh4Var6;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                    }
                }
                i3 |= 196608;
                oh4Var4 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title116 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text117 = title116.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1117 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var1114 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text117, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1117, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar116 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var1114;
                    mh4Var10 = mh4Var1117;
                } else {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title117 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text118 = title117.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1118 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var1115 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text118, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1118, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar117 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var1115;
                    mh4Var10 = mh4Var1118;
                }
                mh4Var11 = mh4Var6;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                }
            }
            i3 |= 24576;
            oh4Var3 = oh4Var;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) == 74898) {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title118 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text119 = title118.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1119 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var1116 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text119, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1119, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar118 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var1116;
                    mh4Var10 = mh4Var1119;
                } else {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title119 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text1110 = title119.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var11110 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var1117 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text1110, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11110, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar119 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var1117;
                    mh4Var10 = mh4Var11110;
                }
                mh4Var11 = mh4Var6;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                }
            }
            i3 |= 196608;
            oh4Var4 = oh4Var2;
            if ((74899 & i3) == 74898) {
                if (i15 != 0) {
                    mh4Var4 = null;
                }
                i12 = 0;
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-287893905);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new b52();
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    mh4Var7 = (mh4) objF4;
                } else {
                    mh4Var7 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-287892465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new c52();
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-287890865);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new d52();
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i10 != 0) {
                    bj4VarO.K(-287889457);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new e52(i12);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                zQ = gz3.q(bj4VarO);
                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                if (i13 == 1) {
                    z = true;
                } else if (i13 == 2) {
                    z = false;
                } else {
                    if (i13 != 3) {
                        u.b();
                        return;
                    }
                    z = zQ;
                }
                bj4VarO.K(-287873620);
                if (z) {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287862139);
                if (z) {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287850806);
                if (z) {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                StringProvider title1110 = topAppBarUiState.getTitle();
                i14 = StringProvider.$stable;
                String text1111 = title1110.getText(bj4VarO, i14);
                subTitle = topAppBarUiState.getSubTitle();
                bj4VarO.K(603575061);
                if (subTitle == null) {
                    text = null;
                } else {
                    text = subTitle.getText(bj4VarO, i14);
                }
                bj4VarO.U(false);
                mh4<g2b> mh4Var11111 = mh4Var4;
                oh4<? super MetricData, g2b> oh4Var1118 = oh4Var6;
                TopActionBarKt.m90TopActionBarNpQZenA(null, text1111, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11111, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                bj4VarO = bj4VarO;
                ticketStatusState = topAppBarUiState.getTicketStatusState();
                bj4VarO.K(603606589);
                if (ticketStatusState == null) {
                    mh4Var6 = mh4Var8;
                } else {
                    mh4Var6 = mh4Var8;
                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                    g2b g2bVar1110 = g2b.a;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var7 = oh4Var5;
                mh4Var9 = mh4Var7;
                oh4Var8 = oh4Var1118;
                mh4Var10 = mh4Var11111;
            } else {
                if (i15 != 0) {
                    mh4Var4 = null;
                }
                i12 = 0;
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-287893905);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new b52();
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    mh4Var7 = (mh4) objF4;
                } else {
                    mh4Var7 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-287892465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new c52();
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-287890865);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new d52();
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i10 != 0) {
                    bj4VarO.K(-287889457);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new e52(i12);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                zQ = gz3.q(bj4VarO);
                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                if (i13 == 1) {
                    z = true;
                } else if (i13 == 2) {
                    z = false;
                } else {
                    if (i13 != 3) {
                        u.b();
                        return;
                    }
                    z = zQ;
                }
                bj4VarO.K(-287873620);
                if (z) {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287862139);
                if (z) {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287850806);
                if (z) {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                StringProvider title1111 = topAppBarUiState.getTitle();
                i14 = StringProvider.$stable;
                String text1112 = title1111.getText(bj4VarO, i14);
                subTitle = topAppBarUiState.getSubTitle();
                bj4VarO.K(603575061);
                if (subTitle == null) {
                    text = null;
                } else {
                    text = subTitle.getText(bj4VarO, i14);
                }
                bj4VarO.U(false);
                mh4<g2b> mh4Var11112 = mh4Var4;
                oh4<? super MetricData, g2b> oh4Var1119 = oh4Var6;
                TopActionBarKt.m90TopActionBarNpQZenA(null, text1112, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11112, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                bj4VarO = bj4VarO;
                ticketStatusState = topAppBarUiState.getTicketStatusState();
                bj4VarO.K(603606589);
                if (ticketStatusState == null) {
                    mh4Var6 = mh4Var8;
                } else {
                    mh4Var6 = mh4Var8;
                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                    g2b g2bVar1111 = g2b.a;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var7 = oh4Var5;
                mh4Var9 = mh4Var7;
                oh4Var8 = oh4Var1119;
                mh4Var10 = mh4Var11112;
            }
            mh4Var11 = mh4Var6;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
            }
        }
        i3 |= 48;
        mh4Var4 = mh4Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                mh4Var5 = mh4Var2;
                if (bj4VarO.j(mh4Var5)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    mh4Var6 = mh4Var3;
                    if (bj4VarO.j(mh4Var6)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        oh4Var3 = oh4Var;
                        if (bj4VarO.j(oh4Var3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        if ((196608 & i) == 0) {
                            oh4Var4 = oh4Var2;
                            if (bj4VarO.j(oh4Var4)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((74899 & i3) == 74898) {
                            if (i15 != 0) {
                                mh4Var4 = null;
                            }
                            i12 = 0;
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(-287893905);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new b52();
                                    bj4VarO.C(objF4);
                                }
                                bj4VarO.U(false);
                                mh4Var7 = (mh4) objF4;
                            } else {
                                mh4Var7 = mh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-287892465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new c52();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var8 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var8 = mh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-287890865);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new d52();
                                    bj4VarO.C(objF2);
                                }
                                oh4Var5 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-287889457);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new e52(i12);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var6 = (oh4) objF;
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            zQ = gz3.q(bj4VarO);
                            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                            if (i13 == 1) {
                                z = true;
                            } else if (i13 == 2) {
                                z = false;
                            } else {
                                if (i13 != 3) {
                                    u.b();
                                    return;
                                }
                                z = zQ;
                            }
                            bj4VarO.K(-287873620);
                            if (z) {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287862139);
                            if (z) {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287850806);
                            if (z) {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6.a.t);
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            StringProvider title1112 = topAppBarUiState.getTitle();
                            i14 = StringProvider.$stable;
                            String text1113 = title1112.getText(bj4VarO, i14);
                            subTitle = topAppBarUiState.getSubTitle();
                            bj4VarO.K(603575061);
                            if (subTitle == null) {
                                text = null;
                            } else {
                                text = subTitle.getText(bj4VarO, i14);
                            }
                            bj4VarO.U(false);
                            mh4<g2b> mh4Var11113 = mh4Var4;
                            oh4<? super MetricData, g2b> oh4Var11110 = oh4Var6;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, text1113, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11113, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                            bj4VarO = bj4VarO;
                            ticketStatusState = topAppBarUiState.getTicketStatusState();
                            bj4VarO.K(603606589);
                            if (ticketStatusState == null) {
                                mh4Var6 = mh4Var8;
                            } else {
                                mh4Var6 = mh4Var8;
                                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                g2b g2bVar1112 = g2b.a;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            oh4Var7 = oh4Var5;
                            mh4Var9 = mh4Var7;
                            oh4Var8 = oh4Var11110;
                            mh4Var10 = mh4Var11113;
                        } else {
                            if (i15 != 0) {
                                mh4Var4 = null;
                            }
                            i12 = 0;
                            c0187a = jt1.a.a;
                            if (i4 != 0) {
                                bj4VarO.K(-287893905);
                                objF4 = bj4VarO.f();
                                if (objF4 == c0187a) {
                                    objF4 = new b52();
                                    bj4VarO.C(objF4);
                                }
                                bj4VarO.U(false);
                                mh4Var7 = (mh4) objF4;
                            } else {
                                mh4Var7 = mh4Var5;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-287892465);
                                objF3 = bj4VarO.f();
                                if (objF3 == c0187a) {
                                    objF3 = new c52();
                                    bj4VarO.C(objF3);
                                }
                                mh4Var8 = (mh4) objF3;
                                bj4VarO.U(false);
                            } else {
                                mh4Var8 = mh4Var6;
                            }
                            if (i8 != 0) {
                                bj4VarO.K(-287890865);
                                objF2 = bj4VarO.f();
                                if (objF2 == c0187a) {
                                    objF2 = new d52();
                                    bj4VarO.C(objF2);
                                }
                                oh4Var5 = (oh4) objF2;
                                bj4VarO.U(false);
                            } else {
                                oh4Var5 = oh4Var3;
                            }
                            if (i10 != 0) {
                                bj4VarO.K(-287889457);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new e52(i12);
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var6 = (oh4) objF;
                            } else {
                                oh4Var6 = oh4Var4;
                            }
                            zQ = gz3.q(bj4VarO);
                            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                            if (i13 == 1) {
                                z = true;
                            } else if (i13 == 2) {
                                z = false;
                            } else {
                                if (i13 != 3) {
                                    u.b();
                                    return;
                                }
                                z = zQ;
                            }
                            bj4VarO.K(-287873620);
                            if (z) {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                                } else {
                                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287862139);
                            if (z) {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                                if (uh1VarM109getContentColorQN2ZGVo == null) {
                                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                                } else {
                                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                            bj4VarO.K(-287850806);
                            if (z) {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            } else {
                                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                                } else {
                                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                                }
                            }
                            bj4VarO.U(false);
                            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6.a.t);
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            StringProvider title1113 = topAppBarUiState.getTitle();
                            i14 = StringProvider.$stable;
                            String text1114 = title1113.getText(bj4VarO, i14);
                            subTitle = topAppBarUiState.getSubTitle();
                            bj4VarO.K(603575061);
                            if (subTitle == null) {
                                text = null;
                            } else {
                                text = subTitle.getText(bj4VarO, i14);
                            }
                            bj4VarO.U(false);
                            mh4<g2b> mh4Var11114 = mh4Var4;
                            oh4<? super MetricData, g2b> oh4Var11111 = oh4Var6;
                            TopActionBarKt.m90TopActionBarNpQZenA(null, text1114, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11114, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                            bj4VarO = bj4VarO;
                            ticketStatusState = topAppBarUiState.getTicketStatusState();
                            bj4VarO.K(603606589);
                            if (ticketStatusState == null) {
                                mh4Var6 = mh4Var8;
                            } else {
                                mh4Var6 = mh4Var8;
                                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                                g2b g2bVar1113 = g2b.a;
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            oh4Var7 = oh4Var5;
                            mh4Var9 = mh4Var7;
                            oh4Var8 = oh4Var11111;
                            mh4Var10 = mh4Var11114;
                        }
                        mh4Var11 = mh4Var6;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                        }
                    }
                    i3 |= 196608;
                    oh4Var4 = oh4Var2;
                    if ((74899 & i3) == 74898) {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title1114 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text1115 = title1114.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var11115 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var11112 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text1115, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11115, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar1114 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var11112;
                        mh4Var10 = mh4Var11115;
                    } else {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title1115 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text1116 = title1115.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var11116 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var11113 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text1116, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11116, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar1115 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var11113;
                        mh4Var10 = mh4Var11116;
                    }
                    mh4Var11 = mh4Var6;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                    }
                }
                i3 |= 24576;
                oh4Var3 = oh4Var;
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title1116 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text1117 = title1116.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var11117 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var11114 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text1117, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11117, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar1116 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var11114;
                        mh4Var10 = mh4Var11117;
                    } else {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title1117 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text1118 = title1117.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var11118 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var11115 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text1118, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11118, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar1117 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var11115;
                        mh4Var10 = mh4Var11118;
                    }
                    mh4Var11 = mh4Var6;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                    }
                }
                i3 |= 196608;
                oh4Var4 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title1118 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text1119 = title1118.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var11119 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var11116 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text1119, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11119, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar1118 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var11116;
                    mh4Var10 = mh4Var11119;
                } else {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title1119 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text11110 = title1119.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var111110 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var11117 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text11110, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111110, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar1119 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var11117;
                    mh4Var10 = mh4Var111110;
                }
                mh4Var11 = mh4Var6;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                }
            }
            i3 |= 3072;
            mh4Var6 = mh4Var3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var3 = oh4Var;
                    if (bj4VarO.j(oh4Var3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title11110 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text11111 = title11110.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var111111 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var11118 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text11111, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111111, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar11110 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var11118;
                        mh4Var10 = mh4Var111111;
                    } else {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title11111 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text11112 = title11111.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var111112 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var11119 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text11112, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111112, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar11111 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var11119;
                        mh4Var10 = mh4Var111112;
                    }
                    mh4Var11 = mh4Var6;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                    }
                }
                i3 |= 196608;
                oh4Var4 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title11112 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text11113 = title11112.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var111113 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var111110 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text11113, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111113, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar11112 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var111110;
                    mh4Var10 = mh4Var111113;
                } else {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title11113 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text11114 = title11113.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var111114 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var111111 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text11114, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111114, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar11113 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var111111;
                    mh4Var10 = mh4Var111114;
                }
                mh4Var11 = mh4Var6;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                }
            }
            i3 |= 24576;
            oh4Var3 = oh4Var;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) == 74898) {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title11114 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text11115 = title11114.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var111115 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var111112 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text11115, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111115, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar11114 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var111112;
                    mh4Var10 = mh4Var111115;
                } else {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title11115 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text11116 = title11115.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var111116 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var111113 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text11116, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111116, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar11115 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var111113;
                    mh4Var10 = mh4Var111116;
                }
                mh4Var11 = mh4Var6;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                }
            }
            i3 |= 196608;
            oh4Var4 = oh4Var2;
            if ((74899 & i3) == 74898) {
                if (i15 != 0) {
                    mh4Var4 = null;
                }
                i12 = 0;
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-287893905);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new b52();
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    mh4Var7 = (mh4) objF4;
                } else {
                    mh4Var7 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-287892465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new c52();
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-287890865);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new d52();
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i10 != 0) {
                    bj4VarO.K(-287889457);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new e52(i12);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                zQ = gz3.q(bj4VarO);
                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                if (i13 == 1) {
                    z = true;
                } else if (i13 == 2) {
                    z = false;
                } else {
                    if (i13 != 3) {
                        u.b();
                        return;
                    }
                    z = zQ;
                }
                bj4VarO.K(-287873620);
                if (z) {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287862139);
                if (z) {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287850806);
                if (z) {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                StringProvider title11116 = topAppBarUiState.getTitle();
                i14 = StringProvider.$stable;
                String text11117 = title11116.getText(bj4VarO, i14);
                subTitle = topAppBarUiState.getSubTitle();
                bj4VarO.K(603575061);
                if (subTitle == null) {
                    text = null;
                } else {
                    text = subTitle.getText(bj4VarO, i14);
                }
                bj4VarO.U(false);
                mh4<g2b> mh4Var111117 = mh4Var4;
                oh4<? super MetricData, g2b> oh4Var111114 = oh4Var6;
                TopActionBarKt.m90TopActionBarNpQZenA(null, text11117, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111117, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                bj4VarO = bj4VarO;
                ticketStatusState = topAppBarUiState.getTicketStatusState();
                bj4VarO.K(603606589);
                if (ticketStatusState == null) {
                    mh4Var6 = mh4Var8;
                } else {
                    mh4Var6 = mh4Var8;
                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                    g2b g2bVar11116 = g2b.a;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var7 = oh4Var5;
                mh4Var9 = mh4Var7;
                oh4Var8 = oh4Var111114;
                mh4Var10 = mh4Var111117;
            } else {
                if (i15 != 0) {
                    mh4Var4 = null;
                }
                i12 = 0;
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-287893905);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new b52();
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    mh4Var7 = (mh4) objF4;
                } else {
                    mh4Var7 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-287892465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new c52();
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-287890865);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new d52();
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i10 != 0) {
                    bj4VarO.K(-287889457);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new e52(i12);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                zQ = gz3.q(bj4VarO);
                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                if (i13 == 1) {
                    z = true;
                } else if (i13 == 2) {
                    z = false;
                } else {
                    if (i13 != 3) {
                        u.b();
                        return;
                    }
                    z = zQ;
                }
                bj4VarO.K(-287873620);
                if (z) {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287862139);
                if (z) {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287850806);
                if (z) {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                StringProvider title11117 = topAppBarUiState.getTitle();
                i14 = StringProvider.$stable;
                String text11118 = title11117.getText(bj4VarO, i14);
                subTitle = topAppBarUiState.getSubTitle();
                bj4VarO.K(603575061);
                if (subTitle == null) {
                    text = null;
                } else {
                    text = subTitle.getText(bj4VarO, i14);
                }
                bj4VarO.U(false);
                mh4<g2b> mh4Var111118 = mh4Var4;
                oh4<? super MetricData, g2b> oh4Var111115 = oh4Var6;
                TopActionBarKt.m90TopActionBarNpQZenA(null, text11118, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111118, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                bj4VarO = bj4VarO;
                ticketStatusState = topAppBarUiState.getTicketStatusState();
                bj4VarO.K(603606589);
                if (ticketStatusState == null) {
                    mh4Var6 = mh4Var8;
                } else {
                    mh4Var6 = mh4Var8;
                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                    g2b g2bVar11117 = g2b.a;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var7 = oh4Var5;
                mh4Var9 = mh4Var7;
                oh4Var8 = oh4Var111115;
                mh4Var10 = mh4Var111118;
            }
            mh4Var11 = mh4Var6;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
            }
        }
        i3 |= 384;
        mh4Var5 = mh4Var2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                mh4Var6 = mh4Var3;
                if (bj4VarO.j(mh4Var6)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var3 = oh4Var;
                    if (bj4VarO.j(oh4Var3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    if ((196608 & i) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((74899 & i3) == 74898) {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title11118 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text11119 = title11118.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var111119 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var111116 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text11119, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var111119, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar11118 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var111116;
                        mh4Var10 = mh4Var111119;
                    } else {
                        if (i15 != 0) {
                            mh4Var4 = null;
                        }
                        i12 = 0;
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-287893905);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new b52();
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            mh4Var7 = (mh4) objF4;
                        } else {
                            mh4Var7 = mh4Var5;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-287892465);
                            objF3 = bj4VarO.f();
                            if (objF3 == c0187a) {
                                objF3 = new c52();
                                bj4VarO.C(objF3);
                            }
                            mh4Var8 = (mh4) objF3;
                            bj4VarO.U(false);
                        } else {
                            mh4Var8 = mh4Var6;
                        }
                        if (i8 != 0) {
                            bj4VarO.K(-287890865);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new d52();
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i10 != 0) {
                            bj4VarO.K(-287889457);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new e52(i12);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        zQ = gz3.q(bj4VarO);
                        i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                        if (i13 == 1) {
                            z = true;
                        } else if (i13 == 2) {
                            z = false;
                        } else {
                            if (i13 != 3) {
                                u.b();
                                return;
                            }
                            z = zQ;
                        }
                        bj4VarO.K(-287873620);
                        if (z) {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                            if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                                jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                            } else {
                                jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287862139);
                        if (z) {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                            if (uh1VarM109getContentColorQN2ZGVo == null) {
                                jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                            } else {
                                jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                        bj4VarO.K(-287850806);
                        if (z) {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        } else {
                            uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                            if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                                jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                            } else {
                                jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                            }
                        }
                        bj4VarO.U(false);
                        yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                        aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6.a.t);
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        StringProvider title11119 = topAppBarUiState.getTitle();
                        i14 = StringProvider.$stable;
                        String text111110 = title11119.getText(bj4VarO, i14);
                        subTitle = topAppBarUiState.getSubTitle();
                        bj4VarO.K(603575061);
                        if (subTitle == null) {
                            text = null;
                        } else {
                            text = subTitle.getText(bj4VarO, i14);
                        }
                        bj4VarO.U(false);
                        mh4<g2b> mh4Var1111110 = mh4Var4;
                        oh4<? super MetricData, g2b> oh4Var111117 = oh4Var6;
                        TopActionBarKt.m90TopActionBarNpQZenA(null, text111110, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111110, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                        bj4VarO = bj4VarO;
                        ticketStatusState = topAppBarUiState.getTicketStatusState();
                        bj4VarO.K(603606589);
                        if (ticketStatusState == null) {
                            mh4Var6 = mh4Var8;
                        } else {
                            mh4Var6 = mh4Var8;
                            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                            g2b g2bVar11119 = g2b.a;
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        oh4Var7 = oh4Var5;
                        mh4Var9 = mh4Var7;
                        oh4Var8 = oh4Var111117;
                        mh4Var10 = mh4Var1111110;
                    }
                    mh4Var11 = mh4Var6;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                    }
                }
                i3 |= 196608;
                oh4Var4 = oh4Var2;
                if ((74899 & i3) == 74898) {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title111110 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text111111 = title111110.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1111111 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var111118 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text111111, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111111, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar111110 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var111118;
                    mh4Var10 = mh4Var1111111;
                } else {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title111111 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text111112 = title111111.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1111112 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var111119 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text111112, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111112, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar111111 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var111119;
                    mh4Var10 = mh4Var1111112;
                }
                mh4Var11 = mh4Var6;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                }
            }
            i3 |= 24576;
            oh4Var3 = oh4Var;
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) == 74898) {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title111112 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text111113 = title111112.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1111113 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var1111110 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text111113, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111113, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar111112 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var1111110;
                    mh4Var10 = mh4Var1111113;
                } else {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title111113 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text111114 = title111113.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1111114 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var1111111 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text111114, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111114, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar111113 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var1111111;
                    mh4Var10 = mh4Var1111114;
                }
                mh4Var11 = mh4Var6;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                }
            }
            i3 |= 196608;
            oh4Var4 = oh4Var2;
            if ((74899 & i3) == 74898) {
                if (i15 != 0) {
                    mh4Var4 = null;
                }
                i12 = 0;
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-287893905);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new b52();
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    mh4Var7 = (mh4) objF4;
                } else {
                    mh4Var7 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-287892465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new c52();
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-287890865);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new d52();
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i10 != 0) {
                    bj4VarO.K(-287889457);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new e52(i12);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                zQ = gz3.q(bj4VarO);
                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                if (i13 == 1) {
                    z = true;
                } else if (i13 == 2) {
                    z = false;
                } else {
                    if (i13 != 3) {
                        u.b();
                        return;
                    }
                    z = zQ;
                }
                bj4VarO.K(-287873620);
                if (z) {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287862139);
                if (z) {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287850806);
                if (z) {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                StringProvider title111114 = topAppBarUiState.getTitle();
                i14 = StringProvider.$stable;
                String text111115 = title111114.getText(bj4VarO, i14);
                subTitle = topAppBarUiState.getSubTitle();
                bj4VarO.K(603575061);
                if (subTitle == null) {
                    text = null;
                } else {
                    text = subTitle.getText(bj4VarO, i14);
                }
                bj4VarO.U(false);
                mh4<g2b> mh4Var1111115 = mh4Var4;
                oh4<? super MetricData, g2b> oh4Var1111112 = oh4Var6;
                TopActionBarKt.m90TopActionBarNpQZenA(null, text111115, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111115, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                bj4VarO = bj4VarO;
                ticketStatusState = topAppBarUiState.getTicketStatusState();
                bj4VarO.K(603606589);
                if (ticketStatusState == null) {
                    mh4Var6 = mh4Var8;
                } else {
                    mh4Var6 = mh4Var8;
                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                    g2b g2bVar111114 = g2b.a;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var7 = oh4Var5;
                mh4Var9 = mh4Var7;
                oh4Var8 = oh4Var1111112;
                mh4Var10 = mh4Var1111115;
            } else {
                if (i15 != 0) {
                    mh4Var4 = null;
                }
                i12 = 0;
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-287893905);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new b52();
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    mh4Var7 = (mh4) objF4;
                } else {
                    mh4Var7 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-287892465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new c52();
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-287890865);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new d52();
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i10 != 0) {
                    bj4VarO.K(-287889457);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new e52(i12);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                zQ = gz3.q(bj4VarO);
                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                if (i13 == 1) {
                    z = true;
                } else if (i13 == 2) {
                    z = false;
                } else {
                    if (i13 != 3) {
                        u.b();
                        return;
                    }
                    z = zQ;
                }
                bj4VarO.K(-287873620);
                if (z) {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287862139);
                if (z) {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287850806);
                if (z) {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                StringProvider title111115 = topAppBarUiState.getTitle();
                i14 = StringProvider.$stable;
                String text111116 = title111115.getText(bj4VarO, i14);
                subTitle = topAppBarUiState.getSubTitle();
                bj4VarO.K(603575061);
                if (subTitle == null) {
                    text = null;
                } else {
                    text = subTitle.getText(bj4VarO, i14);
                }
                bj4VarO.U(false);
                mh4<g2b> mh4Var1111116 = mh4Var4;
                oh4<? super MetricData, g2b> oh4Var1111113 = oh4Var6;
                TopActionBarKt.m90TopActionBarNpQZenA(null, text111116, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111116, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                bj4VarO = bj4VarO;
                ticketStatusState = topAppBarUiState.getTicketStatusState();
                bj4VarO.K(603606589);
                if (ticketStatusState == null) {
                    mh4Var6 = mh4Var8;
                } else {
                    mh4Var6 = mh4Var8;
                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                    g2b g2bVar111115 = g2b.a;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var7 = oh4Var5;
                mh4Var9 = mh4Var7;
                oh4Var8 = oh4Var1111113;
                mh4Var10 = mh4Var1111116;
            }
            mh4Var11 = mh4Var6;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
            }
        }
        i3 |= 3072;
        mh4Var6 = mh4Var3;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                oh4Var3 = oh4Var;
                if (bj4VarO.j(oh4Var3)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                if ((196608 & i) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((74899 & i3) == 74898) {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title111116 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text111117 = title111116.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1111117 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var1111114 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text111117, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111117, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar111116 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var1111114;
                    mh4Var10 = mh4Var1111117;
                } else {
                    if (i15 != 0) {
                        mh4Var4 = null;
                    }
                    i12 = 0;
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-287893905);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new b52();
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        mh4Var7 = (mh4) objF4;
                    } else {
                        mh4Var7 = mh4Var5;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-287892465);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new c52();
                            bj4VarO.C(objF3);
                        }
                        mh4Var8 = (mh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        mh4Var8 = mh4Var6;
                    }
                    if (i8 != 0) {
                        bj4VarO.K(-287890865);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new d52();
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i10 != 0) {
                        bj4VarO.K(-287889457);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new e52(i12);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    zQ = gz3.q(bj4VarO);
                    i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                    if (i13 == 1) {
                        z = true;
                    } else if (i13 == 2) {
                        z = false;
                    } else {
                        if (i13 != 3) {
                            u.b();
                            return;
                        }
                        z = zQ;
                    }
                    bj4VarO.K(-287873620);
                    if (z) {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                        if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                            jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                        } else {
                            jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287862139);
                    if (z) {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                        if (uh1VarM109getContentColorQN2ZGVo == null) {
                            jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                        } else {
                            jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                    bj4VarO.K(-287850806);
                    if (z) {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    } else {
                        uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                        if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                            jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                        }
                    }
                    bj4VarO.U(false);
                    yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                    aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6.a.t);
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    StringProvider title111117 = topAppBarUiState.getTitle();
                    i14 = StringProvider.$stable;
                    String text111118 = title111117.getText(bj4VarO, i14);
                    subTitle = topAppBarUiState.getSubTitle();
                    bj4VarO.K(603575061);
                    if (subTitle == null) {
                        text = null;
                    } else {
                        text = subTitle.getText(bj4VarO, i14);
                    }
                    bj4VarO.U(false);
                    mh4<g2b> mh4Var1111118 = mh4Var4;
                    oh4<? super MetricData, g2b> oh4Var1111115 = oh4Var6;
                    TopActionBarKt.m90TopActionBarNpQZenA(null, text111118, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111118, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                    bj4VarO = bj4VarO;
                    ticketStatusState = topAppBarUiState.getTicketStatusState();
                    bj4VarO.K(603606589);
                    if (ticketStatusState == null) {
                        mh4Var6 = mh4Var8;
                    } else {
                        mh4Var6 = mh4Var8;
                        TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                        g2b g2bVar111117 = g2b.a;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var7 = oh4Var5;
                    mh4Var9 = mh4Var7;
                    oh4Var8 = oh4Var1111115;
                    mh4Var10 = mh4Var1111118;
                }
                mh4Var11 = mh4Var6;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
                }
            }
            i3 |= 196608;
            oh4Var4 = oh4Var2;
            if ((74899 & i3) == 74898) {
                if (i15 != 0) {
                    mh4Var4 = null;
                }
                i12 = 0;
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-287893905);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new b52();
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    mh4Var7 = (mh4) objF4;
                } else {
                    mh4Var7 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-287892465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new c52();
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-287890865);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new d52();
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i10 != 0) {
                    bj4VarO.K(-287889457);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new e52(i12);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                zQ = gz3.q(bj4VarO);
                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                if (i13 == 1) {
                    z = true;
                } else if (i13 == 2) {
                    z = false;
                } else {
                    if (i13 != 3) {
                        u.b();
                        return;
                    }
                    z = zQ;
                }
                bj4VarO.K(-287873620);
                if (z) {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287862139);
                if (z) {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287850806);
                if (z) {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                StringProvider title111118 = topAppBarUiState.getTitle();
                i14 = StringProvider.$stable;
                String text111119 = title111118.getText(bj4VarO, i14);
                subTitle = topAppBarUiState.getSubTitle();
                bj4VarO.K(603575061);
                if (subTitle == null) {
                    text = null;
                } else {
                    text = subTitle.getText(bj4VarO, i14);
                }
                bj4VarO.U(false);
                mh4<g2b> mh4Var1111119 = mh4Var4;
                oh4<? super MetricData, g2b> oh4Var1111116 = oh4Var6;
                TopActionBarKt.m90TopActionBarNpQZenA(null, text111119, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var1111119, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                bj4VarO = bj4VarO;
                ticketStatusState = topAppBarUiState.getTicketStatusState();
                bj4VarO.K(603606589);
                if (ticketStatusState == null) {
                    mh4Var6 = mh4Var8;
                } else {
                    mh4Var6 = mh4Var8;
                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                    g2b g2bVar111118 = g2b.a;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var7 = oh4Var5;
                mh4Var9 = mh4Var7;
                oh4Var8 = oh4Var1111116;
                mh4Var10 = mh4Var1111119;
            } else {
                if (i15 != 0) {
                    mh4Var4 = null;
                }
                i12 = 0;
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-287893905);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new b52();
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    mh4Var7 = (mh4) objF4;
                } else {
                    mh4Var7 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-287892465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new c52();
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-287890865);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new d52();
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i10 != 0) {
                    bj4VarO.K(-287889457);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new e52(i12);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                zQ = gz3.q(bj4VarO);
                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                if (i13 == 1) {
                    z = true;
                } else if (i13 == 2) {
                    z = false;
                } else {
                    if (i13 != 3) {
                        u.b();
                        return;
                    }
                    z = zQ;
                }
                bj4VarO.K(-287873620);
                if (z) {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287862139);
                if (z) {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287850806);
                if (z) {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                StringProvider title111119 = topAppBarUiState.getTitle();
                i14 = StringProvider.$stable;
                String text1111110 = title111119.getText(bj4VarO, i14);
                subTitle = topAppBarUiState.getSubTitle();
                bj4VarO.K(603575061);
                if (subTitle == null) {
                    text = null;
                } else {
                    text = subTitle.getText(bj4VarO, i14);
                }
                bj4VarO.U(false);
                mh4<g2b> mh4Var11111110 = mh4Var4;
                oh4<? super MetricData, g2b> oh4Var1111117 = oh4Var6;
                TopActionBarKt.m90TopActionBarNpQZenA(null, text1111110, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11111110, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                bj4VarO = bj4VarO;
                ticketStatusState = topAppBarUiState.getTicketStatusState();
                bj4VarO.K(603606589);
                if (ticketStatusState == null) {
                    mh4Var6 = mh4Var8;
                } else {
                    mh4Var6 = mh4Var8;
                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                    g2b g2bVar111119 = g2b.a;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var7 = oh4Var5;
                mh4Var9 = mh4Var7;
                oh4Var8 = oh4Var1111117;
                mh4Var10 = mh4Var11111110;
            }
            mh4Var11 = mh4Var6;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
            }
        }
        i3 |= 24576;
        oh4Var3 = oh4Var;
        i10 = i2 & 32;
        if (i10 != 0) {
            if ((196608 & i) == 0) {
                oh4Var4 = oh4Var2;
                if (bj4VarO.j(oh4Var4)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((74899 & i3) == 74898) {
                if (i15 != 0) {
                    mh4Var4 = null;
                }
                i12 = 0;
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-287893905);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new b52();
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    mh4Var7 = (mh4) objF4;
                } else {
                    mh4Var7 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-287892465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new c52();
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-287890865);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new d52();
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i10 != 0) {
                    bj4VarO.K(-287889457);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new e52(i12);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                zQ = gz3.q(bj4VarO);
                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                if (i13 == 1) {
                    z = true;
                } else if (i13 == 2) {
                    z = false;
                } else {
                    if (i13 != 3) {
                        u.b();
                        return;
                    }
                    z = zQ;
                }
                bj4VarO.K(-287873620);
                if (z) {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287862139);
                if (z) {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287850806);
                if (z) {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                StringProvider title1111110 = topAppBarUiState.getTitle();
                i14 = StringProvider.$stable;
                String text1111111 = title1111110.getText(bj4VarO, i14);
                subTitle = topAppBarUiState.getSubTitle();
                bj4VarO.K(603575061);
                if (subTitle == null) {
                    text = null;
                } else {
                    text = subTitle.getText(bj4VarO, i14);
                }
                bj4VarO.U(false);
                mh4<g2b> mh4Var11111111 = mh4Var4;
                oh4<? super MetricData, g2b> oh4Var1111118 = oh4Var6;
                TopActionBarKt.m90TopActionBarNpQZenA(null, text1111111, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11111111, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                bj4VarO = bj4VarO;
                ticketStatusState = topAppBarUiState.getTicketStatusState();
                bj4VarO.K(603606589);
                if (ticketStatusState == null) {
                    mh4Var6 = mh4Var8;
                } else {
                    mh4Var6 = mh4Var8;
                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                    g2b g2bVar1111110 = g2b.a;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var7 = oh4Var5;
                mh4Var9 = mh4Var7;
                oh4Var8 = oh4Var1111118;
                mh4Var10 = mh4Var11111111;
            } else {
                if (i15 != 0) {
                    mh4Var4 = null;
                }
                i12 = 0;
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-287893905);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new b52();
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    mh4Var7 = (mh4) objF4;
                } else {
                    mh4Var7 = mh4Var5;
                }
                if (i6 != 0) {
                    bj4VarO.K(-287892465);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new c52();
                        bj4VarO.C(objF3);
                    }
                    mh4Var8 = (mh4) objF3;
                    bj4VarO.U(false);
                } else {
                    mh4Var8 = mh4Var6;
                }
                if (i8 != 0) {
                    bj4VarO.K(-287890865);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new d52();
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i10 != 0) {
                    bj4VarO.K(-287889457);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new e52(i12);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                zQ = gz3.q(bj4VarO);
                i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
                if (i13 == 1) {
                    z = true;
                } else if (i13 == 2) {
                    z = false;
                } else {
                    if (i13 != 3) {
                        u.b();
                        return;
                    }
                    z = zQ;
                }
                bj4VarO.K(-287873620);
                if (z) {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                    if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                        jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                    } else {
                        jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287862139);
                if (z) {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                    if (uh1VarM109getContentColorQN2ZGVo == null) {
                        jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                    } else {
                        jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
                bj4VarO.K(-287850806);
                if (z) {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                } else {
                    uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                    if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                        jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                    }
                }
                bj4VarO.U(false);
                yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6.a.t);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                StringProvider title1111111 = topAppBarUiState.getTitle();
                i14 = StringProvider.$stable;
                String text1111112 = title1111111.getText(bj4VarO, i14);
                subTitle = topAppBarUiState.getSubTitle();
                bj4VarO.K(603575061);
                if (subTitle == null) {
                    text = null;
                } else {
                    text = subTitle.getText(bj4VarO, i14);
                }
                bj4VarO.U(false);
                mh4<g2b> mh4Var11111112 = mh4Var4;
                oh4<? super MetricData, g2b> oh4Var1111119 = oh4Var6;
                TopActionBarKt.m90TopActionBarNpQZenA(null, text1111112, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11111112, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
                bj4VarO = bj4VarO;
                ticketStatusState = topAppBarUiState.getTicketStatusState();
                bj4VarO.K(603606589);
                if (ticketStatusState == null) {
                    mh4Var6 = mh4Var8;
                } else {
                    mh4Var6 = mh4Var8;
                    TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                    g2b g2bVar1111111 = g2b.a;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var7 = oh4Var5;
                mh4Var9 = mh4Var7;
                oh4Var8 = oh4Var1111119;
                mh4Var10 = mh4Var11111112;
            }
            mh4Var11 = mh4Var6;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
            }
        }
        i3 |= 196608;
        oh4Var4 = oh4Var2;
        if ((74899 & i3) == 74898) {
            if (i15 != 0) {
                mh4Var4 = null;
            }
            i12 = 0;
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(-287893905);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new b52();
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                mh4Var7 = (mh4) objF4;
            } else {
                mh4Var7 = mh4Var5;
            }
            if (i6 != 0) {
                bj4VarO.K(-287892465);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new c52();
                    bj4VarO.C(objF3);
                }
                mh4Var8 = (mh4) objF3;
                bj4VarO.U(false);
            } else {
                mh4Var8 = mh4Var6;
            }
            if (i8 != 0) {
                bj4VarO.K(-287890865);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new d52();
                    bj4VarO.C(objF2);
                }
                oh4Var5 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var5 = oh4Var3;
            }
            if (i10 != 0) {
                bj4VarO.K(-287889457);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new e52(i12);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                oh4Var6 = (oh4) objF;
            } else {
                oh4Var6 = oh4Var4;
            }
            zQ = gz3.q(bj4VarO);
            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
            if (i13 == 1) {
                z = true;
            } else if (i13 == 2) {
                z = false;
            } else {
                if (i13 != 3) {
                    u.b();
                    return;
                }
                z = zQ;
            }
            bj4VarO.K(-287873620);
            if (z) {
                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                } else {
                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                }
            } else {
                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                } else {
                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                }
            }
            bj4VarO.U(false);
            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
            bj4VarO.K(-287862139);
            if (z) {
                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                if (uh1VarM109getContentColorQN2ZGVo == null) {
                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                } else {
                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                }
            } else {
                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                if (uh1VarM109getContentColorQN2ZGVo == null) {
                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                } else {
                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                }
            }
            bj4VarO.U(false);
            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
            bj4VarO.K(-287850806);
            if (z) {
                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                } else {
                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                }
            } else {
                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                } else {
                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                }
            }
            bj4VarO.U(false);
            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6.a.t);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            StringProvider title1111112 = topAppBarUiState.getTitle();
            i14 = StringProvider.$stable;
            String text1111113 = title1111112.getText(bj4VarO, i14);
            subTitle = topAppBarUiState.getSubTitle();
            bj4VarO.K(603575061);
            if (subTitle == null) {
                text = null;
            } else {
                text = subTitle.getText(bj4VarO, i14);
            }
            bj4VarO.U(false);
            mh4<g2b> mh4Var11111113 = mh4Var4;
            oh4<? super MetricData, g2b> oh4Var11111110 = oh4Var6;
            TopActionBarKt.m90TopActionBarNpQZenA(null, text1111113, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11111113, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
            bj4VarO = bj4VarO;
            ticketStatusState = topAppBarUiState.getTicketStatusState();
            bj4VarO.K(603606589);
            if (ticketStatusState == null) {
                mh4Var6 = mh4Var8;
            } else {
                mh4Var6 = mh4Var8;
                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                g2b g2bVar1111112 = g2b.a;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            oh4Var7 = oh4Var5;
            mh4Var9 = mh4Var7;
            oh4Var8 = oh4Var11111110;
            mh4Var10 = mh4Var11111113;
        } else {
            if (i15 != 0) {
                mh4Var4 = null;
            }
            i12 = 0;
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(-287893905);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new b52();
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                mh4Var7 = (mh4) objF4;
            } else {
                mh4Var7 = mh4Var5;
            }
            if (i6 != 0) {
                bj4VarO.K(-287892465);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new c52();
                    bj4VarO.C(objF3);
                }
                mh4Var8 = (mh4) objF3;
                bj4VarO.U(false);
            } else {
                mh4Var8 = mh4Var6;
            }
            if (i8 != 0) {
                bj4VarO.K(-287890865);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new d52();
                    bj4VarO.C(objF2);
                }
                oh4Var5 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var5 = oh4Var3;
            }
            if (i10 != 0) {
                bj4VarO.K(-287889457);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new e52(i12);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                oh4Var6 = (oh4) objF;
            } else {
                oh4Var6 = oh4Var4;
            }
            zQ = gz3.q(bj4VarO);
            i13 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
            if (i13 == 1) {
                z = true;
            } else if (i13 == 2) {
                z = false;
            } else {
                if (i13 != 3) {
                    u.b();
                    return;
                }
                z = zQ;
            }
            bj4VarO.K(-287873620);
            if (z) {
                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                } else {
                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                }
            } else {
                uh1VarM107getBackgroundColorQN2ZGVo = topAppBarUiState.m107getBackgroundColorQN2ZGVo();
                if (uh1VarM107getBackgroundColorQN2ZGVo == null) {
                    jM767getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m767getHeader0d7_KjU();
                } else {
                    jM767getHeader0d7_KjU = uh1VarM107getBackgroundColorQN2ZGVo.a;
                }
            }
            bj4VarO.U(false);
            yz9VarA = tq9.a(jM767getHeader0d7_KjU, null, "bgColorState", bj4VarO, 384, 10);
            bj4VarO.K(-287862139);
            if (z) {
                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                if (uh1VarM109getContentColorQN2ZGVo == null) {
                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                } else {
                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                }
            } else {
                uh1VarM109getContentColorQN2ZGVo = topAppBarUiState.m109getContentColorQN2ZGVo();
                if (uh1VarM109getContentColorQN2ZGVo == null) {
                    jM771getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m771getOnHeader0d7_KjU();
                } else {
                    jM771getOnHeader0d7_KjU = uh1VarM109getContentColorQN2ZGVo.a;
                }
            }
            bj4VarO.U(false);
            yz9VarA2 = tq9.a(jM771getOnHeader0d7_KjU, null, "contentColorState", bj4VarO, 384, 10);
            bj4VarO.K(-287850806);
            if (z) {
                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                } else {
                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                }
            } else {
                uh1VarM111getSubTitleColorQN2ZGVo = topAppBarUiState.m111getSubTitleColorQN2ZGVo();
                if (uh1VarM111getSubTitleColorQN2ZGVo == null) {
                    jB = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                } else {
                    jB = uh1VarM111getSubTitleColorQN2ZGVo.a;
                }
            }
            bj4VarO.U(false);
            yz9VarA3 = tq9.a(jB, null, "subTitleColorState", bj4VarO, 384, 10);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6.a.t);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            StringProvider title1111113 = topAppBarUiState.getTitle();
            i14 = StringProvider.$stable;
            String text1111114 = title1111113.getText(bj4VarO, i14);
            subTitle = topAppBarUiState.getSubTitle();
            bj4VarO.K(603575061);
            if (subTitle == null) {
                text = null;
            } else {
                text = subTitle.getText(bj4VarO, i14);
            }
            bj4VarO.U(false);
            mh4<g2b> mh4Var11111114 = mh4Var4;
            oh4<? super MetricData, g2b> oh4Var11111111 = oh4Var6;
            TopActionBarKt.m90TopActionBarNpQZenA(null, text1111114, text, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), mh4Var11111114, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((uh1) yz9VarA.getValue()).a, ((uh1) yz9VarA2.getValue()).a, ((uh1) yz9VarA3.getValue()).a, mh4Var7, gr1.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, oh4Var5, yz9VarA2, oh4Var6), bj4VarO), bj4VarO, (i3 << 12) & 458752, ((i3 >> 3) & 112) | 384, 1);
            bj4VarO = bj4VarO;
            ticketStatusState = topAppBarUiState.getTicketStatusState();
            bj4VarO.K(603606589);
            if (ticketStatusState == null) {
                mh4Var6 = mh4Var8;
            } else {
                mh4Var6 = mh4Var8;
                TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mh4Var6, true, null, bj4VarO, ((i3 >> 6) & 112) | 384, 8);
                g2b g2bVar1111113 = g2b.a;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            oh4Var7 = oh4Var5;
            mh4Var9 = mh4Var7;
            oh4Var8 = oh4Var11111111;
            mh4Var10 = mh4Var11111114;
        }
        mh4Var11 = mh4Var6;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new f52(topAppBarUiState, mh4Var10, mh4Var9, mh4Var11, oh4Var7, oh4Var8, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationTopAppBar$lambda$10(TopAppBarUiState topAppBarUiState, mh4 mh4Var, mh4 mh4Var2, mh4 mh4Var3, oh4 oh4Var, oh4 oh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        ConversationTopAppBar(topAppBarUiState, mh4Var, mh4Var2, mh4Var3, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationTopAppBar$lambda$5$lambda$4(HeaderMenuItem headerMenuItem) {
        headerMenuItem.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationTopAppBar$lambda$7$lambda$6(MetricData metricData) {
        metricData.getClass();
        return g2b.a;
    }
}
