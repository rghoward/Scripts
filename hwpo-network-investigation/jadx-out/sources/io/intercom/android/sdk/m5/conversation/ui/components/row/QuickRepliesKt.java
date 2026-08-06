package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.aa0;
import defpackage.ah5;
import defpackage.ay8;
import defpackage.b30;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.c30;
import defpackage.c84;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fb1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.j37;
import defpackage.jt1;
import defpackage.jv;
import defpackage.mh4;
import defpackage.mia;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.s74;
import defpackage.sg8;
import defpackage.tg8;
import defpackage.ug8;
import defpackage.vaa;
import defpackage.ws0;
import defpackage.xg8;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.z20;
import defpackage.zg3;
import defpackage.zg5;
import defpackage.zx8;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class QuickRepliesKt {
    public static final void AnimatedQuickReplies(final List<ReplyOption> list, final oh4<? super ReplyOption, g2b> oh4Var, jt1 jt1Var, final int i) {
        int i2;
        list.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-2072519615);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.j(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            bj4VarO.K(-407350432);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            Object obj = objF;
            if (objF == c0187a) {
                j37 j37Var = new j37(Boolean.FALSE);
                j37Var.u(Boolean.TRUE);
                bj4VarO.C(j37Var);
                obj = j37Var;
            }
            j37 j37Var2 = (j37) obj;
            Object objB = aa0.b(bj4VarO, false, -407342189);
            if (objB == c0187a) {
                objB = new ug8();
                bj4VarO.C(objB);
            }
            bj4VarO.U(false);
            dv.b(j37Var2, null, zg3.j((oh4) objB).b(zg3.c(null, 3)), zg3.d(null, 3), null, gr1.b(992499481, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt.AnimatedQuickReplies.2
                public final void invoke(jv jvVar, jt1 jt1Var2, int i3) {
                    jvVar.getClass();
                    QuickRepliesKt.ReplyOptions(eo7.m(ir9.c(ox6.a.t, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10), list, oh4Var, jt1Var2, 6, 0);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                    invoke(jvVar, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 200064, 18);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vg8
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return QuickRepliesKt.AnimatedQuickReplies$lambda$17(list, oh4Var, i, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AnimatedQuickReplies$lambda$16$lambda$15(int i) {
        return i / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AnimatedQuickReplies$lambda$17(List list, oh4 oh4Var, int i, jt1 jt1Var, int i2) {
        AnimatedQuickReplies(list, oh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void ComposerSuggestions(ox6 ox6Var, final List<ReplySuggestion> list, final oh4<? super ReplySuggestion, g2b> oh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        list.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-719570861);
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
            i3 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var2 = ox6Var;
            ArrayList arrayList = new ArrayList(ph1.n(list, 10));
            for (ReplySuggestion replySuggestion : list) {
                arrayList.add(new QuickReply(replySuggestion.getId(), replySuggestion.getText()));
            }
            bj4VarO.K(-1321217088);
            int i5 = 0;
            boolean zJ = bj4VarO.j(list) | ((i3 & 896) == 256);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new xg8(i5, list, oh4Var);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            QuickReplies(arrayList, (oh4) objF, ox6Var2, bj4VarO, (i3 << 6) & 896, 0);
            ox6Var = ox6Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final ox6 ox6Var3 = ox6Var;
            xj8VarW.d = new ci4() { // from class: yg8
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return QuickRepliesKt.ComposerSuggestions$lambda$12(ox6Var3, list, oh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ComposerSuggestions$lambda$11$lambda$10(List list, oh4 oh4Var, QuickReply quickReply) {
        Object next;
        quickReply.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!xj5.a(((ReplySuggestion) next).getId(), quickReply.getId()));
        ReplySuggestion replySuggestion = (ReplySuggestion) next;
        if (replySuggestion != null) {
            oh4Var.invoke(replySuggestion);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ComposerSuggestions$lambda$12(ox6 ox6Var, List list, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        ComposerSuggestions(ox6Var, list, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void QuickReplies(final List<QuickReply> list, final oh4<? super QuickReply, g2b> oh4Var, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        list.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(368433331);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            s74.a(ir9.c(ox6Var, 1.0f), new c30.h(8.0f, true, new b30(di.a.o)), new c30.h(8.0f, false, new z20(di.a.l)), null, 0, 0, gr1.b(-458232018, new AnonymousClass1(list, oh4Var), bj4VarO), bj4VarO, 1573296);
        }
        final ox6 ox6Var2 = ox6Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wg8
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    ox6 ox6Var3 = ox6Var2;
                    return QuickRepliesKt.QuickReplies$lambda$0(list, oh4Var, ox6Var3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b QuickReplies$lambda$0(List list, oh4 oh4Var, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        QuickReplies(list, oh4Var, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void QuickRepliesPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1503246755);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$QuickRepliesKt.INSTANCE.m261getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new fb1(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b QuickRepliesPreview$lambda$18(int i, jt1 jt1Var, int i2) {
        QuickRepliesPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void ReplyOptions(ox6 ox6Var, List<ReplyOption> list, oh4<? super ReplyOption, g2b> oh4Var, jt1 jt1Var, int i, int i2) {
        int i3;
        ox6 ox6Var2;
        list.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-1003293676);
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
            i3 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var2 = ox6Var;
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var3 = ox6Var;
            ArrayList arrayList = new ArrayList(ph1.n(list, 10));
            for (ReplyOption replyOption : list) {
                arrayList.add(new QuickReply(replyOption.getUuid(), replyOption.getText()));
            }
            bj4VarO.K(748076699);
            int i5 = 0;
            boolean zJ = bj4VarO.j(list) | ((i3 & 896) == 256);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new sg8(i5, oh4Var, list);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            QuickReplies(arrayList, (oh4) objF, ox6Var3, bj4VarO, (i3 << 6) & 896, 0);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new tg8(ox6Var2, list, oh4Var, i, i2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ReplyOptions$lambda$5$lambda$4(List list, oh4 oh4Var, QuickReply quickReply) {
        Object next;
        quickReply.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!xj5.a(((ReplyOption) next).getUuid(), quickReply.getId()));
        ReplyOption replyOption = (ReplyOption) next;
        if (replyOption != null) {
            oh4Var.invoke(replyOption);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ReplyOptions$lambda$6(ox6 ox6Var, List list, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        ReplyOptions(ox6Var, list, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ei4<c84, jt1, Integer, g2b> {
        final /* synthetic */ oh4<QuickReply, g2b> $onQuickReplyClick;
        final /* synthetic */ List<QuickReply> $quickReplies;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<QuickReply> list, oh4<? super QuickReply, g2b> oh4Var) {
            this.$quickReplies = list;
            this.$onQuickReplyClick = oh4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$2$lambda$1$lambda$0(oh4 oh4Var, QuickReply quickReply) {
            oh4Var.invoke(quickReply);
            return g2b.a;
        }

        public final void invoke(c84 c84Var, jt1 jt1Var, int i) {
            jt1 jt1Var2 = jt1Var;
            c84Var.getClass();
            if ((i & 17) == 16 && jt1Var2.r()) {
                jt1Var2.u();
                return;
            }
            List<QuickReply> list = this.$quickReplies;
            final oh4<QuickReply, g2b> oh4Var = this.$onQuickReplyClick;
            for (final QuickReply quickReply : list) {
                jt1Var2.K(373518625);
                boolean zJ = jt1Var2.J(oh4Var) | jt1Var2.J(quickReply);
                Object objF = jt1Var2.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.o
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return QuickRepliesKt.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(oh4Var, quickReply);
                        }
                    };
                    jt1Var2.C(objF);
                }
                mh4 mh4Var = (mh4) objF;
                jt1Var2.B();
                IntercomCardStyle intercomCardStyle = IntercomCardStyle.INSTANCE;
                zx8 zx8VarB = ay8.b(20.0f);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i2 = IntercomTheme.$stable;
                IntercomCardKt.IntercomCard(mh4Var, null, false, intercomCardStyle.m578defaultStyleqUnfpCA(zx8VarB, zg5.a(intercomTheme, jt1Var2, i2), ah5.a(intercomTheme, jt1Var2, i2), 0.0f, ws0.b(1.0f, intercomTheme.getColors(jt1Var2, i2).getBorder().m720getNeutral0d7_KjU()), 0L, jt1Var, (IntercomCardStyle.$stable << 18) | 3072, 32), null, gr1.b(-1399332631, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1$1$2
                    public final void invoke(bj1 bj1Var, jt1 jt1Var3, int i3) {
                        bj1Var.getClass();
                        if ((i3 & 17) == 16 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        ox6 ox6VarJ = eo7.j(16.0f, 12.0f, ox6.a.t);
                        String text = quickReply.getText();
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i4 = IntercomTheme.$stable;
                        mia.b(text, ox6VarJ, ah5.a(intercomTheme2, jt1Var3, i4), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(jt1Var3, i4).getType04Point5(), jt1Var3, 0, 0, 130040);
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var3, Integer num) {
                        invoke(bj1Var, jt1Var3, num.intValue());
                        return g2b.a;
                    }
                }, jt1Var), jt1Var, (IntercomCardStyle.Style.$stable << 9) | 196608, 22);
                jt1Var2 = jt1Var;
            }
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(c84 c84Var, jt1 jt1Var, Integer num) {
            invoke(c84Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
