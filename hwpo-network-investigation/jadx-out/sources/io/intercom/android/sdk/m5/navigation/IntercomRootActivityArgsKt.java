package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.ty0;
import io.intercom.android.sdk.m5.IntercomRootActivity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomRootActivityArgsKt {
    private static final String BUNDLE = "BUNDLE";
    private static final String BUNDLE_ARGS = "BUNDLE_ARGS";

    public static final IntercomRootActivityArgs getArgsForIntent(Intent intent) {
        intent.getClass();
        Bundle bundleExtra = intent.getBundleExtra(BUNDLE);
        if (bundleExtra == null) {
            return IntercomRootActivityArgs.NoContent.INSTANCE;
        }
        IntercomRootActivityArgs intercomRootActivityArgs = (IntercomRootActivityArgs) ty0.a(bundleExtra, BUNDLE_ARGS, IntercomRootActivityArgs.class);
        return intercomRootActivityArgs == null ? IntercomRootActivityArgs.NoContent.INSTANCE : intercomRootActivityArgs;
    }

    public static final Intent getIntentForArgs(Context context, IntercomRootActivityArgs intercomRootActivityArgs, Class<?> cls, Integer num) {
        context.getClass();
        intercomRootActivityArgs.getClass();
        cls.getClass();
        Intent intent = new Intent(context, cls);
        Bundle bundle = new Bundle();
        bundle.putParcelable(BUNDLE_ARGS, intercomRootActivityArgs);
        intent.putExtra(BUNDLE, bundle);
        if (num != null) {
            intent.setFlags(num.intValue());
        }
        return intent;
    }

    public static /* synthetic */ Intent getIntentForArgs$default(Context context, IntercomRootActivityArgs intercomRootActivityArgs, Class cls, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            cls = IntercomRootActivity.class;
        }
        if ((i & 8) != 0) {
            num = 268435456;
        }
        return getIntentForArgs(context, intercomRootActivityArgs, cls, num);
    }
}
