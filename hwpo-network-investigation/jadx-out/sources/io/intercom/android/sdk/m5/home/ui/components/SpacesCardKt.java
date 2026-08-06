package io.intercom.android.sdk.m5.home.ui.components;

import defpackage.aj1;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.u;
import defpackage.u30;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SpaceItem;
import io.intercom.android.sdk.m5.home.data.SpaceItemType;
import io.intercom.android.sdk.m5.home.reducers.HomeItemBadgeReducerKt;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SpacesCardKt {
    public static final void SpacesCard(final HomeCards.HomeSpacesData homeSpacesData, final oh4<? super SpaceItemType, g2b> oh4Var, jt1 jt1Var, final int i) {
        int i2;
        homeSpacesData.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-261271608);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(homeSpacesData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomCardKt.IntercomCard(null, null, gr1.b(1212336956, new AnonymousClass1(homeSpacesData, oh4Var), bj4VarO), bj4VarO, 384, 3);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vw9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SpacesCardKt.SpacesCard$lambda$0(homeSpacesData, oh4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SpacesCard$lambda$0(HomeCards.HomeSpacesData homeSpacesData, oh4 oh4Var, int i, jt1 jt1Var, int i2) {
        SpacesCard(homeSpacesData, oh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$SpacesCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ei4<bj1, jt1, Integer, g2b> {
        final /* synthetic */ HomeCards.HomeSpacesData $homeSpacesData;
        final /* synthetic */ oh4<SpaceItemType, g2b> $onItemClick;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt$SpacesCard$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SpaceItemType.values().length];
                try {
                    iArr[SpaceItemType.MESSAGES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SpaceItemType.HELP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SpaceItemType.TICKETS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HomeCards.HomeSpacesData homeSpacesData, oh4<? super SpaceItemType, g2b> oh4Var) {
            this.$homeSpacesData = homeSpacesData;
            this.$onItemClick = oh4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$4$lambda$3$lambda$2$lambda$1(oh4 oh4Var, SpaceItem spaceItem) {
            oh4Var.invoke(spaceItem.getType());
            return g2b.a;
        }

        public final void invoke(bj1 bj1Var, jt1 jt1Var, int i) {
            int i2;
            boolean z;
            bj1Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            HomeCards.HomeSpacesData homeSpacesData = this.$homeSpacesData;
            final oh4<SpaceItemType, g2b> oh4Var = this.$onItemClick;
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var, 0);
            int iHashCode = Long.hashCode(jt1Var.v());
            kw7 kw7VarY = jt1Var.y();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(jt1Var, aVar);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (jt1Var.s() == null) {
                ml5.c();
                throw null;
            }
            jt1Var.q();
            if (jt1Var.l()) {
                jt1Var.k(aVar2);
            } else {
                jt1Var.z();
            }
            rd7.d(jt1Var, bt1.a.f, aj1VarA);
            rd7.d(jt1Var, bt1.a.e, kw7VarY);
            rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(jt1Var, bt1.a.h);
            rd7.d(jt1Var, bt1.a.d, ox6VarC);
            List<SpaceItem> spaceItems = homeSpacesData.getSpaceItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : spaceItems) {
                if (u30.t(((SpaceItem) obj).getType(), SpaceItemType.values())) {
                    arrayList.add(obj);
                }
            }
            jt1Var.K(-1735936299);
            int size = arrayList.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                int i5 = i4 + 1;
                int i6 = i3 + 1;
                if (i3 < 0) {
                    ws0.m();
                    throw null;
                }
                final SpaceItem spaceItem = (SpaceItem) obj2;
                int i7 = WhenMappings.$EnumSwitchMapping$0[spaceItem.getType().ordinal()];
                if (i7 == 1) {
                    i2 = R.drawable.intercom_messages_icon;
                } else if (i7 == 2) {
                    i2 = R.drawable.intercom_help_centre_icon;
                } else {
                    if (i7 != 3) {
                        u.b();
                        return;
                    }
                    i2 = R.drawable.intercom_ticket_detail_icon;
                }
                String label = spaceItem.getLabel();
                HomeItemBadge homeItemBadgeReduceHomeItemBadge = HomeItemBadgeReducerKt.reduceHomeItemBadge(spaceItem.getBadge());
                Integer numValueOf = Integer.valueOf(i2);
                jt1Var.K(-1302667345);
                boolean zJ = jt1Var.J(oh4Var) | jt1Var.J(spaceItem);
                Object objF = jt1Var.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new mh4() { // from class: io.intercom.android.sdk.m5.home.ui.components.i
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return SpacesCardKt.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2$lambda$1(oh4Var, spaceItem);
                        }
                    };
                    jt1Var.C(objF);
                }
                jt1Var.B();
                int i8 = size;
                int i9 = i3;
                ArrayList arrayList2 = arrayList;
                HomeItemKt.HomeItem(null, numValueOf, null, null, null, label, null, homeItemBadgeReduceHomeItemBadge, (mh4) objF, jt1Var, 0, 93);
                jt1Var.K(-1735917837);
                if (i9 != arrayList2.size() - 1) {
                    z = false;
                    IntercomDividerKt.IntercomDivider(eo7.k(ir9.c(aVar, 1.0f), 16.0f, 0.0f, 2), jt1Var, 6, 0);
                } else {
                    z = false;
                }
                jt1Var.B();
                i4 = i5;
                i3 = i6;
                size = i8;
                arrayList = arrayList2;
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
