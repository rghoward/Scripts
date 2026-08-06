package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ac4;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.es7;
import defpackage.fda;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.iw;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.vaa;
import defpackage.vp0;
import defpackage.ww9;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TicketStatusRowKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.block.BlockExtensionsKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketStatusRowKt {
    @IntercomPreviews
    public static final void SimplePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1725833053);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketStatusRowKt.INSTANCE.m269getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new vp0(i, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SimplePreview$lambda$4(int i, jt1 jt1Var, int i2) {
        SimplePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0245  */
    /* JADX WARN: Code duplicated, block: B:104:0x0276  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:108:0x0320  */
    /* JADX WARN: Code duplicated, block: B:110:0x0327  */
    /* JADX WARN: Code duplicated, block: B:111:0x032b  */
    /* JADX WARN: Code duplicated, block: B:116:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:118:0x03db  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x0276, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x02ab, please report this as an issue */
    public static final void TicketStatusRow(final String str, final String str2, String str3, ox6 ox6Var, String str4, String str5, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        String str6;
        int i5;
        int i6;
        String str7;
        int i7;
        int i8;
        ox6.a aVar;
        ox6 ox6Var3;
        String str8;
        c30.c cVar;
        String str9;
        ox6 ox6Var4;
        String str10;
        String str11;
        String lowerCase;
        CharSequence charSequence;
        iw annotatedString;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        String str12;
        ox6 ox6Var5;
        final String str13;
        final String str14;
        xj8 xj8VarW;
        str.getClass();
        str2.getClass();
        str3.getClass();
        bj4 bj4VarO = jt1Var.o(-1382529243);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(str3) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    str6 = str4;
                    if (bj4VarO.J(str6)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        str7 = str5;
                        if (bj4VarO.J(str7)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((i8 & 74899) == 74898 || !bj4VarO.r()) {
                        aVar = ox6.a.t;
                        if (i9 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            str8 = null;
                        } else {
                            str8 = str6;
                        }
                        if (i6 != 0) {
                            str7 = null;
                        }
                        cVar = c30.d;
                        if (str8 != null || str7 == null) {
                            str9 = str7;
                            ox6Var4 = ox6Var3;
                            str10 = str8;
                            str11 = str3;
                            bj4VarO.K(1098662774);
                            lowerCase = str2.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (str.equals(MetricTracker.Action.SUBMITTED)) {
                                bj4VarO.K(1098733020);
                                charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(1098981609);
                                charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                                bj4VarO.U(false);
                            }
                            Spanned spannedFromHtml = Html.fromHtml(charSequence.toString(), 0);
                            spannedFromHtml.getClass();
                            annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                            ox6 ox6VarP = ir9.p(ir9.c(ox6Var4, 1.0f));
                            ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarP);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
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
                            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            es7 es7VarA = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i10 = IntercomTheme.$stable;
                            str12 = str10;
                            m65.b(es7VarA, null, null, intercomTheme.getColors(bj4VarO, i10).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                            b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                            ox6Var5 = ox6Var4;
                            mia.c(annotatedString, null, intercomTheme.getColors(bj4VarO, i10).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme.getTypography(bj4VarO, i10).getType04Point5(), bj4VarO, 0, 0, 262138);
                            bj4VarO = bj4VarO;
                            bj4VarO.U(true);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1097246694);
                            ox6 ox6VarP2 = ir9.p(ir9.c(ox6Var3, 1.0f));
                            aj1 aj1VarA = yi1.a(cVar, di.a.n, bj4VarO, 54);
                            int iHashCode2 = Long.hashCode(bj4VarO.T);
                            kw7 kw7VarP2 = bj4VarO.P();
                            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarP2);
                            bt1.c.getClass();
                            qr5.a aVar3 = bt1.a.b;
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar3);
                            } else {
                                bj4VarO.z();
                            }
                            bt1.a.c cVar2 = bt1.a.f;
                            rd7.d(bj4VarO, cVar2, aj1VarA);
                            bt1.a.e eVar = bt1.a.e;
                            rd7.d(bj4VarO, eVar, kw7VarP2);
                            Integer numValueOf = Integer.valueOf(iHashCode2);
                            bt1.a.b bVar = bt1.a.g;
                            rd7.d(bj4VarO, bVar, numValueOf);
                            bt1.a.C0034a c0034a = bt1.a.h;
                            rd7.c(bj4VarO, c0034a);
                            bt1.a.d dVar = bt1.a.d;
                            rd7.d(bj4VarO, dVar, ox6VarC2);
                            ny8 ny8VarA2 = ly8.a(c30.a, di.a.j, bj4VarO, 0);
                            int iHashCode3 = Long.hashCode(bj4VarO.T);
                            kw7 kw7VarP3 = bj4VarO.P();
                            ox6 ox6VarC3 = it1.c(bj4VarO, aVar);
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            String str15 = str7;
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar3);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, cVar2, ny8VarA2);
                            rd7.d(bj4VarO, eVar, kw7VarP3);
                            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                            rd7.d(bj4VarO, dVar, ox6VarC3);
                            es7 es7VarA2 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                            int i11 = IntercomTheme.$stable;
                            m65.b(es7VarA2, null, null, intercomTheme2.getColors(bj4VarO, i11).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                            b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                            ox6Var5 = ox6Var3;
                            str11 = str3;
                            TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(str15, str11, null, null, intercomTheme2.getTypography(bj4VarO, i11).getType04Point5(), intercomTheme2.getColors(bj4VarO, i11).getText().m827getMuted0d7_KjU(), 2, 1, new vaa(3), bj4VarO, ((i8 >> 15) & 14) | 14155776 | ((i8 >> 3) & 112), 12);
                            str9 = str15;
                            bj4VarO.U(true);
                            b47.b(bj4VarO, ir9.d(aVar, 4.0f));
                            String str16 = str8;
                            mia.b(str16, null, ac4.b(intercomTheme2, bj4VarO, i11), 0L, ob4.B, 0L, new vaa(3), 0L, 2, false, 1, 0, null, intercomTheme2.getTypography(bj4VarO, i11).getType04Point5(), bj4VarO, ((i8 >> 12) & 14) | 1572864, 24960, 109498);
                            bj4VarO = bj4VarO;
                            bj4VarO.U(true);
                            bj4VarO.U(false);
                            str12 = str16;
                        }
                        str13 = str12;
                        str14 = str9;
                        ox6Var2 = ox6Var5;
                    } else {
                        bj4VarO.u();
                        str11 = str3;
                        str13 = str6;
                        str14 = str7;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        final String str17 = str11;
                        final ox6 ox6Var6 = ox6Var2;
                        xj8VarW.d = new ci4() { // from class: ima
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TicketStatusRowKt.TicketStatusRow$lambda$3(str, str2, str17, ox6Var6, str13, str14, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                str7 = str5;
                i8 = i3;
                if ((i8 & 74899) == 74898) {
                    aVar = ox6.a.t;
                    if (i9 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (i6 != 0) {
                        str7 = null;
                    }
                    cVar = c30.d;
                    if (str8 != null) {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml2 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml2.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP3 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP3);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA3 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA3, null, null, intercomTheme3.getColors(bj4VarO, i12).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme3.getColors(bj4VarO, i12).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme3.getTypography(bj4VarO, i12).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    } else {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml3 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml3.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml3, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP4 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP4);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA4 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                        int i13 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA4, null, null, intercomTheme4.getColors(bj4VarO, i13).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme4.getColors(bj4VarO, i13).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme4.getTypography(bj4VarO, i13).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    str13 = str12;
                    str14 = str9;
                    ox6Var2 = ox6Var5;
                } else {
                    aVar = ox6.a.t;
                    if (i9 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (i6 != 0) {
                        str7 = null;
                    }
                    cVar = c30.d;
                    if (str8 != null) {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml4 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml4.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml4, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP5 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP5);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA5 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                        int i14 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA5, null, null, intercomTheme5.getColors(bj4VarO, i14).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme5.getColors(bj4VarO, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme5.getTypography(bj4VarO, i14).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    } else {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml5 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml5.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml5, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP6 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP6);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA6 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                        int i15 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA6, null, null, intercomTheme6.getColors(bj4VarO, i15).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme6.getColors(bj4VarO, i15).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme6.getTypography(bj4VarO, i15).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    str13 = str12;
                    str14 = str9;
                    ox6Var2 = ox6Var5;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    final String str18 = str11;
                    final ox6 ox6Var7 = ox6Var2;
                    xj8VarW.d = new ci4() { // from class: ima
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketStatusRowKt.TicketStatusRow$lambda$3(str, str2, str18, ox6Var7, str13, str14, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            str6 = str4;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    str7 = str5;
                    if (bj4VarO.J(str7)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 74899) == 74898) {
                    aVar = ox6.a.t;
                    if (i9 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (i6 != 0) {
                        str7 = null;
                    }
                    cVar = c30.d;
                    if (str8 != null) {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml6 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml6.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml6, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP7 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP7);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA7 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                        int i16 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA7, null, null, intercomTheme7.getColors(bj4VarO, i16).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme7.getColors(bj4VarO, i16).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme7.getTypography(bj4VarO, i16).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    } else {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml7 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml7.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml7, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP8 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP8);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA8 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                        int i17 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA8, null, null, intercomTheme8.getColors(bj4VarO, i17).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme8.getColors(bj4VarO, i17).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme8.getTypography(bj4VarO, i17).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    str13 = str12;
                    str14 = str9;
                    ox6Var2 = ox6Var5;
                } else {
                    aVar = ox6.a.t;
                    if (i9 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (i6 != 0) {
                        str7 = null;
                    }
                    cVar = c30.d;
                    if (str8 != null) {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml8 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml8.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml8, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP9 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP9);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA9 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                        int i18 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA9, null, null, intercomTheme9.getColors(bj4VarO, i18).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme9.getColors(bj4VarO, i18).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme9.getTypography(bj4VarO, i18).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    } else {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml9 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml9.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml9, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP10 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP10);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA10 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                        int i19 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA10, null, null, intercomTheme10.getColors(bj4VarO, i19).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme10.getColors(bj4VarO, i19).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme10.getTypography(bj4VarO, i19).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    str13 = str12;
                    str14 = str9;
                    ox6Var2 = ox6Var5;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    final String str19 = str11;
                    final ox6 ox6Var8 = ox6Var2;
                    xj8VarW.d = new ci4() { // from class: ima
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketStatusRowKt.TicketStatusRow$lambda$3(str, str2, str19, ox6Var8, str13, str14, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            str7 = str5;
            i8 = i3;
            if ((i8 & 74899) == 74898) {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (i6 != 0) {
                    str7 = null;
                }
                cVar = c30.d;
                if (str8 != null) {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml10 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml10.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml10, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP11 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP11);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA11 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                    int i110 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA11, null, null, intercomTheme11.getColors(bj4VarO, i110).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme11.getColors(bj4VarO, i110).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme11.getTypography(bj4VarO, i110).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                } else {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml11 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml11.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml11, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP12 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP12);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA12 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                    int i111 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA12, null, null, intercomTheme12.getColors(bj4VarO, i111).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme12.getColors(bj4VarO, i111).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme12.getTypography(bj4VarO, i111).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                str13 = str12;
                str14 = str9;
                ox6Var2 = ox6Var5;
            } else {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (i6 != 0) {
                    str7 = null;
                }
                cVar = c30.d;
                if (str8 != null) {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml12 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml12.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml12, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP13 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP13);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA13 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                    int i112 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA13, null, null, intercomTheme13.getColors(bj4VarO, i112).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme13.getColors(bj4VarO, i112).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme13.getTypography(bj4VarO, i112).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                } else {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml13 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml13.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml13, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP14 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP14);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA14 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                    int i113 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA14, null, null, intercomTheme14.getColors(bj4VarO, i113).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme14.getColors(bj4VarO, i113).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme14.getTypography(bj4VarO, i113).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                str13 = str12;
                str14 = str9;
                ox6Var2 = ox6Var5;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                final String str110 = str11;
                final ox6 ox6Var9 = ox6Var2;
                xj8VarW.d = new ci4() { // from class: ima
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketStatusRowKt.TicketStatusRow$lambda$3(str, str2, str110, ox6Var9, str13, str14, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        ox6Var2 = ox6Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                str6 = str4;
                if (bj4VarO.J(str6)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    str7 = str5;
                    if (bj4VarO.J(str7)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 74899) == 74898) {
                    aVar = ox6.a.t;
                    if (i9 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (i6 != 0) {
                        str7 = null;
                    }
                    cVar = c30.d;
                    if (str8 != null) {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml14 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml14.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml14, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP15 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP15);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA15 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                        int i114 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA15, null, null, intercomTheme15.getColors(bj4VarO, i114).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme15.getColors(bj4VarO, i114).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme15.getTypography(bj4VarO, i114).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    } else {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml15 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml15.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml15, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP16 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP16);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA16 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme16 = IntercomTheme.INSTANCE;
                        int i115 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA16, null, null, intercomTheme16.getColors(bj4VarO, i115).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme16.getColors(bj4VarO, i115).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme16.getTypography(bj4VarO, i115).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    str13 = str12;
                    str14 = str9;
                    ox6Var2 = ox6Var5;
                } else {
                    aVar = ox6.a.t;
                    if (i9 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        str8 = null;
                    } else {
                        str8 = str6;
                    }
                    if (i6 != 0) {
                        str7 = null;
                    }
                    cVar = c30.d;
                    if (str8 != null) {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml16 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml16.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml16, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP17 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP17);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA17 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme17 = IntercomTheme.INSTANCE;
                        int i116 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA17, null, null, intercomTheme17.getColors(bj4VarO, i116).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme17.getColors(bj4VarO, i116).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme17.getTypography(bj4VarO, i116).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    } else {
                        str9 = str7;
                        ox6Var4 = ox6Var3;
                        str10 = str8;
                        str11 = str3;
                        bj4VarO.K(1098662774);
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (str.equals(MetricTracker.Action.SUBMITTED)) {
                            bj4VarO.K(1098733020);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(1098981609);
                            charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                            bj4VarO.U(false);
                        }
                        Spanned spannedFromHtml17 = Html.fromHtml(charSequence.toString(), 0);
                        spannedFromHtml17.getClass();
                        annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml17, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                        ox6 ox6VarP18 = ir9.p(ir9.c(ox6Var4, 1.0f));
                        ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarP18);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        es7 es7VarA18 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                        IntercomTheme intercomTheme18 = IntercomTheme.INSTANCE;
                        int i117 = IntercomTheme.$stable;
                        str12 = str10;
                        m65.b(es7VarA18, null, null, intercomTheme18.getColors(bj4VarO, i117).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        ox6Var5 = ox6Var4;
                        mia.c(annotatedString, null, intercomTheme18.getColors(bj4VarO, i117).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme18.getTypography(bj4VarO, i117).getType04Point5(), bj4VarO, 0, 0, 262138);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(false);
                    }
                    str13 = str12;
                    str14 = str9;
                    ox6Var2 = ox6Var5;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    final String str111 = str11;
                    final ox6 ox6Var10 = ox6Var2;
                    xj8VarW.d = new ci4() { // from class: ima
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketStatusRowKt.TicketStatusRow$lambda$3(str, str2, str111, ox6Var10, str13, str14, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            str7 = str5;
            i8 = i3;
            if ((i8 & 74899) == 74898) {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (i6 != 0) {
                    str7 = null;
                }
                cVar = c30.d;
                if (str8 != null) {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml18 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml18.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml18, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP19 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP19);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA19 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme19 = IntercomTheme.INSTANCE;
                    int i118 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA19, null, null, intercomTheme19.getColors(bj4VarO, i118).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme19.getColors(bj4VarO, i118).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme19.getTypography(bj4VarO, i118).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                } else {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml19 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml19.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml19, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP110 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP110);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA110 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme110 = IntercomTheme.INSTANCE;
                    int i119 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA110, null, null, intercomTheme110.getColors(bj4VarO, i119).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme110.getColors(bj4VarO, i119).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme110.getTypography(bj4VarO, i119).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                str13 = str12;
                str14 = str9;
                ox6Var2 = ox6Var5;
            } else {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (i6 != 0) {
                    str7 = null;
                }
                cVar = c30.d;
                if (str8 != null) {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml110 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml110.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml110, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP111 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP111);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA111 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme111 = IntercomTheme.INSTANCE;
                    int i1110 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA111, null, null, intercomTheme111.getColors(bj4VarO, i1110).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme111.getColors(bj4VarO, i1110).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme111.getTypography(bj4VarO, i1110).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                } else {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml111 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml111.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml111, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP112 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP112);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA112 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme112 = IntercomTheme.INSTANCE;
                    int i1111 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA112, null, null, intercomTheme112.getColors(bj4VarO, i1111).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme112.getColors(bj4VarO, i1111).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme112.getTypography(bj4VarO, i1111).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                str13 = str12;
                str14 = str9;
                ox6Var2 = ox6Var5;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                final String str112 = str11;
                final ox6 ox6Var11 = ox6Var2;
                xj8VarW.d = new ci4() { // from class: ima
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketStatusRowKt.TicketStatusRow$lambda$3(str, str2, str112, ox6Var11, str13, str14, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        str6 = str4;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                str7 = str5;
                if (bj4VarO.J(str7)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 74899) == 74898) {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (i6 != 0) {
                    str7 = null;
                }
                cVar = c30.d;
                if (str8 != null) {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml112 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml112.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml112, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP113 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP113);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA113 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme113 = IntercomTheme.INSTANCE;
                    int i1112 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA113, null, null, intercomTheme113.getColors(bj4VarO, i1112).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme113.getColors(bj4VarO, i1112).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme113.getTypography(bj4VarO, i1112).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                } else {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml113 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml113.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml113, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP114 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP114);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA114 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme114 = IntercomTheme.INSTANCE;
                    int i1113 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA114, null, null, intercomTheme114.getColors(bj4VarO, i1113).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme114.getColors(bj4VarO, i1113).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme114.getTypography(bj4VarO, i1113).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                str13 = str12;
                str14 = str9;
                ox6Var2 = ox6Var5;
            } else {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    str8 = null;
                } else {
                    str8 = str6;
                }
                if (i6 != 0) {
                    str7 = null;
                }
                cVar = c30.d;
                if (str8 != null) {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml114 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml114.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml114, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP115 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP115);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA115 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme115 = IntercomTheme.INSTANCE;
                    int i1114 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA115, null, null, intercomTheme115.getColors(bj4VarO, i1114).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme115.getColors(bj4VarO, i1114).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme115.getTypography(bj4VarO, i1114).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                } else {
                    str9 = str7;
                    ox6Var4 = ox6Var3;
                    str10 = str8;
                    str11 = str3;
                    bj4VarO.K(1098662774);
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (str.equals(MetricTracker.Action.SUBMITTED)) {
                        bj4VarO.K(1098733020);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1098981609);
                        charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                        bj4VarO.U(false);
                    }
                    Spanned spannedFromHtml115 = Html.fromHtml(charSequence.toString(), 0);
                    spannedFromHtml115.getClass();
                    annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml115, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                    ox6 ox6VarP116 = ir9.p(ir9.c(ox6Var4, 1.0f));
                    ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarP116);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    es7 es7VarA116 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme116 = IntercomTheme.INSTANCE;
                    int i1115 = IntercomTheme.$stable;
                    str12 = str10;
                    m65.b(es7VarA116, null, null, intercomTheme116.getColors(bj4VarO, i1115).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    ox6Var5 = ox6Var4;
                    mia.c(annotatedString, null, intercomTheme116.getColors(bj4VarO, i1115).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme116.getTypography(bj4VarO, i1115).getType04Point5(), bj4VarO, 0, 0, 262138);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                }
                str13 = str12;
                str14 = str9;
                ox6Var2 = ox6Var5;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                final String str113 = str11;
                final ox6 ox6Var12 = ox6Var2;
                xj8VarW.d = new ci4() { // from class: ima
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketStatusRowKt.TicketStatusRow$lambda$3(str, str2, str113, ox6Var12, str13, str14, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        str7 = str5;
        i8 = i3;
        if ((i8 & 74899) == 74898) {
            aVar = ox6.a.t;
            if (i9 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i4 != 0) {
                str8 = null;
            } else {
                str8 = str6;
            }
            if (i6 != 0) {
                str7 = null;
            }
            cVar = c30.d;
            if (str8 != null) {
                str9 = str7;
                ox6Var4 = ox6Var3;
                str10 = str8;
                str11 = str3;
                bj4VarO.K(1098662774);
                lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (str.equals(MetricTracker.Action.SUBMITTED)) {
                    bj4VarO.K(1098733020);
                    charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1098981609);
                    charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                    bj4VarO.U(false);
                }
                Spanned spannedFromHtml116 = Html.fromHtml(charSequence.toString(), 0);
                spannedFromHtml116.getClass();
                annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml116, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                ox6 ox6VarP117 = ir9.p(ir9.c(ox6Var4, 1.0f));
                ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarP117);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                es7 es7VarA117 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                IntercomTheme intercomTheme117 = IntercomTheme.INSTANCE;
                int i1116 = IntercomTheme.$stable;
                str12 = str10;
                m65.b(es7VarA117, null, null, intercomTheme117.getColors(bj4VarO, i1116).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                ox6Var5 = ox6Var4;
                mia.c(annotatedString, null, intercomTheme117.getColors(bj4VarO, i1116).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme117.getTypography(bj4VarO, i1116).getType04Point5(), bj4VarO, 0, 0, 262138);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(false);
            } else {
                str9 = str7;
                ox6Var4 = ox6Var3;
                str10 = str8;
                str11 = str3;
                bj4VarO.K(1098662774);
                lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (str.equals(MetricTracker.Action.SUBMITTED)) {
                    bj4VarO.K(1098733020);
                    charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1098981609);
                    charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                    bj4VarO.U(false);
                }
                Spanned spannedFromHtml117 = Html.fromHtml(charSequence.toString(), 0);
                spannedFromHtml117.getClass();
                annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml117, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                ox6 ox6VarP118 = ir9.p(ir9.c(ox6Var4, 1.0f));
                ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarP118);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                es7 es7VarA118 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                IntercomTheme intercomTheme118 = IntercomTheme.INSTANCE;
                int i1117 = IntercomTheme.$stable;
                str12 = str10;
                m65.b(es7VarA118, null, null, intercomTheme118.getColors(bj4VarO, i1117).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                ox6Var5 = ox6Var4;
                mia.c(annotatedString, null, intercomTheme118.getColors(bj4VarO, i1117).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme118.getTypography(bj4VarO, i1117).getType04Point5(), bj4VarO, 0, 0, 262138);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(false);
            }
            str13 = str12;
            str14 = str9;
            ox6Var2 = ox6Var5;
        } else {
            aVar = ox6.a.t;
            if (i9 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i4 != 0) {
                str8 = null;
            } else {
                str8 = str6;
            }
            if (i6 != 0) {
                str7 = null;
            }
            cVar = c30.d;
            if (str8 != null) {
                str9 = str7;
                ox6Var4 = ox6Var3;
                str10 = str8;
                str11 = str3;
                bj4VarO.K(1098662774);
                lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (str.equals(MetricTracker.Action.SUBMITTED)) {
                    bj4VarO.K(1098733020);
                    charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1098981609);
                    charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                    bj4VarO.U(false);
                }
                Spanned spannedFromHtml118 = Html.fromHtml(charSequence.toString(), 0);
                spannedFromHtml118.getClass();
                annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml118, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                ox6 ox6VarP119 = ir9.p(ir9.c(ox6Var4, 1.0f));
                ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarP119);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                es7 es7VarA119 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                IntercomTheme intercomTheme119 = IntercomTheme.INSTANCE;
                int i1118 = IntercomTheme.$stable;
                str12 = str10;
                m65.b(es7VarA119, null, null, intercomTheme119.getColors(bj4VarO, i1118).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                ox6Var5 = ox6Var4;
                mia.c(annotatedString, null, intercomTheme119.getColors(bj4VarO, i1118).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme119.getTypography(bj4VarO, i1118).getType04Point5(), bj4VarO, 0, 0, 262138);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(false);
            } else {
                str9 = str7;
                ox6Var4 = ox6Var3;
                str10 = str8;
                str11 = str3;
                bj4VarO.K(1098662774);
                lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (str.equals(MetricTracker.Action.SUBMITTED)) {
                    bj4VarO.K(1098733020);
                    charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_submitted).put("submitted_status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1098981609);
                    charSequence = Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_change_event).put("status", "<b>" + lowerCase + "</b>").put("timestamp", str11).format();
                    bj4VarO.U(false);
                }
                Spanned spannedFromHtml119 = Html.fromHtml(charSequence.toString(), 0);
                spannedFromHtml119.getClass();
                annotatedString = BlockExtensionsKt.toAnnotatedString(spannedFromHtml119, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null);
                ox6 ox6VarP1110 = ir9.p(ir9.c(ox6Var4, 1.0f));
                ny8VarA = ly8.a(cVar, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarP1110);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                es7 es7VarA1110 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                IntercomTheme intercomTheme1110 = IntercomTheme.INSTANCE;
                int i1119 = IntercomTheme.$stable;
                str12 = str10;
                m65.b(es7VarA1110, null, null, intercomTheme1110.getColors(bj4VarO, i1119).getIcon().m809getMuted0d7_KjU(), bj4VarO, 56, 4);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                ox6Var5 = ox6Var4;
                mia.c(annotatedString, null, intercomTheme1110.getColors(bj4VarO, i1119).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, intercomTheme1110.getTypography(bj4VarO, i1119).getType04Point5(), bj4VarO, 0, 0, 262138);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(false);
            }
            str13 = str12;
            str14 = str9;
            ox6Var2 = ox6Var5;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final String str114 = str11;
            final ox6 ox6Var13 = ox6Var2;
            xj8VarW.d = new ci4() { // from class: ima
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketStatusRowKt.TicketStatusRow$lambda$3(str, str2, str114, ox6Var13, str13, str14, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketStatusRow$lambda$3(String str, String str2, String str3, ox6 ox6Var, String str4, String str5, int i, int i2, jt1 jt1Var, int i3) {
        TicketStatusRow(str, str2, str3, ox6Var, str4, str5, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
