package io.intercom.android.sdk.m5.navigation.transitions;

import defpackage.dza;
import defpackage.et3;
import defpackage.nh3;
import defpackage.nl3;
import defpackage.o91;
import defpackage.ol3;
import defpackage.qq2;
import defpackage.sr9;
import defpackage.t39;
import defpackage.th3;
import defpackage.uh3;
import defpackage.xv;
import defpackage.xya;
import defpackage.zg3;
import defpackage.zva;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnterTransitionStyle {
    private static final /* synthetic */ nl3 $ENTRIES;
    private static final /* synthetic */ EnterTransitionStyle[] $VALUES;
    public static final EnterTransitionStyle SLIDE_UP = new SLIDE_UP("SLIDE_UP", 0);
    public static final EnterTransitionStyle SLIDE_IN_LEFT = new SLIDE_IN_LEFT("SLIDE_IN_LEFT", 1);
    public static final EnterTransitionStyle SLIDE_IN_RIGHT = new SLIDE_IN_RIGHT("SLIDE_IN_RIGHT", 2);
    public static final EnterTransitionStyle PEEK_BEHIND = new EnterTransitionStyle("PEEK_BEHIND", 3) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.PEEK_BEHIND
        {
            qq2 qq2Var = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public th3 transition() {
            return zg3.e(xv.c(0, 0, null, 7), 0.92f, 4);
        }
    };
    public static final EnterTransitionStyle NONE = new EnterTransitionStyle("NONE", 4) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NONE
        {
            qq2 qq2Var = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public th3 transition() {
            return th3.a;
        }
    };
    public static final EnterTransitionStyle NULL = new EnterTransitionStyle("NULL", 5) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NULL
        {
            qq2 qq2Var = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public th3 transition() {
            return null;
        }
    };

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SLIDE_IN_RIGHT extends EnterTransitionStyle {
        public SLIDE_IN_RIGHT(String str, int i) {
            super(str, i, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return -i;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public th3 transition() {
            xya xyaVarC = xv.c(0, 0, null, 7);
            b bVar = new b();
            dza dzaVar = zg3.a;
            return new uh3(new zva((et3) null, new sr9(xyaVarC, new nh3(bVar)), (o91) null, (t39) null, (LinkedHashMap) null, 125)).b(zg3.e(xv.c(0, 0, null, 7), 0.92f, 4));
        }
    }

    private static final /* synthetic */ EnterTransitionStyle[] $values() {
        return new EnterTransitionStyle[]{SLIDE_UP, SLIDE_IN_LEFT, SLIDE_IN_RIGHT, PEEK_BEHIND, NONE, NULL};
    }

    static {
        EnterTransitionStyle[] enterTransitionStyleArr$values = $values();
        $VALUES = enterTransitionStyleArr$values;
        $ENTRIES = ol3.b(enterTransitionStyleArr$values);
    }

    public /* synthetic */ EnterTransitionStyle(String str, int i, qq2 qq2Var) {
        this(str, i);
    }

    public static nl3<EnterTransitionStyle> getEntries() {
        return $ENTRIES;
    }

    public static EnterTransitionStyle valueOf(String str) {
        return (EnterTransitionStyle) Enum.valueOf(EnterTransitionStyle.class, str);
    }

    public static EnterTransitionStyle[] values() {
        return (EnterTransitionStyle[]) $VALUES.clone();
    }

    public abstract th3 transition();

    private EnterTransitionStyle(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SLIDE_IN_LEFT extends EnterTransitionStyle {
        public SLIDE_IN_LEFT(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public th3 transition() {
            xya xyaVarC = xv.c(0, 0, null, 7);
            a aVar = new a();
            dza dzaVar = zg3.a;
            return new uh3(new zva((et3) null, new sr9(xyaVarC, new nh3(aVar)), (o91) null, (t39) null, (LinkedHashMap) null, 125)).b(zg3.e(xv.c(0, 0, null, 7), 0.92f, 4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SLIDE_UP extends EnterTransitionStyle {
        public SLIDE_UP(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        public th3 transition() {
            return zg3.i(xv.c(0, 0, null, 7), new c());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return i;
        }
    }
}
