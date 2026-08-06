package defpackage;

import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import java.util.Locale;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class n2b implements KSerializer<UnitsNetworkEntity> {
    public static final n2b a = new n2b();
    public static final m98 b = od9.a("BenchmarkUnitNetworkEntity", j98.i.a);

    @Override // defpackage.sy2
    public final Object deserialize(Decoder decoder) {
        try {
            String upperCase = decoder.S().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return UnitsNetworkEntity.valueOf(upperCase);
        } catch (Exception unused) {
            return UnitsNetworkEntity.t;
        }
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, Object obj) {
        UnitsNetworkEntity unitsNetworkEntity = (UnitsNetworkEntity) obj;
        unitsNetworkEntity.getClass();
        encoder.D(unitsNetworkEntity.name());
    }
}
