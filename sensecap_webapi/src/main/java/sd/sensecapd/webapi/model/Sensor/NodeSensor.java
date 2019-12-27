package sd.sensecapd.webapi.model.Sensor;

import java.util.ArrayList;
import java.util.List;

/*
 * sensor node
 * (retrieved from the web and saved to DB)
 * */
public class NodeSensor {
    //Unique identification, generated by database
    private int id;
    //device eui, get from the web and saved to DB
    private String dev_eui;
    //sensor eui, get from the web and saved to DB
    private String sensor_eui;
    //sensor channel, get from the web and saved to DB
    private int sensor_channel;
    //measures, get from the web and saved to DB
    private List<NodeSensorMeasure> sensor_measures;

    public void addSensorMeasure(NodeSensorMeasure measure) {
        if (sensor_measures == null) {
            sensor_measures = new ArrayList<NodeSensorMeasure>();
        }
        sensor_measures.add(measure);
    }

    public NodeSensorMeasure getSensorMeasure(int index) {
        if (index > -1 && index < sensor_measures.size()) {
            return sensor_measures.get(index);
        }
        return null;
    }

    public int getSensorMeasureCount() {
        return (sensor_measures == null ? 0 : sensor_measures.size());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDev_eui() {
        return dev_eui;
    }

    public void setDev_eui(String dev_eui) {
        this.dev_eui = dev_eui;
    }

    public String getSensor_eui() {
        return sensor_eui;
    }

    public void setSensor_eui(String sensor_eui) {
        this.sensor_eui = sensor_eui;
    }

    public int getSensor_channel() {
        return sensor_channel;
    }

    public void setSensor_channel(int sensor_channel) {
        this.sensor_channel = sensor_channel;
    }
}
