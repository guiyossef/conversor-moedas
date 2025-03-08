/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor.de.moedas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ApiRequest {
    
    

    public static double getExchangeRate(String moedaOrigem, String moedaDestino) {
        try {
            // Monta a URL com base nas moedas selecionadas
            String urlString = "https://economia.awesomeapi.com.br/json/last/" + moedaOrigem + "-" + moedaDestino;
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Lê a resposta da API
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder resposta = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                resposta.append(linha);
            }
            reader.close();

            // Converte a resposta JSON para um objeto
            JSONObject jsonObject = new JSONObject(resposta.toString());
            String chave = moedaOrigem + moedaDestino; // Exemplo: "USDBRL"
            return jsonObject.getJSONObject(chave).getDouble("bid");

        } catch (Exception e) {
            System.out.println("Erro ao buscar taxa de câmbio: " + e.getMessage());
            return -1; // Retorna -1 se houver erro
        }
    }
}