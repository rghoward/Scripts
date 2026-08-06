package io.intercom.android.sdk.m5.navigation.transitions;

import android.os.Bundle;
import com.google.gson.Gson;
import defpackage.m77;
import defpackage.ty0;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TransitionStyleKt {
    private static final float PREDICTIVE_BACK_SCALE = 0.92f;
    private static final m77<TransitionArgs> TransitionArgNavType = new m77<TransitionArgs>() { // from class: io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt$TransitionArgNavType$1
        private final TransitionArgs toTransitionArgs(String str) {
            Object objFromJson = new Gson().fromJson(str, (Class<Object>) TransitionArgs.class);
            objFromJson.getClass();
            return (TransitionArgs) objFromJson;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.m77
        public TransitionArgs get(Bundle bundle, String str) {
            bundle.getClass();
            str.getClass();
            TransitionArgs transitionArgs = (TransitionArgs) ty0.a(bundle, str, TransitionArgs.class);
            return transitionArgs == null ? new TransitionArgs(null, null, null, null, 15, null) : transitionArgs;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.m77
        public TransitionArgs parseValue(String str) {
            str.getClass();
            return toTransitionArgs(str);
        }

        @Override // defpackage.m77
        public void put(Bundle bundle, String str, TransitionArgs transitionArgs) {
            bundle.getClass();
            str.getClass();
            transitionArgs.getClass();
            bundle.putParcelable(str, transitionArgs);
        }
    };

    public static final m77<TransitionArgs> getTransitionArgNavType() {
        return TransitionArgNavType;
    }
}
