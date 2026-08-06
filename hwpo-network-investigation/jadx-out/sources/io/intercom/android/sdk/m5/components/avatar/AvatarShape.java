package io.intercom.android.sdk.m5.components.avatar;

import defpackage.nl3;
import defpackage.ol3;
import defpackage.qq2;
import defpackage.w2a;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum AvatarShape {
    CIRCLE,
    SQUIRCLE;

    private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());
    public static final Companion Companion = new Companion(null);

    public static nl3<AvatarShape> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final AvatarShape fromName(String str) {
            AvatarShape next;
            str.getClass();
            Iterator<AvatarShape> it = AvatarShape.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!w2a.i(next.name(), str, true));
            AvatarShape avatarShape = next;
            return avatarShape == null ? AvatarShape.CIRCLE : avatarShape;
        }

        private Companion() {
        }
    }
}
