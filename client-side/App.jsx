const App = () => {
  const [results, setResults] = React.useState([]);
  const [loading, setLoading] = React.useState(false);
  const [error, setError] = React.useState(null);

  return (
    <div className="container">
      <h1 className="mt-3">Product Search App</h1>
      <SearchBar setResults={setResults} setLoading={setLoading} setError={setError} />
      {loading && <p>Loading...</p>}
      {error && <p className="text-danger">{error}</p>}
      <SearchResults results={results} />
    </div>
  );
};
