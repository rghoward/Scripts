package io.intercom.android.sdk.m5.helpcenter.ui;

import com.intercom.twig.BuildConfig;
import defpackage.az3;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bz5;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.h37;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qw0;
import defpackage.u;
import defpackage.wd3;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.ys5;
import defpackage.yz9;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionSummaryComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterCollectionDetailsScreenKt {
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x0101  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x010c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0131  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void HelpCenterCollectionDetailsScreen(final HelpCenterViewModel helpCenterViewModel, final String str, oh4<? super String, g2b> oh4Var, final oh4<? super String, g2b> oh4Var2, jt1 jt1Var, final int i, final int i2) {
        int i3;
        oh4<? super String, g2b> oh4Var3;
        int i4;
        jt1.a.C0187a c0187a;
        final oh4<? super String, g2b> oh4Var4;
        boolean z;
        boolean z2;
        Object objF;
        final h37 h37VarC;
        boolean z3;
        boolean z4;
        Object objF2;
        Object objF3;
        xj8 xj8VarW;
        helpCenterViewModel.getClass();
        str.getClass();
        oh4Var2.getClass();
        bj4 bj4VarO = jt1Var.o(-1331499807);
        int i5 = 2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(helpCenterViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                oh4Var3 = oh4Var;
                i3 |= bj4VarO.j(oh4Var3) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bj4VarO.j(oh4Var2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                c0187a = jt1.a.a;
                if (i6 != 0) {
                    bj4VarO.K(-1710804376);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new qw0(i5);
                        bj4VarO.C(objF3);
                    }
                    oh4Var4 = (oh4) objF3;
                    bj4VarO.U(false);
                } else {
                    oh4Var4 = oh4Var3;
                }
                bj4VarO.K(-1710800916);
                boolean zJ = bj4VarO.j(helpCenterViewModel);
                if ((i3 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zJ | z;
                objF = bj4VarO.f();
                if (z2 || objF == c0187a) {
                    objF = new HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2$1(helpCenterViewModel, str, null);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF, BuildConfig.FLAVOR);
                h37VarC = bl7.c(helpCenterViewModel.getCollectionDetailsState(), bj4VarO, 0);
                az3 az3Var = ir9.c;
                bj4VarO.K(-1710791525);
                boolean zJ2 = bj4VarO.J(h37VarC);
                if ((i3 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | zJ2 | ((i3 & 7168) == 2048);
                objF2 = bj4VarO.f();
                if (z4 || objF2 == c0187a) {
                    objF2 = new oh4() { // from class: gv4
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$4$lambda$3(h37VarC, oh4Var4, oh4Var2, (bz5) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ys5.a(az3Var, null, null, null, di.a.n, null, false, null, (oh4) objF2, bj4VarO, 196614, 478);
            } else {
                bj4VarO.u();
                oh4Var4 = oh4Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hv4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$5(helpCenterViewModel, str, oh4Var4, oh4Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        oh4Var3 = oh4Var;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (bj4VarO.j(oh4Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) == 1170) {
            c0187a = jt1.a.a;
            if (i6 != 0) {
                bj4VarO.K(-1710804376);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new qw0(i5);
                    bj4VarO.C(objF3);
                }
                oh4Var4 = (oh4) objF3;
                bj4VarO.U(false);
            } else {
                oh4Var4 = oh4Var3;
            }
            bj4VarO.K(-1710800916);
            boolean zJ3 = bj4VarO.j(helpCenterViewModel);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            z2 = zJ3 | z;
            objF = bj4VarO.f();
            if (z2) {
                objF = new HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2$1(helpCenterViewModel, str, null);
                bj4VarO.C(objF);
            } else {
                objF = new HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2$1(helpCenterViewModel, str, null);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF, BuildConfig.FLAVOR);
            h37VarC = bl7.c(helpCenterViewModel.getCollectionDetailsState(), bj4VarO, 0);
            az3 az3Var2 = ir9.c;
            bj4VarO.K(-1710791525);
            boolean zJ4 = bj4VarO.J(h37VarC);
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z3 | zJ4 | ((i3 & 7168) == 2048);
            objF2 = bj4VarO.f();
            if (z4) {
                objF2 = new oh4() { // from class: gv4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$4$lambda$3(h37VarC, oh4Var4, oh4Var2, (bz5) obj);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new oh4() { // from class: gv4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$4$lambda$3(h37VarC, oh4Var4, oh4Var2, (bz5) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ys5.a(az3Var2, null, null, null, di.a.n, null, false, null, (oh4) objF2, bj4VarO, 196614, 478);
        } else {
            c0187a = jt1.a.a;
            if (i6 != 0) {
                bj4VarO.K(-1710804376);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new qw0(i5);
                    bj4VarO.C(objF3);
                }
                oh4Var4 = (oh4) objF3;
                bj4VarO.U(false);
            } else {
                oh4Var4 = oh4Var3;
            }
            bj4VarO.K(-1710800916);
            boolean zJ5 = bj4VarO.j(helpCenterViewModel);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            z2 = zJ5 | z;
            objF = bj4VarO.f();
            if (z2) {
                objF = new HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2$1(helpCenterViewModel, str, null);
                bj4VarO.C(objF);
            } else {
                objF = new HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2$1(helpCenterViewModel, str, null);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF, BuildConfig.FLAVOR);
            h37VarC = bl7.c(helpCenterViewModel.getCollectionDetailsState(), bj4VarO, 0);
            az3 az3Var3 = ir9.c;
            bj4VarO.K(-1710791525);
            boolean zJ6 = bj4VarO.J(h37VarC);
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z3 | zJ6 | ((i3 & 7168) == 2048);
            objF2 = bj4VarO.f();
            if (z4) {
                objF2 = new oh4() { // from class: gv4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$4$lambda$3(h37VarC, oh4Var4, oh4Var2, (bz5) obj);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new oh4() { // from class: gv4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$4$lambda$3(h37VarC, oh4Var4, oh4Var2, (bz5) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ys5.a(az3Var3, null, null, null, di.a.n, null, false, null, (oh4) objF2, bj4VarO, 196614, 478);
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$5(helpCenterViewModel, str, oh4Var4, oh4Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterCollectionDetailsScreen$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterCollectionDetailsScreen$lambda$4$lambda$3(yz9 yz9Var, oh4 oh4Var, oh4 oh4Var2, bz5 bz5Var) {
        bz5Var.getClass();
        final CollectionDetailsUiState collectionDetailsUiState = (CollectionDetailsUiState) yz9Var.getValue();
        if (xj5.a(collectionDetailsUiState, CollectionDetailsUiState.Initial.INSTANCE) || xj5.a(collectionDetailsUiState, CollectionDetailsUiState.Loading.INSTANCE)) {
            bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m297getLambda1$intercom_sdk_base_release());
        } else if (collectionDetailsUiState instanceof CollectionDetailsUiState.Error) {
            bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, 211733483, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$3$1$1
                public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
                    fv5Var.getClass();
                    if ((i & 6) == 0) {
                        i |= jt1Var.J(fv5Var) ? 4 : 2;
                    }
                    if ((i & 19) == 18 && jt1Var.r()) {
                        jt1Var.u();
                    } else {
                        HelpCenterErrorScreenKt.HelpCenterErrorScreen(((CollectionDetailsUiState.Error) collectionDetailsUiState).getErrorState(), fv5Var.a(), jt1Var, 0, 0);
                    }
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                    invoke(fv5Var, jt1Var, num.intValue());
                    return g2b.a;
                }
            }));
        } else {
            if (!(collectionDetailsUiState instanceof CollectionDetailsUiState.Content)) {
                u.b();
                return null;
            }
            CollectionDetailsUiState.Content content = (CollectionDetailsUiState.Content) collectionDetailsUiState;
            if (content.getCollectionDetailsRows().isEmpty()) {
                bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m298getLambda2$intercom_sdk_base_release());
            } else {
                helpCenterSectionItems(bz5Var, content, oh4Var, oh4Var2);
            }
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterCollectionDetailsScreen$lambda$5(HelpCenterViewModel helpCenterViewModel, String str, oh4 oh4Var, oh4 oh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        HelpCenterCollectionDetailsScreen(helpCenterViewModel, str, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void helpCenterSectionItems(bz5 bz5Var, final CollectionDetailsUiState.Content content, final oh4<? super String, g2b> oh4Var, final oh4<? super String, g2b> oh4Var2) {
        bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, 1491252145, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt.helpCenterSectionItems.1
            public final void invoke(fv5 fv5Var, jt1 jt1Var, int i) {
                fv5Var.getClass();
                if ((i & 17) == 16 && jt1Var.r()) {
                    jt1Var.u();
                } else {
                    CollectionSummaryComponentKt.CollectionSummaryComponent(content, null, jt1Var, 0, 2);
                }
            }

            @Override // defpackage.ei4
            public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                invoke(fv5Var, jt1Var, num.intValue());
                return g2b.a;
            }
        }));
        final List<CollectionDetailsRow> collectionDetailsRows = content.getCollectionDetailsRows();
        final int i = 0;
        for (Object obj : collectionDetailsRows) {
            int i2 = i + 1;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            final CollectionDetailsRow collectionDetailsRow = (CollectionDetailsRow) obj;
            if (collectionDetailsRow instanceof CollectionDetailsRow.ArticleRow) {
                bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, -103698696, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$1
                    public final void invoke(fv5 fv5Var, jt1 jt1Var, int i3) {
                        fv5Var.getClass();
                        if ((i3 & 17) == 16 && jt1Var.r()) {
                            jt1Var.u();
                            return;
                        }
                        jt1Var.K(153525508);
                        int i4 = i;
                        ox6.a aVar = ox6.a.t;
                        if (i4 == 0) {
                            b47.b(jt1Var, ir9.d(aVar, 16.0f));
                        }
                        jt1Var.B();
                        ArticleRowComponentKt.ArticleRowComponent(null, (CollectionDetailsRow.ArticleRow) collectionDetailsRow, oh4Var, jt1Var, 0, 1);
                        if (i == collectionDetailsRows.size() - 1 || !(collectionDetailsRows.get(i + 1) instanceof CollectionDetailsRow.ArticleRow)) {
                            return;
                        }
                        IntercomDividerKt.IntercomDivider(eo7.m(aVar, 16.0f, 0.0f, 16.0f, 0.0f, 10), jt1Var, 6, 0);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                        invoke(fv5Var, jt1Var, num.intValue());
                        return g2b.a;
                    }
                }));
            } else if (xj5.a(collectionDetailsRow, CollectionDetailsRow.FullHelpCenterRow.INSTANCE)) {
                bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m299getLambda3$intercom_sdk_base_release());
            } else if (collectionDetailsRow instanceof CollectionDetailsRow.CollectionRow) {
                bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, 1175818224, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$2
                    public final void invoke(fv5 fv5Var, jt1 jt1Var, int i3) {
                        fv5Var.getClass();
                        if ((i3 & 17) == 16 && jt1Var.r()) {
                            jt1Var.u();
                        } else {
                            CollectionRowComponentKt.CollectionRowComponent(((CollectionDetailsRow.CollectionRow) collectionDetailsRow).getRowData(), oh4Var2, null, jt1Var, 0, 4);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                        invoke(fv5Var, jt1Var, num.intValue());
                        return g2b.a;
                    }
                }));
            } else {
                if (!(collectionDetailsRow instanceof CollectionDetailsRow.SendMessageRow)) {
                    u.b();
                    return;
                }
                bz5Var.c((2 & 1) != 0 ? null : ConversationUiStateKt.LastAnchorRowKey, new fr1(true, 1352146481, new ei4<fv5, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$3
                    public final void invoke(fv5 fv5Var, jt1 jt1Var, int i3) {
                        fv5Var.getClass();
                        if ((i3 & 17) == 16 && jt1Var.r()) {
                            jt1Var.u();
                        } else {
                            TeamPresenceComponentKt.TeamPresenceComponent(((CollectionDetailsRow.SendMessageRow) collectionDetailsRow).getTeamPresenceState(), false, null, jt1Var, 48, 4);
                        }
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, jt1 jt1Var, Integer num) {
                        invoke(fv5Var, jt1Var, num.intValue());
                        return g2b.a;
                    }
                }));
            }
            i = i2;
        }
    }
}
