package domain.out;

import domain.train.TrainId;

public interface TrainDataClient {
    Topologie getTopology(TrainId trainId);
}