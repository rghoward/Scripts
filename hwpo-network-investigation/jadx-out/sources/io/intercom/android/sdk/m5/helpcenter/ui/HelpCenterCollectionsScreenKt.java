package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.az3;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bz5;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fi4;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.h37;
import defpackage.ir9;
import defpackage.iv4;
import defpackage.jt1;
import defpackage.mia;
import defpackage.nr1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.u;
import defpackage.wd3;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.ys5;
import defpackage.yz9;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterCollectionsScreenKt {
    public static final void HelpCenterCollectionsScreen(final HelpCenterViewModel helpCenterViewModel, final List<String> list, final oh4<? super String, g2b> oh4Var, final oh4<? super String, g2b> oh4Var2, jt1 jt1Var, final int i) {
        int i2;
        helpCenterViewModel.getClass();
        list.getClass();
        oh4Var.getClass();
        oh4Var2.getClass();
        bj4 bj4VarO = jt1Var.o(-1836627764);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(helpCenterViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(oh4Var2) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            bj4VarO.K(2138885056);
            boolean zJ = bj4VarO.j(helpCenterViewModel) | bj4VarO.j(list);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1$1(helpCenterViewModel, list, null);
                bj4VarO.C(objF);
            }
            int i3 = 0;
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF, BuildConfig.FLAVOR);
            bj4VarO.K(2138889543);
            boolean zJ2 = ((i2 & 7168) == 2048) | bj4VarO.j(helpCenterViewModel);
            Object objF2 = bj4VarO.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2$1(helpCenterViewModel, oh4Var2, null);
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF2, BuildConfig.FLAVOR);
            h37 h37VarC = bl7.c(helpCenterViewModel.getCollectionsState(), bj4VarO, 0);
            az3 az3Var = ir9.c;
            bj4VarO.K(2138903112);
            boolean zJ3 = bj4VarO.J(h37VarC) | ((i2 & 896) == 256);
            Object objF3 = bj4VarO.f();
            if (zJ3 || objF3 == c0187a) {
                objF3 = new iv4(i3, h37VarC, oh4Var);
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            ys5.a(az3Var, null, null, null, di.a.n, null, false, null, (oh4) objF3, bj4VarO, 196614, 478);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: jv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen$lambda$4(helpCenterViewModel, list, oh4Var, oh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterCollectionsScreen$lambda$3$lambda$2(yz9 yz9Var, oh4 oh4Var, bz5 bz5Var) {
        bz5Var.getClass();
        final CollectionsUiState collectionsUiState = (CollectionsUiState) yz9Var.getValue();
        if (xj5.a(collectionsUiState, CollectionsUiState.Initial.INSTANCE) || xj5.a(collectionsUiState, CollectionsUiState.Loading.INSTANCE)) {
            bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, ComposableSingletons$HelpCenterCollectionsScreenKt.INSTANCE.m300getLambda1$intercom_sdk_base_release());
        } else if (collectionsUiState instanceof CollectionsUiState.Error) {
            bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, -2086280874, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$3$1$1
                public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
                    fv5Var.getClass();
                    if ((i & 6) == 0) {
                        i |= jt1Var.J(fv5Var) ? 4 : 2;
                    }
                    if ((i & 19) == 18 && jt1Var.r()) {
                        jt1Var.u();
                    } else {
                        HelpCenterErrorScreenKt.HelpCenterErrorScreen(((CollectionsUiState.Error) collectionsUiState).getErrorState(), fv5Var.a(), jt1Var, 0, 0);
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                    invoke(fv5Var, jt1Var, num.intValue());
                    return g2b.a;
                }
            }));
        } else {
            if (!(collectionsUiState instanceof CollectionsUiState.Content)) {
                u.b();
                return null;
            }
            CollectionsUiState.Content content = (CollectionsUiState.Content) collectionsUiState;
            if (content.getCollections().isEmpty()) {
                bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, ComposableSingletons$HelpCenterCollectionsScreenKt.INSTANCE.m301getLambda2$intercom_sdk_base_release());
            } else {
                helpCenterCollectionItems(bz5Var, content, oh4Var);
            }
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterCollectionsScreen$lambda$4(HelpCenterViewModel helpCenterViewModel, List list, oh4 oh4Var, oh4 oh4Var2, int i, jt1 jt1Var, int i2) {
        HelpCenterCollectionsScreen(helpCenterViewModel, list, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void helpCenterCollectionItems(bz5 bz5Var, final CollectionsUiState.Content content, final oh4<? super String, g2b> oh4Var) {
        bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, -464708772, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt.helpCenterCollectionItems.1
            public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
                String string;
                fv5Var.getClass();
                if ((i & 17) == 16 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                List<CollectionsRow> collections = content.getCollections();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collections) {
                    if (!(((CollectionsRow) obj) instanceof CollectionsRow.SendMessageRow)) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                if (size == 1) {
                    jt1Var.K(765329843);
                    string = nr1.f(jt1Var, R.string.intercom_single_collection);
                    jt1Var.B();
                } else {
                    jt1Var.K(765428144);
                    string = Phrase.from((Context) jt1Var.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_multiple_collections).put("total_collection", size).format().toString();
                    jt1Var.B();
                }
                mia.b(string, eo7.i(ir9.c(ox6.a.t, 1.0f), 16.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var, IntercomTheme.$stable).getType04SemiBold(), jt1Var, 48, 0, 131068);
                IntercomDividerKt.IntercomDivider(null, jt1Var, 0, 1);
            }

            @Override // defpackage.ei4
            public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                invoke(fv5Var, jt1Var, num.intValue());
                return g2b.a;
            }
        }));
        final List<CollectionsRow> collections = content.getCollections();
        bz5Var.a(collections.size(), null, new oh4<Integer, Object>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$2
            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                collections.get(i);
                return null;
            }
        }, new fr1(true, 2039820996, new fi4<fv5, Integer, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$helpCenterCollectionItems$$inlined$itemsIndexed$default$3
            public final void invoke(fv5 fv5Var, int i, jt1 jt1Var, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (jt1Var.J(fv5Var) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= jt1Var.h(i) ? 32 : 16;
                }
                if (!jt1Var.A(i3 & 1, (i3 & 147) != 146)) {
                    jt1Var.u();
                    return;
                }
                CollectionsRow collectionsRow = (CollectionsRow) collections.get(i);
                jt1Var.K(766027716);
                if (xj5.a(collectionsRow, CollectionsRow.FullHelpCenterRow.INSTANCE)) {
                    jt1Var.K(766073285);
                    BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(eo7.m(ox6.a.t, 0.0f, 24.0f, 0.0f, 0.0f, 13), jt1Var, 6, 0);
                    jt1Var.B();
                } else if (collectionsRow instanceof CollectionsRow.SendMessageRow) {
                    jt1Var.K(766223604);
                    TeamPresenceComponentKt.TeamPresenceComponent(((CollectionsRow.SendMessageRow) collectionsRow).getTeamPresenceState(), false, null, jt1Var, 48, 4);
                    jt1Var.B();
                } else if (collectionsRow instanceof CollectionsRow.CollectionRow) {
                    jt1Var.K(766388896);
                    CollectionRowComponentKt.CollectionRowComponent(((CollectionsRow.CollectionRow) collectionsRow).getRowData(), oh4Var, null, jt1Var, 0, 4);
                    jt1Var.B();
                } else if (!xj5.a(collectionsRow, CollectionsRow.BrowseAllHelpTopicsAsListRow.INSTANCE)) {
                    jt1Var.K(-390931425);
                    jt1Var.B();
                    u.b();
                    return;
                } else {
                    jt1Var.K(766553072);
                    BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsAsItem(null, jt1Var, 0, 1);
                    jt1Var.B();
                }
                jt1Var.B();
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, Integer num, jt1 jt1Var, Integer num2) {
                invoke(fv5Var, num.intValue(), jt1Var, num2.intValue());
                return g2b.a;
            }
        }));
    }
}
