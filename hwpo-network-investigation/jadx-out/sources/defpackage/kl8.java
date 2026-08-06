package defpackage;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class kl8 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends kl8 {
        @Override // defpackage.kl8
        public final Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return ps2.a(method, cls, obj, objArr);
            }
            ru3.f("Calling default methods on API 24 and 25 is not supported");
            return null;
        }

        @Override // defpackage.kl8
        public final boolean c(Method method) {
            return method.isDefault();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends kl8 {
        @Override // defpackage.kl8
        public final String a(Method method, int i) {
            Parameter parameter = method.getParameters()[i];
            if (!parameter.isNamePresent()) {
                return super.a(method, i);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // defpackage.kl8
        public final Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return ps2.a(method, cls, obj, objArr);
        }

        @Override // defpackage.kl8
        public final boolean c(Method method) {
            return method.isDefault();
        }
    }

    public String a(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean c(Method method) {
        return false;
    }
}
