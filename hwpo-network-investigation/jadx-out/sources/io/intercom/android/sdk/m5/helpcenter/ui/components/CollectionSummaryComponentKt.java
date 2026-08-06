package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kk;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.th1;
import defpackage.u7d;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z2a;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionSummaryComponentKt;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CollectionSummaryComponentKt {
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0186  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x022d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0234  */
    /* JADX WARN: Code duplicated, block: B:61:0x0238  */
    /* JADX WARN: Code duplicated, block: B:65:0x02b5 A[LOOP:0: B:63:0x02af->B:65:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:71:0x0309  */
    /* JADX WARN: Code duplicated, block: B:73:0x030e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0313  */
    /* JADX WARN: Code duplicated, block: B:77:0x0318  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void CollectionSummaryComponent(final CollectionDetailsUiState.Content content, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        Context context;
        IntercomTheme intercomTheme;
        int i4;
        c30.k kVar;
        sp0.a aVar2;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        ox6 ox6Var4;
        qr5.a aVar3;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        aj1 aj1VarA2;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        qr5.a aVar4;
        qr5.a aVar5;
        bj4 bj4Var;
        ny8 ny8VarA;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        qr5.a aVar6;
        aj1 aj1VarA3;
        int iHashCode4;
        kw7 kw7VarP4;
        ox6 ox6VarC4;
        ArrayList arrayList;
        xj8 xj8VarW;
        content.getClass();
        bj4 bj4VarO = jt1Var.o(-2122142392);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (bj4VarO.j(content) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i5 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                ox6 ox6VarC5 = ir9.c(ox6Var3, 1.0f);
                intercomTheme = IntercomTheme.INSTANCE;
                i4 = IntercomTheme.$stable;
                ox6 ox6VarC6 = gi0.c(ox6VarC5, kk.a(intercomTheme, bj4VarO, i4), al8.a);
                kVar = c30.c;
                aVar2 = di.a.m;
                aj1VarA = yi1.a(kVar, aVar2, bj4VarO, 0);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarC6);
                bt1.c.getClass();
                ox6Var4 = ox6Var3;
                aVar3 = bt1.a.b;
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
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6VarI = eo7.i(aVar, 16.0f);
                aj1VarA2 = yi1.a(kVar, aVar2, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarI);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    aVar4 = aVar3;
                    bj4VarO.k(aVar4);
                } else {
                    aVar4 = aVar3;
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                aVar5 = aVar4;
                mia.b(content.getTitle(), null, gh5.a(intercomTheme, bj4VarO, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04SemiBold(), bj4VarO, 0, 0, 131066);
                bj4Var = bj4VarO;
                bj4Var.K(2075464467);
                if (!z2a.w(content.getSummary())) {
                    b47.b(bj4Var, ir9.d(aVar, 4.0f));
                    mia.b(content.getSummary(), null, gh5.a(intercomTheme, bj4Var, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i4).getType04Point5(), bj4Var, 0, 0, 131066);
                    bj4Var = bj4Var;
                }
                bj4Var.U(false);
                b47.b(bj4Var, ir9.d(aVar, 20.0f));
                ox6 ox6VarC7 = ir9.c(aVar, 1.0f);
                ny8VarA = ly8.a(c30.f, di.a.k, bj4Var, 54);
                iHashCode3 = Long.hashCode(bj4Var.T);
                kw7VarP3 = bj4Var.P();
                ox6VarC3 = it1.c(bj4Var, ox6VarC7);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    aVar6 = aVar5;
                    bj4Var.k(aVar6);
                } else {
                    aVar6 = aVar5;
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, ny8VarA);
                rd7.d(bj4Var, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4Var, bVar, bj4Var, c0034a);
                rd7.d(bj4Var, dVar, ox6VarC3);
                aj1VarA3 = yi1.a(kVar, aVar2, bj4Var, 0);
                iHashCode4 = Long.hashCode(bj4Var.T);
                kw7VarP4 = bj4Var.P();
                ox6VarC4 = it1.c(bj4Var, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar6);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, aj1VarA3);
                rd7.d(bj4Var, eVar, kw7VarP4);
                l02.a(iHashCode4, bj4Var, bVar, bj4Var, c0034a);
                rd7.d(bj4Var, dVar, ox6VarC4);
                ArticleCountComponentKt.ArticleCountComponent(null, content.getArticlesCount(), bj4Var, 0, 1);
                bj4 bj4Var2 = bj4Var;
                mia.b(constructByAuthorsText(context, content.getAuthors()), null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 2, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i4).getType04Point5(), bj4Var2, 384, 384, 126970);
                bj4VarO = bj4Var2;
                bj4VarO.U(true);
                List<Author> listO = th1.O(3, content.getAuthors());
                arrayList = new ArrayList(ph1.n(listO, 10));
                for (Author author : listO) {
                    Avatar avatarCreate = Avatar.create(author.getAvatar().getImageUrl(), author.getAvatar().getInitials());
                    avatarCreate.getClass();
                    arrayList.add(new AvatarWrapper(avatarCreate, false));
                }
                AvatarGroupKt.m19AvatarGroupJ8mCjc(arrayList, null, 32.0f, 0L, bj4VarO, 384, 10);
                bj4VarO.U(true);
                bj4VarO.U(true);
                IntercomDividerKt.IntercomDivider(null, bj4VarO, 0, 1);
                bj4VarO.U(true);
                ox6Var2 = ox6Var4;
            } else {
                bj4VarO.u();
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lh1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return CollectionSummaryComponentKt.CollectionSummaryComponent$lambda$5(content, ox6Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i3 & 19) == 18) {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            ox6 ox6VarC8 = ir9.c(ox6Var3, 1.0f);
            intercomTheme = IntercomTheme.INSTANCE;
            i4 = IntercomTheme.$stable;
            ox6 ox6VarC9 = gi0.c(ox6VarC8, kk.a(intercomTheme, bj4VarO, i4), al8.a);
            kVar = c30.c;
            aVar2 = di.a.m;
            aj1VarA = yi1.a(kVar, aVar2, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarC9);
            bt1.c.getClass();
            ox6Var4 = ox6Var3;
            aVar3 = bt1.a.b;
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
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf2);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarI2 = eo7.i(aVar, 16.0f);
            aj1VarA2 = yi1.a(kVar, aVar2, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarI2);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                aVar4 = aVar3;
                bj4VarO.k(aVar4);
            } else {
                aVar4 = aVar3;
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA2);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            aVar5 = aVar4;
            mia.b(content.getTitle(), null, gh5.a(intercomTheme, bj4VarO, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04SemiBold(), bj4VarO, 0, 0, 131066);
            bj4Var = bj4VarO;
            bj4Var.K(2075464467);
            if (!z2a.w(content.getSummary())) {
                b47.b(bj4Var, ir9.d(aVar, 4.0f));
                mia.b(content.getSummary(), null, gh5.a(intercomTheme, bj4Var, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i4).getType04Point5(), bj4Var, 0, 0, 131066);
                bj4Var = bj4Var;
            }
            bj4Var.U(false);
            b47.b(bj4Var, ir9.d(aVar, 20.0f));
            ox6 ox6VarC10 = ir9.c(aVar, 1.0f);
            ny8VarA = ly8.a(c30.f, di.a.k, bj4Var, 54);
            iHashCode3 = Long.hashCode(bj4Var.T);
            kw7VarP3 = bj4Var.P();
            ox6VarC3 = it1.c(bj4Var, ox6VarC10);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4Var.q();
            if (bj4Var.S) {
                aVar6 = aVar5;
                bj4Var.k(aVar6);
            } else {
                aVar6 = aVar5;
                bj4Var.z();
            }
            rd7.d(bj4Var, cVar, ny8VarA);
            rd7.d(bj4Var, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4Var, bVar, bj4Var, c0034a);
            rd7.d(bj4Var, dVar, ox6VarC3);
            aj1VarA3 = yi1.a(kVar, aVar2, bj4Var, 0);
            iHashCode4 = Long.hashCode(bj4Var.T);
            kw7VarP4 = bj4Var.P();
            ox6VarC4 = it1.c(bj4Var, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4Var.q();
            if (bj4Var.S) {
                bj4Var.k(aVar6);
            } else {
                bj4Var.z();
            }
            rd7.d(bj4Var, cVar, aj1VarA3);
            rd7.d(bj4Var, eVar, kw7VarP4);
            l02.a(iHashCode4, bj4Var, bVar, bj4Var, c0034a);
            rd7.d(bj4Var, dVar, ox6VarC4);
            ArticleCountComponentKt.ArticleCountComponent(null, content.getArticlesCount(), bj4Var, 0, 1);
            bj4 bj4Var3 = bj4Var;
            mia.b(constructByAuthorsText(context, content.getAuthors()), null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 2, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i4).getType04Point5(), bj4Var3, 384, 384, 126970);
            bj4VarO = bj4Var3;
            bj4VarO.U(true);
            List<Author> listO2 = th1.O(3, content.getAuthors());
            arrayList = new ArrayList(ph1.n(listO2, 10));
            while (r3.hasNext()) {
                Avatar avatarCreate2 = Avatar.create(author.getAvatar().getImageUrl(), author.getAvatar().getInitials());
                avatarCreate2.getClass();
                arrayList.add(new AvatarWrapper(avatarCreate2, false));
            }
            AvatarGroupKt.m19AvatarGroupJ8mCjc(arrayList, null, 32.0f, 0L, bj4VarO, 384, 10);
            bj4VarO.U(true);
            bj4VarO.U(true);
            IntercomDividerKt.IntercomDivider(null, bj4VarO, 0, 1);
            bj4VarO.U(true);
            ox6Var2 = ox6Var4;
        } else {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            ox6 ox6VarC11 = ir9.c(ox6Var3, 1.0f);
            intercomTheme = IntercomTheme.INSTANCE;
            i4 = IntercomTheme.$stable;
            ox6 ox6VarC12 = gi0.c(ox6VarC11, kk.a(intercomTheme, bj4VarO, i4), al8.a);
            kVar = c30.c;
            aVar2 = di.a.m;
            aj1VarA = yi1.a(kVar, aVar2, bj4VarO, 0);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarC12);
            bt1.c.getClass();
            ox6Var4 = ox6Var3;
            aVar3 = bt1.a.b;
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
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf3);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarI3 = eo7.i(aVar, 16.0f);
            aj1VarA2 = yi1.a(kVar, aVar2, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarI3);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                aVar4 = aVar3;
                bj4VarO.k(aVar4);
            } else {
                aVar4 = aVar3;
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA2);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            aVar5 = aVar4;
            mia.b(content.getTitle(), null, gh5.a(intercomTheme, bj4VarO, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04SemiBold(), bj4VarO, 0, 0, 131066);
            bj4Var = bj4VarO;
            bj4Var.K(2075464467);
            if (!z2a.w(content.getSummary())) {
                b47.b(bj4Var, ir9.d(aVar, 4.0f));
                mia.b(content.getSummary(), null, gh5.a(intercomTheme, bj4Var, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i4).getType04Point5(), bj4Var, 0, 0, 131066);
                bj4Var = bj4Var;
            }
            bj4Var.U(false);
            b47.b(bj4Var, ir9.d(aVar, 20.0f));
            ox6 ox6VarC13 = ir9.c(aVar, 1.0f);
            ny8VarA = ly8.a(c30.f, di.a.k, bj4Var, 54);
            iHashCode3 = Long.hashCode(bj4Var.T);
            kw7VarP3 = bj4Var.P();
            ox6VarC3 = it1.c(bj4Var, ox6VarC13);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4Var.q();
            if (bj4Var.S) {
                aVar6 = aVar5;
                bj4Var.k(aVar6);
            } else {
                aVar6 = aVar5;
                bj4Var.z();
            }
            rd7.d(bj4Var, cVar, ny8VarA);
            rd7.d(bj4Var, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4Var, bVar, bj4Var, c0034a);
            rd7.d(bj4Var, dVar, ox6VarC3);
            aj1VarA3 = yi1.a(kVar, aVar2, bj4Var, 0);
            iHashCode4 = Long.hashCode(bj4Var.T);
            kw7VarP4 = bj4Var.P();
            ox6VarC4 = it1.c(bj4Var, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4Var.q();
            if (bj4Var.S) {
                bj4Var.k(aVar6);
            } else {
                bj4Var.z();
            }
            rd7.d(bj4Var, cVar, aj1VarA3);
            rd7.d(bj4Var, eVar, kw7VarP4);
            l02.a(iHashCode4, bj4Var, bVar, bj4Var, c0034a);
            rd7.d(bj4Var, dVar, ox6VarC4);
            ArticleCountComponentKt.ArticleCountComponent(null, content.getArticlesCount(), bj4Var, 0, 1);
            bj4 bj4Var4 = bj4Var;
            mia.b(constructByAuthorsText(context, content.getAuthors()), null, u7d.d(4285887861L), 0L, null, 0L, null, 0L, 2, false, 0, 0, null, intercomTheme.getTypography(bj4Var, i4).getType04Point5(), bj4Var4, 384, 384, 126970);
            bj4VarO = bj4Var4;
            bj4VarO.U(true);
            List<Author> listO3 = th1.O(3, content.getAuthors());
            arrayList = new ArrayList(ph1.n(listO3, 10));
            while (r3.hasNext()) {
                Avatar avatarCreate3 = Avatar.create(author.getAvatar().getImageUrl(), author.getAvatar().getInitials());
                avatarCreate3.getClass();
                arrayList.add(new AvatarWrapper(avatarCreate3, false));
            }
            AvatarGroupKt.m19AvatarGroupJ8mCjc(arrayList, null, 32.0f, 0L, bj4VarO, 384, 10);
            bj4VarO.U(true);
            bj4VarO.U(true);
            IntercomDividerKt.IntercomDivider(null, bj4VarO, 0, 1);
            bj4VarO.U(true);
            ox6Var2 = ox6Var4;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: lh1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CollectionSummaryComponentKt.CollectionSummaryComponent$lambda$5(content, ox6Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CollectionSummaryComponent$lambda$5(CollectionDetailsUiState.Content content, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        CollectionSummaryComponent(content, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void CollectionSummaryComponentPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1054855652);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CollectionSummaryComponentKt.INSTANCE.m320getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: kh1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CollectionSummaryComponentKt.CollectionSummaryComponentPreview$lambda$6(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CollectionSummaryComponentPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        CollectionSummaryComponentPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final String constructByAuthorsText(Context context, List<Author> list) {
        CharSequence charSequence;
        if (list.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        int size = list.size();
        if (size != 1) {
            charSequence = size != 2 ? Phrase.from(context, R.string.intercom_article_multiple_authors).put("author_first_name1", ((Author) th1.y(list)).getName()).put("number_of_other_authors", list.size() - 1).format() : Phrase.from(context, R.string.intercom_article_double_author).put("author_first_name1", ((Author) th1.y(list)).getName()).put("author_first_name2", ((Author) th1.G(list)).getName()).format();
        } else {
            charSequence = Phrase.from(context, R.string.intercom_article_single_author).put("author_first_name", ((Author) th1.y(list)).getName()).format();
        }
        return charSequence.toString();
    }
}
