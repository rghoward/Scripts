package io.intercom.android.sdk.post;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bi5;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gt6;
import defpackage.hf3;
import defpackage.ia3;
import defpackage.iq1;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.o7a;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.q39;
import defpackage.q69;
import defpackage.qq2;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ss5;
import defpackage.ty0;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.um2;
import defpackage.v33;
import defpackage.vg7;
import defpackage.w7a;
import defpackage.wd3;
import defpackage.x69;
import defpackage.yi1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.post.IntercomPostActivity;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPostActivity extends IntercomBaseActivity {
    private static final String COMPOSER_IS_VISIBLE = "composer_is_visible";
    private static final String LAST_PARTICIPANT = "last_participant";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_PART = "parcel_part";
    private static final String POST_PREVIEW = "is_post_preview";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final ss5 injector$delegate = new o7a(new bi5(0));
    private final ss5 appConfigProvider$delegate = new o7a(new mh4() { // from class: ci5
        @Override // defpackage.mh4
        public final Object invoke() {
            return IntercomPostActivity.appConfigProvider_delegate$lambda$1(this.t);
        }
    });
    private final ss5 timeFormatter$delegate = new o7a(new um2(this, 1));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Provider appConfigProvider_delegate$lambda$1(IntercomPostActivity intercomPostActivity) {
        return intercomPostActivity.getInjector().getAppConfigProvider();
    }

    public static final Intent buildPostIntent(Context context, Part part, String str, LastParticipatingAdmin lastParticipatingAdmin, boolean z, boolean z2) {
        return Companion.buildPostIntent(context, part, str, lastParticipatingAdmin, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Provider<AppConfig> getAppConfigProvider() {
        return (Provider) this.appConfigProvider$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getConversationId() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, BuildConfig.FLAVOR);
        string.getClass();
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Injector getInjector() {
        return (Injector) this.injector$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Part getPart() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.setClassLoader(Part.class.getClassLoader());
            if (extras.containsKey(PARCEL_PART)) {
                Part part = (Part) ty0.a(extras, PARCEL_PART, Part.class);
                if (part != null) {
                    return part;
                }
                Part part2 = Part.NULL;
                part2.getClass();
                return part2;
            }
        }
        Part part3 = Part.NULL;
        part3.getClass();
        return part3;
    }

    private final TimeFormatter getTimeFormatter() {
        return (TimeFormatter) this.timeFormatter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserStatus() {
        LastParticipatingAdmin lastParticipatingAdmin;
        Bundle extras = getIntent().getExtras();
        return (extras == null || !extras.containsKey(LAST_PARTICIPANT) || (lastParticipatingAdmin = (LastParticipatingAdmin) ty0.a(extras, LAST_PARTICIPANT, LastParticipatingAdmin.class)) == null || LastParticipatingAdmin.isNull(lastParticipatingAdmin)) ? BuildConfig.FLAVOR : getTimeFormatter().getAdminActiveStatus(lastParticipatingAdmin, getAppConfigProvider()).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isComposerVisible() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getBoolean(COMPOSER_IS_VISIBLE, true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        return extras.getBoolean(POST_PREVIEW, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openConversation() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, BuildConfig.FLAVOR);
        getInjector().getMetricTracker().openedConversationFromFull(string, getPart().getId());
        startActivity(ConversationScreenOpenerKt.getConversationIntent(this, string));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPostAsRead() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(PARCEL_CONVERSATION_ID)) {
            return;
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, BuildConfig.FLAVOR);
        IntercomDataLayer dataLayer = getInjector().getDataLayer();
        string.getClass();
        dataLayer.markConversationAsRead(string);
        getInjector().getApi().markConversationAsRead(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimeFormatter timeFormatter_delegate$lambda$2(IntercomPostActivity intercomPostActivity) {
        return new TimeFormatter(intercomPostActivity, intercomPostActivity.getInjector().getTimeProvider());
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2;
        ia3.a(this, new w7a(0, 0, 2, new gt6(i)), new w7a(0, 0, 2, new gt6(i)));
        super.onCreate(bundle);
        if (!isPreview()) {
            Part part = getPart();
            getInjector().getMetricTracker().viewedInAppFromMessenger(getConversationId(), part.getId(), part.getMessageStyle());
        }
        getOnBackPressedDispatcher().a(this, new vg7() { // from class: io.intercom.android.sdk.post.IntercomPostActivity.onCreate.1
            {
                super(true);
            }

            @Override // defpackage.vg7
            public void handleOnBackPressed() {
                if (IntercomPostActivity.this.isPreview()) {
                    IntercomPostActivity.this.getInjector().getMetricTracker().closedInAppFromFull(IntercomPostActivity.this.getConversationId(), IntercomPostActivity.this.getPart().getId());
                }
                IntercomPostActivity.this.finish();
            }
        });
        iq1.a(this, new fr1(true, 309457934, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.post.IntercomPostActivity.onCreate.2
            public final void invoke(jt1 jt1Var, int i2) {
                if ((i2 & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                final x69 x69VarF = q69.f(jt1Var);
                final IntercomPostActivity intercomPostActivity = IntercomPostActivity.this;
                IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(1094919204, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.post.IntercomPostActivity.onCreate.2.1
                    public final void invoke(jt1 jt1Var2, int i3) {
                        if ((i3 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        jt1Var2.K(-333903347);
                        boolean zJ = jt1Var2.j(intercomPostActivity);
                        IntercomPostActivity intercomPostActivity2 = intercomPostActivity;
                        Object objF = jt1Var2.f();
                        if (zJ || objF == jt1.a.a) {
                            objF = new IntercomPostActivity$onCreate$2$1$1$1(intercomPostActivity2, null);
                            jt1Var2.C(objF);
                        }
                        jt1Var2.B();
                        wd3.d(jt1Var2, (ci4) objF, BuildConfig.FLAVOR);
                        final Part part2 = intercomPostActivity.getPart();
                        long j = uh1.b;
                        fr1 fr1VarB = gr1.b(-2005201696, new C01632(part2, intercomPostActivity), jt1Var2);
                        final IntercomPostActivity intercomPostActivity3 = intercomPostActivity;
                        fr1 fr1VarB2 = gr1.b(1401728063, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.post.IntercomPostActivity.onCreate.2.1.3
                            public final void invoke(jt1 jt1Var3, int i4) {
                                if ((i4 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                if (intercomPostActivity3.isPreview()) {
                                    Part part3 = part2;
                                    IntercomPostActivity intercomPostActivity4 = intercomPostActivity3;
                                    aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                                    int iHashCode = Long.hashCode(jt1Var3.v());
                                    kw7 kw7VarY = jt1Var3.y();
                                    ox6.a aVar = ox6.a.t;
                                    ox6 ox6VarC = it1.c(jt1Var3, aVar);
                                    bt1.c.getClass();
                                    qr5.a aVar2 = bt1.a.b;
                                    if (jt1Var3.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var3.q();
                                    if (jt1Var3.l()) {
                                        jt1Var3.k(aVar2);
                                    } else {
                                        jt1Var3.z();
                                    }
                                    rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                                    rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                                    rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                                    rd7.c(jt1Var3, bt1.a.h);
                                    rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                                    v33.a(null, 0.65f, u7d.d(2594086558L), jt1Var3, 432, 1);
                                    IntercomPostActivityKt.BottomBarContent(aVar, gr1.b(-1915412601, new IntercomPostActivity$onCreate$2$1$3$1$1(part3, intercomPostActivity4), jt1Var3), jt1Var3, 54);
                                    jt1Var3.I();
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                                invoke(jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2);
                        final x69 x69Var = x69VarF;
                        q39.a(null, fr1VarB, fr1VarB2, null, null, 0, j, 0L, null, gr1.b(-76912331, new ei4<go7, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.post.IntercomPostActivity.onCreate.2.1.4
                            public final void invoke(go7 go7Var, jt1 jt1Var3, int i4) {
                                go7Var.getClass();
                                if ((((i4 & 6) == 0 ? i4 | (jt1Var3.J(go7Var) ? 4 : 2) : i4) & 19) == 18 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                x69 x69Var2 = x69Var;
                                ox6.a aVar = ox6.a.t;
                                char c = 0;
                                ox6 ox6VarM = eo7.m(eo7.h(q69.h(aVar, x69Var2, 12), go7Var), 16.0f, 0.0f, 16.0f, 16.0f, 2);
                                Part part3 = part2;
                                aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var3, 0);
                                int iHashCode = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY = jt1Var3.y();
                                ox6 ox6VarC = it1.c(jt1Var3, ox6VarM);
                                bt1.c.getClass();
                                qr5.a aVar2 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                                rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                                rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                                rd7.c(jt1Var3, bt1.a.h);
                                rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                                b47.b(jt1Var3, ir9.d(aVar, 8.0f));
                                List<Block> blocks = part3.getBlocks();
                                if (blocks == null) {
                                    blocks = hf3.t;
                                }
                                jt1Var3.K(1495771339);
                                for (Block block : blocks) {
                                    ox6 ox6VarC2 = ir9.c(aVar, 1.0f);
                                    block.getClass();
                                    long j2 = uh1.e;
                                    uh1 uh1Var = new uh1(j2);
                                    BlockRenderTextStyle blockRenderTextStyle = new BlockRenderTextStyle(cka.b(24), ob4.B, cka.b(36), new uh1(j2), null, null, 48, null);
                                    ob4 ob4Var = ob4.y;
                                    ox6.a aVar3 = aVar;
                                    BlockViewKt.m426BlockViewOkTjGUA(ox6VarC2, new BlockRenderData(block, uh1Var, blockRenderTextStyle, new BlockRenderTextStyle(cka.b(16), ob4Var, cka.b(36), new uh1(j2), null, null, 48, null), new BlockRenderTextStyle(cka.b(16), ob4Var, cka.b(24), new uh1(j2), null, null, 48, null), null), false, null, false, null, ImageRenderType.FULL, 0L, null, null, false, null, null, jt1Var3, 1572870, 0, 8124);
                                    c = 0;
                                    b47.b(jt1Var3, ir9.d(aVar3, 16.0f));
                                    aVar = aVar3;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(go7 go7Var, jt1 jt1Var3, Integer num) {
                                invoke(go7Var, jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 806879664, 441);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }

                    /* JADX INFO: renamed from: io.intercom.android.sdk.post.IntercomPostActivity$onCreate$2$1$2, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class C01632 implements ci4<jt1, Integer, g2b> {
                        final /* synthetic */ Part $part;
                        final /* synthetic */ IntercomPostActivity this$0;

                        public C01632(Part part, IntercomPostActivity intercomPostActivity) {
                            this.$part = part;
                            this.this$0 = intercomPostActivity;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final g2b invoke$lambda$1$lambda$0(IntercomPostActivity intercomPostActivity) {
                            intercomPostActivity.finish();
                            return g2b.a;
                        }

                        public final void invoke(jt1 jt1Var, int i) {
                            if ((i & 3) == 2 && jt1Var.r()) {
                                jt1Var.u();
                                return;
                            }
                            CharSequence charSequence = Phrase.from((Context) jt1Var.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_teammate_from_company).put("name", this.$part.getParticipant().getForename()).put("company", ((AppConfig) this.this$0.getAppConfigProvider().get()).getName()).format();
                            Avatar avatar = this.$part.getParticipant().getAvatar();
                            avatar.getClass();
                            String string = charSequence.toString();
                            String userStatus = this.this$0.getUserStatus();
                            jt1Var.K(1506964192);
                            boolean zJ = jt1Var.j(this.this$0);
                            final IntercomPostActivity intercomPostActivity = this.this$0;
                            Object objF = jt1Var.f();
                            if (zJ || objF == jt1.a.a) {
                                objF = new mh4() { // from class: io.intercom.android.sdk.post.a
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return IntercomPostActivity.AnonymousClass2.AnonymousClass1.C01632.invoke$lambda$1$lambda$0(intercomPostActivity);
                                    }
                                };
                                jt1Var.C(objF);
                            }
                            jt1Var.B();
                            IntercomPostActivityKt.TopBar(ox6.a.t, avatar, string, userStatus, (mh4) objF, jt1Var, 6);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                            invoke(jt1Var, num.intValue());
                            return g2b.a;
                        }
                    }
                }, jt1Var), jt1Var, 3072, 7);
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }
        }));
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final Intent buildPostIntent(Context context, Part part, String str, LastParticipatingAdmin lastParticipatingAdmin, boolean z, boolean z2) {
            context.getClass();
            part.getClass();
            str.getClass();
            lastParticipatingAdmin.getClass();
            Intent intentPutExtra = new Intent(context, (Class<?>) IntercomPostActivity.class).putExtra(IntercomPostActivity.PARCEL_PART, part).putExtra(IntercomPostActivity.LAST_PARTICIPANT, lastParticipatingAdmin).putExtra(IntercomPostActivity.COMPOSER_IS_VISIBLE, z).putExtra(IntercomPostActivity.POST_PREVIEW, z2);
            intentPutExtra.getClass();
            if (str.length() > 0) {
                intentPutExtra.putExtra(IntercomPostActivity.PARCEL_CONVERSATION_ID, str);
            }
            intentPutExtra.setExtrasClassLoader(Part.class.getClassLoader());
            return intentPutExtra;
        }

        private Companion() {
        }
    }
}
